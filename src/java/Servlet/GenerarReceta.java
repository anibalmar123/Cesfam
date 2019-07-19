/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.tempuri.Service2;

/**
 *
 * @author anibal
 */
@WebServlet(name = "GenerarReceta", urlPatterns = {"/GenerarReceta"})
public class GenerarReceta extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8895/Service2.svc.singlewsdl.wsdl")
    private Service2 service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            int idTipoReceta = Integer.parseInt(request.getParameter("valor"));
            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            String fecha = sdf.format(cal.getTime());
            int idPaciente = Integer.parseInt(request.getParameter("idPaciente"));
            String diagnostico = request.getParameter("diagnostico");
            String duracion = request.getParameter("duracion");
            String dias = request.getParameter("dias");
            int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            int idProducto = Integer.parseInt(request.getParameter("txtProducto"));
            int cantidad = Integer.parseInt(request.getParameter("cantidad"));
            int horas = Integer.parseInt(request.getParameter("horas"));
            String unidadMedida = request.getParameter("unidadMedida");
            int mesesAnios = Integer.parseInt(request.getParameter("mesesAnios"));//si no se selecciona esta mal
            String estadoReceta = "Pendiente";
            
            
            
            
            Random rand = new Random();
            int idReceta = rand.nextInt(1000) + 1;
            
            int diasTotales;
            int cantidadTiempo;
            if(dias == null)
            {
                cantidadTiempo = Integer.parseInt(duracion);
                diasTotales = 30;//cambio si es prescripcion los diasTotales son 30
                
            }
            else
            {
                cantidadTiempo = Integer.parseInt(dias);
                diasTotales = Integer.parseInt(dias);
            }
            
            if(mesesAnios == 2)
            {
                
                cantidadTiempo = cantidadTiempo * 12;
            }
            else
            {
                cantidadTiempo = cantidadTiempo * 30;//el tiempo en meses
            }
            
            
            
            /******************Valores al arreglo**************************/
            
            /*String[] detalleReceta = new String[5];

            detalleReceta[0] = idProductoArreglo;
            detalleReceta[1] = cantidadArreglo;
            detalleReceta[2] = horasArreglo;
            detalleReceta[3] = diasArreglo;
            detalleReceta[4] = unidadMedidaArreglo;
            */
            
            String idProductoArreglo = String.valueOf(idProducto);
            String cantidadArreglo = String.valueOf(cantidad);
            String horasArreglo = String.valueOf(horas);
            String diasArreglo = String.valueOf(diasTotales);
            String unidadMedidaArreglo = unidadMedida;
            
            ArrayOfstring detalleReceta = new ArrayOfstring();
            detalleReceta.getString().add(idProductoArreglo+";"+cantidadArreglo+";"+horasArreglo+";"+diasArreglo+";"+unidadMedidaArreglo);
          
            
          
            boolean existe = this.ingresarReceta(idReceta, estadoReceta, fecha,idTipoReceta, idPaciente, diagnostico, cantidadTiempo, idUsuario, detalleReceta);
            
            if(existe){
               
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            else
            {
              
                request.getRequestDispatcher("/Error.jsp").forward(request, response);
            
            }
 
          
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private Boolean ingresarReceta(java.lang.Integer idReceta, java.lang.String estadoReceta, java.lang.String fechaReceta, java.lang.Integer idTipoReceta, java.lang.Integer idPaciente, java.lang.String diagnostico, java.lang.Integer cantidadTiempo, java.lang.Integer idUsuario, com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring detalleReceta) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
        return port.ingresarReceta(idReceta, estadoReceta, fechaReceta, idTipoReceta, idPaciente, diagnostico, cantidadTiempo, idUsuario, detalleReceta);
    }

 

}
