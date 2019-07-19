<%-- 
    Document   : register
    Created on : 11-jun-2017, 0:04:51
    Author     : Test
--%>

<%@page import="org.datacontract.schemas._2004._07.cesfamnegocio.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Registrar Paciente</title>
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
                                <li class="active"><a href="registerPatient.jsp">Registrar Paciente</a></li>
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
                            <h3>Registrar Nuevo <b>Paciente<b></h3>
                            <form class="form-horizontal " action="./RegistrarPaciente" method="POST" id="patientForm" name="form1">
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Rut</label>
                                    <div class="col-md-2">
                                        <input type="text" id="rut" class="input-sm form-control" maxlength="10" placeholder="11111111-1" name="rut">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Nombre</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" placeholder="Nombre" name="nombre" >
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Apellido Paterno</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" placeholder="Ap. Paterno" name="apellidoPaterno" >
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Apellido Materno</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" placeholder="Ap. Materno" name="apellidoMaterno" >
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
                                        <input type="email" class="input-sm form-control" name="correo" placeholder="abc@abc.cl">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Direcci&oacute;n</label>
                                    <div class="col-md-2">
                                        <input type="text" class="input-sm form-control" name="direccion" placeholder="Av. BlaBla">
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
                                        <button type="submit" class="btn btn-success">Registrar <i class="fa fa-user-plus"></i></button>
                                        <a type="button" href="index.jsp" class="btn btn-danger">Cancelar <i class="fa fa-remove"></i></a>
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
<script src="assets/js/validarut.js"></script>
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
    .find('button[type=submit]')
    .on('click', function (e) {
        var $target = $($(this).attr('data-toggle'));
        $target.toggle();
        if (!$target.is(':visible')) {
            $('#patientForm').data('bootstrapValidator').disableSubmitButtons(false);
        }
        var rut = $('#rut').val();    
        if(Rut(rut) == false)
        {
            e.preventDefault();
        };
    });
});
        </script>
    </body>
</html>
