/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPaciente;
import org.datacontract.schemas._2004._07.cesfamnegocio.Paciente;
import org.tempuri.Service2;

/**
 *
 * @author anibal
 */
@WebServlet(name = "EditarPaciente", urlPatterns = {"/EditarPaciente"})
public class EditarPaciente extends HttpServlet {

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
            
            int idPaciente = Integer.parseInt(request.getParameter("param1"));
            Paciente pac = new Paciente();
            Calendar calendar;
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            
            for(int i = 0; i < this.listarPacientesPorId(idPaciente).getPaciente().size(); i++)
            {
                pac.setIdPaciente(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getIdPaciente());
                pac.setCodigoLibreta(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getCodigoLibreta());
                pac.setNombre(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getNombre());
                pac.setApellidoPaterno(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getApellidoPaterno());
                pac.setApellidoMaterno(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getApellidoMaterno());
                pac.setRut(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getRut());
                pac.setFechaNacimiento(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getFechaNacimiento());
                pac.setCorreo(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getCorreo());
                pac.setDireccion(this.listarPacientesPorId(idPaciente).getPaciente().get(i).getDireccion());
                
            }
            
            calendar = pac.getFechaNacimiento().toGregorianCalendar();
            formatter.setTimeZone(calendar.getTimeZone());
            String dateString = formatter.format(calendar.getTime());
            
            request.setAttribute("fechaNacimiento", dateString);
            request.setAttribute("paciente", pac);
            request.getRequestDispatcher("/editPatient.jsp").forward(request, response);
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

    private ArrayOfPaciente listarPacientesPorId(java.lang.Integer idPaciente) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
        return port.listarPacientesPorId(idPaciente);
    }



}
