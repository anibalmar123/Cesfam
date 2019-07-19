<%-- 
    Document   : index
    Created on : 10-jun-2017, 22:58:16
    Author     : Test
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!--Importa un jstl-->
<%

    session.invalidate();
    //String error = request.getParameter("error");
%>

<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="assets/js/select2/select2.full.min.js"></script>
        <link href="assets/css/dataTables.bootstrap.css" rel="stylesheet" />
        <link href="assets/css/cesfam.css" rel="stylesheet" />
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <title>Iniciar Sesi&oacute;n</title>
    </head>
    <body>
    <div class="loginImg">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-left" >
                    <img alt="Cesfam" src="assets/img/cesfam.png" height=90px" width="90px">
                </div>
                <div class="navbar-header navbar-left" >
                    <a class="navbar-brand">Cesfam Chile</a>
                </div>
                
            </div>
        </nav>
        <div class="container" >
            <div class="row">
                <div class="col-lg-12 col-md-12 col-xs-12">
                    <div class="widget">
                        <div class="widgetbody">
                            <div style="text-align: center">
                                <form class="form-horizontal" action="./ValidarLogin" method="POST" id="loginForm">
                                    <h3 style="color: #FFF !important">Iniciar <b>Sesión</b></h3>
                                    <div>
                                        <div class="form-group ">
                                            <label class="control-label label-default col-md-5 login">Nombre de Usuario</label>
                                            <div class="col-md-3">
                                                <input type="email" class="input-sm form-control" placeholder="Correo Electrónico" id="txtUsuario" name="txtUsuario" >
                                            </div>
                                        </div>
                                    </div>
                                        <div class="form-group">
                                            <label class="control-label label-default col-md-5 login">Clave</label>
                                            <div class="col-md-3">
                                                <input type="password" class="input-sm form-control" placeholder="Contraseña" id="txtPass" name="txtPass" >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-md-offset-2 col-md-8">
                                                <!--<a type="submit" href="index.jsp" class="btn btn-success ">Ingresar <i class="fa fa-user"></i></a>
                                                <!--<a type="button" href="register.jsp" class="btn btn-primary">Registrar <i class="fa fa-user-plus"></i></a>-->
                                                <button class="btn btn-success" value="Index" type="submit">Ingresar</button>
                                            </div>
                                        </div>

                                    <p class="col-md-4 col-md-offset-4 text-center bg-danger text-danger" style="margin-top: 20px;" id="errorLogin">
                                        <c:if test="${not empty errorMessage}">
                                           <c:out value="${errorMessage}"/>
                                        </c:if>
                                     </p>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        </div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/validation/bootstrapValidator.js"></script>
<script src="assets/js/datatable/jquery.dataTables.min.js"></script>
<script src="assets/js/datatable/dataTables.tableTools.min.js"></script>
<script src="assets/js/datatable/dataTables.bootstrap.min.js"></script>
<script src="assets/js/bootbox/bootbox.js"></script>
<script>
    $(document).ready(function () {
    $('#loginForm').bootstrapValidator({
        message: 'El campo no es válido',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        submitHandler: function (validator, form, submitButton) {
            // Do nothing
        },
        fields: {
            txtUsuario: {
                validators: {
                    notEmpty: {
                        message: 'Nombre de Usuario es requerido'
                    }
                }
            },
            txtPass: {
                validators: {
                    notEmpty: {
                        message: 'Contraseña es requerido'
                    }
                }
            }
        }
    })
    .find('button[data-toggle]')
    .on('click', function () {
        var $target = $($(this).attr('data-toggle'));
        // Show or hide the additional fields
        // They will or will not be validated based on their visibilities
        $target.toggle();
        if (!$target.is(':visible')) {
            // Enable the submit buttons in case additional fields are not valid
            $('#loginForm').data('bootstrapValidator').disableSubmitButtons(false);
        }
    });
});

 $('#loginForm').bootstrapValidator({
        message: 'El campo no es válido',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        submitHandler: function (validator, form, submitButton) {
            // Do nothing
        },
        fields: {
            txtUsuario: {
                validators: {
                    notEmpty: {
                        message: 'Nombre de Usuario es requerido'
                    }
                }
            },
            txtPass: {
                validators: {
                    notEmpty: {
                        message: 'Contraseña es requerido'
                    }
                }
            }
        }
    });
</script>
    </body>

    
</html>
