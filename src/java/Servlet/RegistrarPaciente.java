/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Modelo.SessionIdentifierGenerator;
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
@WebServlet(name = "RegistrarPaciente", urlPatterns = {"/RegistrarPaciente"})
public class RegistrarPaciente extends HttpServlet {

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
            
            Random rand = new Random();
             int  n = rand.nextInt(1000) + 1;
             
             SessionIdentifierGenerator libretaRandom = new SessionIdentifierGenerator();
             String codigoLibreta = libretaRandom.nextSessionId().substring(0, 10);
            
            String rut = request.getParameter("rut");
            String nombre = request.getParameter("nombre");
            String apellidoPaterno = request.getParameter("apellidoPaterno");
            String apellidoMaterno = request.getParameter("apellidoMaterno");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            String correo = request.getParameter("correo");
            String direccion = request.getParameter("direccion");
            
            if(this.crearPaciente(n, fechaNacimiento, nombre, apellidoPaterno, apellidoMaterno, correo, codigoLibreta, rut, direccion))
            {
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("/registerPatient.jsp").forward(request, response);
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

    private Boolean crearPaciente(java.lang.Integer idPaciente, java.lang.String fechaNacimiento, java.lang.String nombre, java.lang.String apPaterno, java.lang.String apMaterno, java.lang.String correo, java.lang.String codigoLibreta, java.lang.String rut, java.lang.String direccion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
        return port.crearPaciente(idPaciente, fechaNacimiento, nombre, apPaterno, apMaterno, correo, codigoLibreta, rut, direccion);
    }

}
