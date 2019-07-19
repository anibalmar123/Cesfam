<%-- 
    Document   : editPatient
    Created on : 17-jun-2017, 18:51:43
    Author     : Test
--%>

<%@page import="org.datacontract.schemas._2004._07.cesfamnegocio.Usuario"%>
<%@page import="org.datacontract.schemas._2004._07.cesfamnegocio.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!--Importa un jstl-->
<%
    Usuario usuario = (Usuario) session.getAttribute("usuario");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="assets/css/bootstrap.css" rel="stylesheet" />
        <link href="assets/css/dataTables.bootstrap.css" rel="stylesheet" />
        <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <link href="assets/css/cesfam.css" rel="stylesheet" />  
        <title>Modificar Paciente</title>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-left" >
                    <img alt="Cesfam" src="assets/img/cesfam.png" height=90px" width="90px">
                </div>
                <div class="navbar-header navbar-left" >
                    <a class="navbar-brand">Cesfam Chile</a>
                    <a class="navbar-brand"><%=usuario.getNombreUsuario().getValue()%></a>
                </div>
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="index.jsp">Inicio<span class="sr-only"></span></a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Paciente <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="registerPatient.jsp">Registrar Paciente</a></li>
                                <li><a href="patientList.jsp">Listar Pacientes</a></li>
                            </ul>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Tutor <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="registerTutor.jsp">Registrar Tutor</a></li>
                                <li><a href="tutorList.jsp">Listar Tutores</a></li>
                            </ul>
                        </li>
                        <li><a href="login.jsp"><%=usuario.getNombreUsuario().getValue()%> <br>Cerrar Sesion</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <div class="row">
                <div class="col-md-12 col-xs-12">
                    <div class="widget">
                        <div class="widgetbody">
                            <h3>Editar <b>Paciente</b></h3>
                            <form class="form-horizontal " action="./GuardarCambios" method="POST" id="patientForm">
                                <input type="hidden" name="idPaciente" value="<c:out value="${paciente.getIdPaciente().intValue()}"/>">
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">CodigoLibreta</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" name="codigoLibreta" value="<c:out value="${paciente.getCodigoLibreta().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Rut</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" name="rut" value="<c:out value="${paciente.getRut().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Nombre</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" name="nombre" value="<c:out value="${paciente.getNombre().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Apellido Paterno</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control"  name="apellidoPaterno" value="<c:out value="${paciente.getApellidoPaterno().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Apellido Materno</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" name="apellidoMaterno" value="<c:out value="${paciente.getApellidoMaterno().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Fecha de Nacimiento</label>
                                    <div class="col-md-2">
                                        <input type="date" class="input-sm form-control" name="fechaNacimiento">
                                    </div>
                                </div>
                                <!--<div class="form-group">
                                    <label class="control-label label-default col-md-2">Tel&eacute;fono</label>
                                    <div class="col-md-2">
                                        <input type="number" class="input-sm form-control" placeholder="1234567890" >
                                    </div>
                                </div>-->
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Correo</label>
                                    <div class="col-md-2">
                                        <input type="email" class="input-sm form-control" name="correo" value="<c:out value="${paciente.getCorreo().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Direcci&oacute;n</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" name="direccion" value="<c:out value="${paciente.getDireccion().getValue()}"/>">
                                    </div>
                                </div>
                                <!--<div class="form-group">
                                    <label class="control-label label-default col-md-2">N&uacute;mero</label>
                                    <div class="col-md-2">
                                        <input type="number" class="input-sm form-control" placeholder="#123" >
                                    </div>
                                </div>-->
                                <div class="form-group">
                                    <div class="col-md-offset-2 col-md-10">
                                        <button type="submit" class="btn btn-success">Guardar Cambios <i class="fa fa-user-plus"></i></button>
                                        <a type="button" href="#" class="btn btn-danger">Cancelar <i class="fa fa-remove"></i></a>
                                    </div>
                                </div>
                            </form>
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
    $('#patientForm').bootstrapValidator({
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
            rut: {
                validators: {
                    notEmpty: {
                        message: 'Rut es requerido'
                    }
                }
            },
            nombre: {
                validators: {
                    notEmpty: {
                        message: 'Nombre es requerido'
                    }
                }
            },
            apellidoPaterno: {
                validators: {
                    notEmpty: {
                        message: 'Apellido Paterno es requerido'
                    }
                }
            },
            apellidoMaterno: {
                validators: {
                    notEmpty: {
                        message: 'Apellido Materno es requerido'
                    }
                }
            },
            fechaNacimiento:{
                validators:{
                    notEmpty:{
                        message: 'Fecha de Nacimiento es requerida'
                    }
                }
            },
            correo:{
                validators:{
                    notEmpty:{
                        message: 'Correo es requerido'
                    }
                }
            },
            direccion: {
                validators: {
                    notEmpty:{
                        message: 'Dirección es requerida'
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
            $('#patientForm').data('bootstrapValidator').disableSubmitButtons(false);
        }
    });
});

 $('#patientForm').bootstrapValidator({
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
            rut: {
                validators: {
                    notEmpty: {
                        message: 'Rut es requerido'
                    }
                }
            },
            nombre: {
                validators: {
                    notEmpty: {
                        message: 'Nombre es requerido'
                    }
                }
            },
            apellidoPaterno: {
                validators: {
                    notEmpty: {
                        message: 'Apellido Paterno es requerido'
                    }
                }
            },
            apellidoMaterno: {
                validators: {
                    notEmpty: {
                        message: 'Apellido Materno es requerido'
                    }
                }
            },
            fechaNacimiento:{
                validators:{
                    notEmpty:{
                        message: 'Fecha de Nacimiento es requerida'
                    }
                }
            },
            correo:{
                validators:{
                    notEmpty:{
                        message: 'Correo es requerido'
                    }
                }
            },
            direccion: {
                validators: {
                    notEmpty:{
                        message: 'Dirección es requerida'
                    }
                }
            }
        }
    });    
</script>
    </body>
</html>
