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
        <title>Registro de Tutores</title>
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
                                <li class="active"><a href="registerTutor.jsp">Registrar Tutor</a></li>
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
                        <h3>Registrar <b>Tutor</b></h3>
                        <div class="widgetbody">
                            <form class="form-horizontal" action="./RegistrarTutor" method="POST" id="tutorForm">
                                
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Seleccionar Paciente</label>
                                    <div class="col-md-3">
                                        <select id="paciente" name="paciente">
                                            <option value=""> - Seleccione - </option>
                                            
                                            
                                             
    <%
    try {
	org.tempuri.Service2 service = new org.tempuri.Service2();
	org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
	// TODO process result here
	org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPaciente result = port.listarPacientes();
	
        for(int i = 0; i < result.getPaciente().size(); i++)
        {
            
            %>
            
            <option value="<%=result.getPaciente().get(i).getIdPaciente().intValue()%>"><%=result.getPaciente().get(i).getNombre().getValue()+" "+result.getPaciente().get(i).getApellidoPaterno().getValue()+" "+result.getPaciente().get(i).getApellidoMaterno().getValue()%></option>
        <%}
        
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
   

                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Rut</label>
                                    <div class="col-md-2">
                                        <input class="input-sm form-control" placeholder="1111111-1" name="rut" >
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Nombres</label>
                                    <div class="col-md-2">
                                        <input class="input-sm form-control" placeholder="Nombres" name="nombre" >
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Apellido Paterno</label>
                                    <div class="col-md-2">
                                        <input class="input-sm form-control" placeholder="Ap. Paterno" name="apellidoPaterno">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Apellido Materno</label>
                                    <div class="col-md-2">
                                        <input class="input-sm form-control" placeholder="Ap. Materno" name="apellidoMaterno" >
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Fecha de Nacimiento</label>
                                    <div class="col-md-2">
                                        <input type="date" class="input-sm form-control" name="fechaNacimiento">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class=" control-label label-default col-md-2">Correo</label>
                                    <div class="col-md-2">
                                        <input type="email" class="input-sm form-control" placeholder="abc@abc.cl" name="correo" >
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-2">Seleccionar Parentesco</label>
                                    <div class="col-md-3">
                                        <select id="parentesco" name="parentesco">
                                            <option selected="selected"> - Seleccione - </option>
                                            <option value="Padre">Padre</option>
                                            <option value="Madre">Madre</option>
                                            <option value="Hermano/a">Hermano/a</option>
                                            <option value="Abuelo/a">Abuelo/a</option>
                                            <option value="Tio/a">Tio/a</option>
                                            <option value="Otro">Otro</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="col-md-offset-2 col-md-10">
                                        <button type="submit" class="btn btn-success">Registrar <i class="fa fa-user-plus"></i></button>
                                        <button type="reset" value="Reset" class="btn btn-danger">Cancelar <i class="fa fa-remove"></i></button>
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
    $('#tutorForm').bootstrapValidator({
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
            $('#tutorForm').data('bootstrapValidator').disableSubmitButtons(false);
        }
    });
});

 $('#tutorForm').bootstrapValidator({
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
            }
        }
    });           
</script>
    </body>
</html>
