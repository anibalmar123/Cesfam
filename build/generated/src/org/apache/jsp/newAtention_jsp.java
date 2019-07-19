package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.datacontract.schemas._2004._07.cesfamnegocio.Usuario;
import org.datacontract.schemas._2004._07.cesfamnegocio.Paciente;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class newAtention_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("<!--Importa un jstl-->\n");

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
      out.write("        <title>Registrar Nueva Atenci&oacute;n</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-left\" >\n");
      out.write("                    <img alt=\"Cesfam\" src=\"assets/img/cesfam.png\" height=90px\" width=\"90px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-header navbar-left\" >\n");
      out.write("                    <a class=\"navbar-brand\">Cesfam Chile</a>\n");
      out.write("                    <a class=\"navbar-brand\">");
      out.print(usuario.getNombreUsuario().getValue());
      out.write("</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"index.jsp\">Inicio<span class=\"sr-only\"></span></a></li>\n");
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
      out.write("                        <li><a href=\"login.jsp\">Cerrar Sesion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Nueva Atenci&oacute;n M&eacute;dica</h1>\n");
      out.write("            <form name=\"form\" id=\"form\" action=\"./GenerarReceta\" method=\"POST\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-md-12\">\n");
      out.write("                    <div class=\"widget\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">IdPaciente</label>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"text\" class=\"input-sm form-control\" name=\"idPaciente\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">Nombre</label>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"text\" class=\"input-sm form-control\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">Apellido Paterno</label>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"text\" class=\"input-sm form-control\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">Apellido Materno</label>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"text\" class=\"input-sm form-control\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">Rut</label>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"text\" class=\"input-sm form-control\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">Fecha de Nacimiento</label>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"text\" class=\"input-sm form-control\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_5(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"control-label label-default col-md-3\">Correo</label>\n");
      out.write("                                    <div class=\"col-md-5\">\n");
      out.write("                                        <input type=\"email\" class=\"input-sm form-control\" readonly=\"true\" value=\"");
      if (_jspx_meth_c_out_6(_jspx_page_context))
        return;
      out.write("\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-horizontal\">\n");
      out.write("                                \n");
      out.write("                                    <h3>Generar Nueva Receta</h3>\n");
      out.write("                                     <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Tipo</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <div class=\"radio\">\n");
      out.write("                                                <label><input type=\"radio\" id=\"prescripcion\" name=\"valor\" value=\"1\">Prescripci&oacute;n</label>\n");
      out.write("                                          \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <div class=\"radio\">\n");
      out.write("                                                <label><input type=\"radio\" id=\"receta\" name=\"valor\" value=\"2\">Receta</label>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write(" \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Cat. Producto</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <select id=\"categoria\" name=\"txtCategoria\" >\n");
      out.write("                                                <option value=\"\"> - Seleccione - </option>\n");
      out.write("                                                    \n");
      out.write("                                            ");
      out.write("<hr/>\n");
      out.write("    ");

    try {
	org.tempuri.Service2 service = new org.tempuri.Service2();
	org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
	// TODO process result here
	org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfCategoria result = port.listarCategoriaAct();
	
        for(int i = 0; i < result.getCategoria().size(); i++)
        {
            
      out.write("\n");
      out.write("            \n");
      out.write("            <option value=\"");
      out.print(result.getCategoria().get(i).getIdCategoria().intValue());
      out.write('"');
      out.write('>');
      out.print(result.getCategoria().get(i).getNombreCategoria().getValue());
      out.write("</option>\n");
      out.write("            \n");
      out.write("       ");
 }
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println(ex.toString()); 
    }
    
      out.write("\n");
      out.write("    ");
      out.write("<hr/>\n");
      out.write("\n");
      out.write("                                        \n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("             \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Producto</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <select id=\"producto\" name=\"txtProducto\">\n");
      out.write("                                               <option selected=\"selected\">--Seleccione un producto--</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Stock disponible</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <input type=\"text\" class=\"input-sm form-control\" id=\"stock\" readonly=\"true\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Cantidad</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <input type=\"number\" class=\"input-sm form-control\" min=\"1\"  id=\"cantidad\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Horas</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <input type=\"number\" class=\"input-sm form-control\" min=\"1\" id=\"horas\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">D&iacute;as</label>\n");
      out.write("                                        <div class=\"col-md-3\">\n");
      out.write("                                            <input type=\"number\" class=\"input-sm form-control\" id=\"dias\" min=\"1\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-md-offset-3 col-md-10\">\n");
      out.write("                                            <a id=\"agregar\" class=\"btn btn-info\">Agregar Producto <i class=\"fa fa-plus\"></i></a>\n");
      out.write("                                            <!--<button type=\"reset\" class=\"btn btn-info\">Limpiar </button>-->\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Diagnostico</label>\n");
      out.write("                                        <div class=\"col-md-8\">\n");
      out.write("                                            <textarea type=\"text\" class=\"form-control\" rows=\"6\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"control-label label-default col-md-3\">Duraci&oacute;n</label>\n");
      out.write("                                        <div class=\"col-md-2\">\n");
      out.write("                                            <input type=\"number\" class=\"input-sm form-control\" id=\"duracion\" min=\"1\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-2\">\n");
      out.write("                                            <select id=\"mesesAnios\">\n");
      out.write("                                                <option selected=\"selected\">Meses/A&ntilde;o</option>\n");
      out.write("                                                <option>Meses</option>\n");
      out.write("                                                <option>A&ntilde;o</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-md-12\">\n");
      out.write("                    <table class=\"table table-striped table-hover table-bordered\" id=\"editabledatatable\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Categor&iacute;a Producto</th>\n");
      out.write("                                    <th>Nombre Producto</th>\n");
      out.write("                                    <th>Cantidad</th>\n");
      out.write("                                    <th>Horas</th>\n");
      out.write("                                    <th>D&iacute;as</th>\n");
      out.write("                                    <th>Acciones</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><input type=\"text\" id=\"categoriaSeleccionada\" readonly=\"\"></td>\n");
      out.write("                                    <td><input type=\"text\" id=\"nombreProductoSeleccionado\" readonly=\"\"></td>\n");
      out.write("                                    <td><input type=\"text\" id=\"cantidadSeleccionada\" readonly=\"\"></td>\n");
      out.write("                                    <td><input type=\"text\" id=\"horasSeleccionadas\" readonly=\"\"></td>\n");
      out.write("                                    <td><input type=\"text\" id=\"diasSeleccionados\" readonly=\"\"></td>\n");
      out.write("                                    <td><a id=\"eliminarFila\" class=\"btn btn-danger\"> Eliminar <i class=\"fa fa-trash\"></i></a></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-offset-5 col-md-10\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-warning\">Generar Receta</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("        </div> \n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("    <script src=\"assets/js/datatable/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/datatable/dataTables.tableTools.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/datatable/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootbox/bootbox.js\"></script>\n");
      out.write("    <script>  \n");
      out.write("        $(document).ready(function() {\n");
      out.write("        $('#editabledatatable').dataTable();\n");
      out.write("        \n");
      out.write("        $(\"#prescripcion\").click(function() {  \n");
      out.write("            if($(\"#prescripcion\").is(':checked')) {  \n");
      out.write("                $('#dias').prop('disabled', true);\n");
      out.write("                $('#duracion').prop('disabled', false);\n");
      out.write("                $('#mesesAnios').prop('disabled', false);\n");
      out.write("            } \n");
      out.write("        });  \n");
      out.write("        \n");
      out.write("        $(\"#eliminarFila\").click(function(){\n");
      out.write("           \n");
      out.write("           $(\"#categoriaSeleccionada\").val('');\n");
      out.write("           $(\"#nombreProductoSeleccionado\").val('');\n");
      out.write("           $(\"#cantidadSeleccionada\").val('');\n");
      out.write("           $(\"#horasSeleccionadas\").val('');\n");
      out.write("           $(\"#diasSeleccionados\").val('');\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $(\"#agregar\").click(function(){\n");
      out.write("            \n");
      out.write("            $(\"#categoriaSeleccionada\").val($(\"#categoria\").find('option:selected').text());\n");
      out.write("            $(\"#nombreProductoSeleccionado\").val($(\"#producto\").find('option:selected').text());\n");
      out.write("            $(\"#cantidadSeleccionada\").val($(\"#cantidad\").val());\n");
      out.write("            $(\"#horasSeleccionadas\").val($(\"#horas\").val());\n");
      out.write("            $(\"#diasSeleccionados\").val($(\"#dias\").val());\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $(\"#receta\").click(function() {  \n");
      out.write("            if($(\"#receta\").is(':checked')) {  \n");
      out.write("                $('#dias').prop('disabled', false);\n");
      out.write("                $('#duracion').prop('disabled', true);\n");
      out.write("                $('#mesesAnios').prop('disabled', true);\n");
      out.write("            } \n");
      out.write("        }); \n");
      out.write("        \n");
      out.write("        $('#producto').on('change', function(){\n");
      out.write("            $.ajax({\n");
      out.write("                  url: 'VerStockProducto',\n");
      out.write("                  type: 'POST',\n");
      out.write("                  data: 'idProducto='+$('#producto').val(),\n");
      out.write("                  success: function(data){\n");
      out.write("                      \n");
      out.write("                      $('#stock').val(data);\n");
      out.write("                  }\n");
      out.write("              });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        $('#categoria').on('change', function(){\n");
      out.write("               $.ajax({\n");
      out.write("                  url: 'ControladorNewAtention',\n");
      out.write("                  type: 'POST',\n");
      out.write("                  data: 'idCategoria='+$('#categoria').val(),\n");
      out.write("                  success: function(data){\n");
      out.write("                      puntos = data.split(\":\");\n");
      out.write("                    limparselect();\n");
      out.write("                    if(data == '')\n");
      out.write("                        $('#producto').append('<option>Selecciona una categoria</option>');\n");
      out.write("                    else{\n");
      out.write("                       \n");
      out.write("                        for(var i = 0; i < puntos.length - 1; i++){\n");
      out.write("                            var idProducto = puntos[i].split(\"-\")[0]; \n");
      out.write("                            var nombreProducto = puntos[i].split(\"-\")[1];\n");
      out.write("                            $('#producto').append('<option value =\"'+idProducto+'\">'+nombreProducto+'</option>');\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                    \n");
      out.write("                  },\n");
      out.write("\n");
      out.write("                  error: function(data){\n");
      out.write("                    alert(data);\n");
      out.write("                    alert('Error occur....!!');\n");
      out.write("                  }\n");
      out.write("              });\n");
      out.write("              \n");
      out.write("              function limparselect(){\n");
      out.write("                $('#producto option').remove();\n");
      out.write("                }\n");
      out.write("          });\n");
      out.write("          \n");
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
      out.write("        }();\n");
      out.write("\n");
      out.write("            \n");
      out.write("    InitiateEditableDataTable.init(); \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("        \n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paciente.getIdPaciente().intValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paciente.getNombre().getValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paciente.getApellidoPaterno().getValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paciente.getApellidoMaterno().getValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paciente.getRut().getValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent(null);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fechaNacimiento}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent(null);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${paciente.getCorreo().getValue()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }
}
