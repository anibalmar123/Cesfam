/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfProductoProductoPorCategoriaActiva;
import org.datacontract.schemas._2004._07.cesfamnegocio.ProductoProductoPorCategoriaActiva;
import org.tempuri.ObtenerStockActual;
import org.tempuri.Service2;

/**
 *
 * @author anibal
 */
@WebServlet(name = "ControladorNewAtention", urlPatterns = {"/ControladorNewAtention"})
public class ControladorNewAtention extends HttpServlet {

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
            
            
        int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));
        
        ProductoProductoPorCategoriaActiva pro = new ProductoProductoPorCategoriaActiva();
        
        
        
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < this.listarProductosPorCategoriaActiva(idCategoria).getProductoProductoPorCategoriaActiva().size(); i++){
            
            pro.setIdProducto(this.listarProductosPorCategoriaActiva(idCategoria).getProductoProductoPorCategoriaActiva().get(i).getIdProducto());
            pro.setNombreProducto(this.listarProductosPorCategoriaActiva(idCategoria).getProductoProductoPorCategoriaActiva().get(i).getNombreProducto());
            pro.setGramaje(this.listarProductosPorCategoriaActiva(idCategoria).getProductoProductoPorCategoriaActiva().get(i).getGramaje());
            pro.setUnidadMedida(this.listarProductosPorCategoriaActiva(idCategoria).getProductoProductoPorCategoriaActiva().get(i).getUnidadMedida());
            sb.append(pro.getIdProducto().intValue() + "-" + pro.getNombreProducto().getValue()+ "-" + pro.getGramaje().intValue()+ "-"+ pro.getUnidadMedida().getValue()+ ":");
            
        }
        
        
        out.write(sb.toString());
        
            
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
        PrintWriter out = response.getWriter();
        
        
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

    private ArrayOfProductoProductoPorCategoriaActiva listarProductosPorCategoriaActiva(java.lang.Integer idCategoriaJava) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
        return port.listarProductosPorCategoriaActiva(idCategoriaJava);
    }


}
