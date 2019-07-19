package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!--Importa un jstl-->\n");


    session.invalidate();
    //String error = request.getParameter("error");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"assets/js/select2/select2.full.min.js\"></script>\n");
      out.write("        <link href=\"assets/css/dataTables.bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/cesfam.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("        <title>Iniciar Sesi&oacute;n</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"loginImg\">\n");
      out.write("        <nav class=\"navbar navbar-default\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-left\" >\n");
      out.write("                    <img alt=\"Cesfam\" src=\"assets/img/cesfam.png\" height=90px\" width=\"90px\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-header navbar-left\" >\n");
      out.write("                    <a class=\"navbar-brand\">Cesfam Chile</a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-xs-12\">\n");
      out.write("                    <div class=\"widget\">\n");
      out.write("                        <div class=\"widgetbody\">\n");
      out.write("                            <div style=\"text-align: center\">\n");
      out.write("                                <form class=\"form-horizontal\" action=\"./ValidarLogin\" method=\"POST\" id=\"loginForm\">\n");
      out.write("                                    <h3 style=\"color: #FFF !important\">Iniciar <b>Sesión</b></h3>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"form-group \">\n");
      out.write("                                            <label class=\"control-label label-default col-md-5 login\">Nombre de Usuario</label>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <input type=\"email\" class=\"input-sm form-control\" placeholder=\"Correo Electrónico\" id=\"txtUsuario\" name=\"txtUsuario\" >\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"control-label label-default col-md-5 login\">Clave</label>\n");
      out.write("                                            <div class=\"col-md-3\">\n");
      out.write("                                                <input type=\"password\" class=\"input-sm form-control\" placeholder=\"Contraseña\" id=\"txtPass\" name=\"txtPass\" >\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"col-md-offset-2 col-md-8\">\n");
      out.write("                                                <!--<a type=\"submit\" href=\"index.jsp\" class=\"btn btn-success \">Ingresar <i class=\"fa fa-user\"></i></a>\n");
      out.write("                                                <!--<a type=\"button\" href=\"register.jsp\" class=\"btn btn-primary\">Registrar <i class=\"fa fa-user-plus\"></i></a>-->\n");
      out.write("                                                <button class=\"btn btn-success\" value=\"Index\" type=\"submit\">Ingresar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    <p class=\"col-md-4 col-md-offset-4 text-center bg-danger text-danger\" style=\"margin-top: 20px;\" id=\"errorLogin\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                     </p>\n");
      out.write("\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.js\"></script>\n");
      out.write("<script src=\"assets/js/validation/bootstrapValidator.js\"></script>\n");
      out.write("<script src=\"assets/js/datatable/jquery.dataTables.min.js\"></script>\n");
      out.write("<script src=\"assets/js/datatable/dataTables.tableTools.min.js\"></script>\n");
      out.write("<script src=\"assets/js/datatable/dataTables.bootstrap.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootbox/bootbox.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("    $('#loginForm').bootstrapValidator({\n");
      out.write("        message: 'El campo no es válido',\n");
      out.write("        feedbackIcons: {\n");
      out.write("            valid: 'glyphicon glyphicon-ok',\n");
      out.write("            invalid: 'glyphicon glyphicon-remove',\n");
      out.write("            validating: 'glyphicon glyphicon-refresh'\n");
      out.write("        },\n");
      out.write("        submitHandler: function (validator, form, submitButton) {\n");
      out.write("            // Do nothing\n");
      out.write("        },\n");
      out.write("        fields: {\n");
      out.write("            txtUsuario: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty: {\n");
      out.write("                        message: 'Nombre de Usuario es requerido'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            txtPass: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty: {\n");
      out.write("                        message: 'Contraseña es requerido'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    })\n");
      out.write("    .find('button[data-toggle]')\n");
      out.write("    .on('click', function () {\n");
      out.write("        var $target = $($(this).attr('data-toggle'));\n");
      out.write("        // Show or hide the additional fields\n");
      out.write("        // They will or will not be validated based on their visibilities\n");
      out.write("        $target.toggle();\n");
      out.write("        if (!$target.is(':visible')) {\n");
      out.write("            // Enable the submit buttons in case additional fields are not valid\n");
      out.write("            $('#loginForm').data('bootstrapValidator').disableSubmitButtons(false);\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write(" $('#loginForm').bootstrapValidator({\n");
      out.write("        message: 'El campo no es válido',\n");
      out.write("        feedbackIcons: {\n");
      out.write("            valid: 'glyphicon glyphicon-ok',\n");
      out.write("            invalid: 'glyphicon glyphicon-remove',\n");
      out.write("            validating: 'glyphicon glyphicon-refresh'\n");
      out.write("        },\n");
      out.write("        submitHandler: function (validator, form, submitButton) {\n");
      out.write("            // Do nothing\n");
      out.write("        },\n");
      out.write("        fields: {\n");
      out.write("            txtUsuario: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty: {\n");
      out.write("                        message: 'Nombre de Usuario es requerido'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            },\n");
      out.write("            txtPass: {\n");
      out.write("                validators: {\n");
      out.write("                    notEmpty: {\n");
      out.write("                        message: 'Contraseña es requerido'\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errorMessage}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                           ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errorMessage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
