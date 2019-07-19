/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
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
@WebServlet(name = "RegistrarTutor", urlPatterns = {"/RegistrarTutor"})
public class RegistrarTutor extends HttpServlet {

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
            
            Random rand = new Random();
            int  idRelacion = rand.nextInt(1000) + 1;
            int idTutor = rand.nextInt(1000) + 1;
            
            int idPaciente = Integer.parseInt(request.getParameter("paciente"));
            String rut = request.getParameter("rut");
            String nombre = request.getParameter("nombre");
            String apPaterno = request.getParameter("apellidoPaterno");
            String apMaterno = request.getParameter("apellidoMaterno");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            String correo = request.getParameter("correo");
            String parentesco = request.getParameter("parentesco");
            
            
            
            if(this.crearTutor(idTutor, fechaNacimiento, nombre, apMaterno, apPaterno,correo, parentesco))
            {
                if(this.crearRelacionPacienteTutor(idRelacion, idPaciente, idTutor))
                {
                    request.getRequestDispatcher("/tutorList.jsp").forward(request, response);
                }
                else
                {
                    request.getRequestDispatcher("/Error.jsp").forward(request, response);
                }
                    
            }
            else
            {
                request.getRequestDispatcher("/Error.jsp").forward(request, response);
            }
                    
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarTutor</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> idPaciente " + idPaciente + "</h1>");
            out.println("<h1> rut " + rut + "</h1>");
            out.println("<h1> nombre " + nombre + "</h1>");
            out.println("<h1> apellido paterno " + apPaterno + "</h1>");
            out.println("<h1> ap materno " + apMaterno + "</h1>");
            out.println("<h1> fecha nac " + fechaNacimiento + "</h1>");
            out.println("<h1> correo " + correo + "</h1>");
            out.println("<h1> parentesco " + parentesco + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

    private Boolean crearTutor(java.lang.Integer idTutor, java.lang.String fechaNacimiento, java.lang.String nombre, java.lang.String apPaterno, java.lang.String apMaterno, java.lang.String correo, java.lang.String parentesco) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
        return port.crearTutor(idTutor, fechaNacimiento, nombre, apPaterno, apMaterno, correo, parentesco);
    }

    private Boolean crearRelacionPacienteTutor(java.lang.Integer idRelacion, java.lang.Integer idPaciente, java.lang.Integer idTutor) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
        return port.crearRelacionPacienteTutor(idRelacion, idPaciente, idTutor);
    }

}
