package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.datacontract.schemas._2004._07.cesfamnegocio.Usuario;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Importa un jstl-->\n");
      out.write("\n");

    Usuario usuario = (Usuario) session.getAttribute("usuario");
    

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/dataTables.bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/cesfam.css\" rel=\"stylesheet\" />  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("               <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-left\" >\n");
      out.write("                    <img alt=\"Cesfam\" src=\"assets/img/cesfam.png\" height=90px\" width=\"90px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-header navbar-left\" >\n");
      out.write("                    <a class=\"navbar-brand\">Cesfam Chile</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li class=\"active\"><a href=\"index.jsp\">Inicio<span class=\"sr-only\"></span></a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Paciente <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"registerPatient.jsp\">Registrar Paciente</a></li>\n");
      out.write("                                <li><a href=\"patientList.jsp\">Listar Pacientes</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Tutor <span class=\"caret\"></span></a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"registerTutor.jsp\">Registrar Tutor</a></li>\n");
      out.write("                                <li><a href=\"tutorList.jsp\">Listar Tutores</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"login.jsp\">");
      out.print(usuario.getNombreUsuario().getValue());
      out.write(" <br>Cerrar Sesion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-xs-12\">\n");
      out.write("                    <h3>Listado de <b>Pacientes</b></h3>\n");
      out.write("                    <div class=\"table-toolbar\">\n");
      out.write("                        <!--<div class=\"form-group\">\n");
      out.write("                            <label class=\"control-label label-default col-md-3\">Ingresar Rut de Paciente</label>\n");
      out.write("                            <div class=\"col-md-2\">\n");
      out.write("                                <input type=\"text\" class=\"input-sm form-control\" >\n");
      out.write("                            </div>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-primary\">Buscar Paciente</button>\n");
      out.write("                        </div>-->\n");
      out.write("                    </div>\n");
      out.write("                    <table class=\"table table-striped table-hover table-bordered\" id=\"editabledatatable\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>C&oacute;digo de Libreta</th>\n");
      out.write("                                    <th>Nombre</th>\n");
      out.write("                                    <th>Rut Paciente</th>\n");
      out.write("                                    <th>Dirección</th>\n");
      out.write("                                    <!--<th>Fecha &Uacute;ltima Receta</th>-->\n");
      out.write("                                    <th>Acciones</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>    \n");
      out.write("                                \n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

    try {
	org.tempuri.Service2 service = new org.tempuri.Service2();
	org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
	// TODO process result here
	org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPaciente result = port.listarPacientes();
	//out.println("Result = "+result);
        
         for(int i = 0; i < result.getPaciente().size(); i++)
             
        {
      out.write("\n");
      out.write("        \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(result.getPaciente().get(i).getCodigoLibreta().getValue());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(result.getPaciente().get(i).getNombre().getValue()+" "+result.getPaciente().get(i).getApellidoPaterno().getValue()+" "+result.getPaciente().get(i).getApellidoMaterno().getValue());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(result.getPaciente().get(i).getRut().getValue());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(result.getPaciente().get(i).getDireccion().getValue());
      out.write("</td>\n");
      out.write("                                    <td><a href=\"./NuevaConsulta?param1=");
      out.print(result.getPaciente().get(i).getIdPaciente().intValue());
      out.write("\" class=\"btn btn-info\"> Nueva Consulta <i class=\"fa fa-file-o\"></i></a></td>\n");
      out.write("                                </tr>\n");
      out.write("      \n");
      out.write("        ");
}
        
    } catch (Exception ex) {
	
        ex.toString();
    }
    
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("        <div class=\"col-md-6\" style=\"text-align: center !important; padding-top: 3px !important; padding-left: 20px !important\">\n");
      out.write("            CESFAM Chile, Sistema de entrega de prescripciones m&eacute;dicas<br>\n");
      out.write("            Desarrollado por Bitealo S.A.\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <div class=\"imgFooter\">\n");
      out.write("            <img src=\"assets/img/duocFooter.png\" height=\"50px\" width=\"130px\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"assets/js/datatable/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/datatable/dataTables.tableTools.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/datatable/dataTables.bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootbox/bootbox.js\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("        $('#editabledatatable').dataTable();\n");
      out.write("    } );\n");
      out.write("    \n");
      out.write("    var InitiateEditableDataTable = function () {\n");
      out.write("        return {\n");
      out.write("            init: function () {\n");
      out.write("                //Datatable Initiating\n");
      out.write("                var oTable = $('#editabledatatable').dataTable({\n");
      out.write("                    \"aLengthMenu\": [\n");
      out.write("                        [5, 15, 50],\n");
      out.write("                        [5, 15, 50, \"Todos\"]\n");
      out.write("                    ],\n");
      out.write("                    \"iDisplayLength\": 50,\n");
      out.write("                    \"sPaginationType\": \"bootstrap\",\n");
      out.write("                    \"sDom\": \"Tflt<'DTTTFooter'<'col-sm-6'i><'col-sm-6'p>>\",\n");
      out.write("                    \"dom\": 'Bfrtip',\n");
      out.write("                    \"oTableTools\": {\n");
      out.write("                        \"aButtons\": [\n");
      out.write("                             {\n");
      out.write("                                 \"sExtends\": \"copy\",\n");
      out.write("                                 \"sButtonText\": \"Copiar\"\n");
      out.write("                             },\n");
      out.write("                        ],\n");
      out.write("                    },\n");
      out.write("                    \"language\": {\n");
      out.write("                        \"sInfo\": \"Mostrando _START_ a _END_ de _TOTAL_ registros\",\n");
      out.write("                        \"search\": \"\",\n");
      out.write("                        \"sLengthMenu\": \"_MENU_\",\n");
      out.write("                        \"oPaginate\": {\n");
      out.write("                            \"sPrevious\": \"Anterior\",\n");
      out.write("                            \"sNext\": \"Siguiente\"\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    \"aoColumns\": [\n");
      out.write("\n");
      out.write("                        { \"bSortable\": true },\n");
      out.write("                        { \"bSortable\": true },\n");
      out.write("                        { \"bSortable\": true },\n");
      out.write("                        { \"bSortable\": true },\n");
      out.write("                        { \"bSortable\": true }\n");
      out.write("\n");
      out.write("                    ]\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('#editabledatatable').on(\"click\", '.delete-confirm', function (e) {\n");
      out.write("                    var xChildKey = $(this).parents('tr')[0].id;\n");
      out.write("                    var nRow = $(this).parents('tr')[0];\n");
      out.write("\n");
      out.write("                    var _this = this;\n");
      out.write("                    var opsConfirm = jsCore.bootBoxConfirmDeleteOptions;\n");
      out.write("                    opsConfirm.message = \"¿Desea eliminar este registro?\";\n");
      out.write("                    opsConfirm.buttons.success.callback = function () {\n");
      out.write("\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: '@url/DeleteAjax/' + xChildKey,\n");
      out.write("                                type: 'post',\n");
      out.write("                                dataType: \"html\",\n");
      out.write("                                async: false,\n");
      out.write("                                success: function (_result) {\n");
      out.write("                                    var _objr = JSON.parse(_result);\n");
      out.write("                                    switch (_objr.Flag) {\n");
      out.write("                                        case jsCore.FlagError:\n");
      out.write("                                            //jsCore.showErrorModal(\"Error\", _objr.ErrorDescription);\n");
      out.write("                                            $(document).ready(function () {\n");
      out.write("                                                Notify('Un error ocurrió en el sistema', 'bottom-right', '10000', 'danger', 'fa-times', true);\n");
      out.write("                                            });\n");
      out.write("                                            break;\n");
      out.write("                                        case jsCore.FlagOK:\n");
      out.write("                                            var oTable = $('#editabledatatable').dataTable()\n");
      out.write("                                            oTable.fnDeleteRow(nRow);\n");
      out.write("                                            jsCore.showSuccessModal(\"Eliminado\", \"El registro fue eliminado con éxito\");\n");
      out.write("                                            break;\n");
      out.write("                                        default:\n");
      out.write("                                            break;\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                        };\n");
      out.write("                        bootbox.dialog(opsConfirm);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            };\n");
      out.write("        }();   \n");
      out.write("    InitiateEditableDataTable.init(); \n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
