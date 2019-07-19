<%-- 
    Document   : newAtention
    Created on : 11-jun-2017, 2:58:05
    Author     : Test
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="org.datacontract.schemas._2004._07.cesfamnegocio.Usuario"%>
<%@page import="org.datacontract.schemas._2004._07.cesfamnegocio.Paciente"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
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
        <title>Registrar Nueva Atenci&oacute;n</title>
    </head>
    <body>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-left" >
                    <img alt="Cesfam" src="assets/img/cesfam.png" height=90px" width="90px">
                </div>
                <div class="navbar-header navbar-left" >
                    <a class="navbar-brand">Cesfam Chile</a>
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
                    <form name="form" id="form" action="./ServletPrueba" method="POST">
        <div class="container clear-top">
            
                <div class="col-xs-12 col-md-12">
                        <div class="col-md-6">
                            <h3>Nueva Atenci&oacute;n <b>M&eacute;dica</b></h3><br>
                            
                            <div class="form-horizontal">
                                <input type="hidden" name="idPaciente" value="<c:out value="${paciente.getIdPaciente().intValue()}"/>">
                                <div class="form-group">
                                    <label class="control-label label-default col-md-3">Nombre</label>
                                    <div class="col-md-5">
                                        <input type="text" class="input-sm form-control" readonly="true" value="<c:out value="${paciente.getNombre().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-3">Apellido Paterno</label>

                                    <div class="col-md-5">
                                        <input type="text" class="input-sm form-control" readonly="true" value="<c:out value="${paciente.getApellidoPaterno().getValue()}"/>">
                                        
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-3">Apellido Materno</label>
                                    <div class="col-md-5">
                                        <input type="text" class="input-sm form-control" readonly="true" value="<c:out value="${paciente.getApellidoMaterno().getValue()}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-3">Rut</label>
                                    <div class="col-md-5">
                                        <input type="text" class="input-sm form-control" readonly="true" value="<c:out value="${paciente.getRut().getValue()}"/>">
                                    </div>
                                </div>

                                    
                                <div class="form-group">
                                    <label class="control-label label-default col-md-3">Fecha de Nacimiento</label>
                                    <div class="col-md-5">
                                        <input type="text" class="input-sm form-control" readonly="true" value="<c:out value="${fechaNacimiento}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="control-label label-default col-md-3">Correo</label>
                                    <div class="col-md-5">
                                        <input type="email" class="input-sm form-control" readonly="true" value="<c:out value="${paciente.getCorreo().getValue()}"/>">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <h3>Generar Nueva <b>Receta</b></h3><br>

                            <div class="form-horizontal" id="productForm">
                                <input type="hidden" name="idUsuario" readonly="true" value="<%=usuario.getIdUsuario().intValue()%>">
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Tipo</label>
                                        <div class="col-md-3">
                                            <div class="radio">
                                                <label><input type="radio" id="prescripcion" name="valor" value="2">Prescripci&oacute;n</label>
                                          
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="radio">
                                                <label><input type="radio" id="receta" name="valor" value="1">Receta</label>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Cat. Producto</label>
                                        <div class="col-md-3">
                                            <select id="categoria" name="txtCategoria" >
                                                <option value=""> - Seleccione - </option>
                                                    
                                            <%-- start web service invocation --%><hr/>
    <%
    try {
	org.tempuri.Service2 service = new org.tempuri.Service2();
	org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
	// TODO process result here
	org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfCategoria result = port.listarCategoriaAct();
	
        for(int i = 0; i < result.getCategoria().size(); i++)
        {
            %>
            
            <option value="<%=result.getCategoria().get(i).getIdCategoria().intValue()%>"><%=result.getCategoria().get(i).getNombreCategoria().getValue()%></option>
            
       <% }
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println(ex.toString()); 
    }
    %>
    <%-- end web service invocation --%>

                                        
                                            </select>
                                        </div>
                                    </div>
             
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Producto</label>
                                        <div class="col-md-3">
                                            <select id="producto" name="txtProducto">
                                               <option selected="selected">--Seleccione un producto--</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Stock disponible</label>
                                        <div class="col-md-3">
                                            <input type="text" class="input-sm form-control" id="stock" readonly="true">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Cantidad</label>
                                        <div class="col-md-3">
                                            <input type="number" name="cantidad" class="input-sm form-control" min="1"  id="cantidad">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Unidad Medida</label>
                                        <div class="col-md-3">
                                            <select id="unidadMedida" name="unidadMedida">
                                               <option selected="selected">--Seleccione unidad de medida--</option>
                                               <option value="CC">CC</option>
                                               <option value="Cantidad">MG</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Horas</label>
                                        <div class="col-md-3">
                                            <input type="number" name="horas" class="input-sm form-control" id="horas">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">D&iacute;as</label>
                                        <div class="col-md-3">
                                            <input type="number" name="dias" class="input-sm form-control" id="dias">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-md-offset-3 col-md-10">
                                            <a id="editabledatatable_new" class="btn btn-info">Agregar Producto <i class="fa fa-plus"></i></a>
                                            <!--<button type="reset" class="btn btn-info">Limpiar </button>-->
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Diagnostico</label>
                                        <div class="col-md-8">
                                            <textarea type="text" name="diagnostico" class="form-control" rows="6"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="control-label label-default col-md-3">Duraci&oacute;n</label>
                                        <div class="col-md-2">
                                            <input type="number" name="duracion" class="input-sm form-control" id="duracion" min="1">
                                        </div>
                                        <div class="col-md-2">
                                            <select id="mesesAnios" name="mesesAnios" >
                                                <option selected="selected">Meses/A&ntilde;o</option>
                                                <option value="1">Meses</option>
                                                <option value="2">A&ntilde;o</option>
                                            </select>
                                        </div>
                                    </div>
                                
                            </div>
                       
                     </div>
     
                </div>



                <div class="col-xs-12 col-md-12">
                    <table name="tabla" class="table table-striped table-hover table-bordered" id="editabledatatable">
                            <thead>
                                <tr>
                                    <th>Categor&iacute;a Producto</th>
                                    <th>Nombre Producto</th>
                                    <th>Cantidad</th>
                                    <th>Horas</th>
                                    <th>D&iacute;as</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>
                                
                            </tbody>
                    </table>
                    <input type="hidden" name="tabla" id="tabla" value="" >
                    <div class="">
                        <div class="form-group">
                            <div class="col-md-offset-5 col-md-10">
                                <button class="btn btn-warning" id="Recetar">Generar Receta</button>
                                <button type="submit" id="btnSubmitRecetar" style="display:none !important;" ></button>
                                <!--<button type="button" id="prueba" onclick="add_element_to_array();"></button>-->
                            </div>
                        </div>
                    </div>
                </div>
                
           
            </div>
        </form>
        <div class="footer">
            <div class="col-md-6" style="text-align: center !important; padding-top: 3px !important; padding-left: 20px !important">
                CESFAM Chile, Sistema de entrega de prescripciones m&eacute;dicas<br>
                Desarrollado por Bitealo S.A.
            </div>
            <div class="col-md-6">
                <div class="imgFooter">
                    <img src="assets/img/duocFooter.png" height="50px" width="130px"/>
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
    $('#editabledatatable').dataTable();
    });
    
    $('#productForm').bootstrapValidator({
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
            valor: {
                validators: {
                    notEmpty: {
                        message: 'Tipo es requerido'
                    }
                }
            },
            txtCategoria: {
                validators: {
                    notEmpty: {
                        message: 'Categoría es requerida'
                    }
                }
            },
            txtProducto: {
                validators: {
                    notEmpty: {
                        message: 'Producto es requerido'
                    }
                }
            },
            unidadMedida: {
                validators: {
                    notEmpty: {
                        message: 'Unidad de Medida es requerida'
                    }
                }
            },
            horas: {
                validators: {
                    notEmpty: {
                        message: 'Horas es requerido'
                    },
                    greaterThan: {
                        value: 0,
                        message: 'Horas debe ser mayor a 0' 
                    }
                }
            },
            cantidad: {
                validators: {
                    notEmpty: {
                        message: 'Cantidad es requerida'
                    },
                    greaterThan: {
                        value: 0,
                        message: 'Cantidad debe ser mayor a 0'
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
            $('#productForm').data('bootstrapValidator').disableSubmitButtons(false);
        }
    });

 $('#productForm').bootstrapValidator({
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
    
            
        $("#prescripcion").click(function() {  
            if($("#prescripcion").is(':checked')) {  
                $('#dias').prop('disabled', true);
                $('#duracion').prop('disabled', false);
                $('#mesesAnios').prop('disabled', false);
            } 
        });  
        
        
        $("#receta").click(function() {  
            if($("#receta").is(':checked')) {  
                $('#dias').prop('disabled', false);
                $('#duracion').prop('disabled', true);
                $('#mesesAnios').prop('disabled', true);
            } 
        }); 
        
        $('#producto').on('change', function(){
            $.ajax({
                  url: 'VerStockProducto',
                  type: 'POST',
                  data: 'idProducto='+$('#producto').val(),
                  success: function(data){
                      
                      $('#stock').val(data);
                  }
              });
        });
        
        
        $('#categoria').on('change', function(){
               $.ajax({
                  url: 'ControladorNewAtention',
                  type: 'POST',
                  data: 'idCategoria='+$('#categoria').val(),
                  success: function(data){
                      puntos = data.split(":");
                    limparselect();
                    if(data == '')
                        $('#producto').append('<option>Selecciona una categoria</option>');
                    else{
                       
                        for(var i = 0; i < puntos.length - 1; i++){
                            var idProducto = puntos[i].split("-")[0]; 
                            var nombreProducto = puntos[i].split("-")[1];
                            $('#producto').append('<option value ="'+idProducto+'">'+nombreProducto+'</option>');

                    }
                }
                    
                  },

                  error: function(data){
                    alert(data);
                    alert('Error occur....!!');
                  }
              });
              
              function limparselect(){
                $('#producto option').remove();
                }
          });
    
    
    $('#Recetar').on('click', function(){
        //Revisar datos de la variable data
        var Tabla = $('#editabledatatable').dataTable();
        var datos = Tabla.fnGetData().toString();
        //datos = "String,con,comas,a,punto,y,coma";
        $('#tabla').val(datos);
        ('#btnSubmitRecetar').submit();
        
    });
    
    
var InitiateEditableDataTable = function () {
        return {
            init: function () {
                //Datatable Initiating
                var oTable = $('#editabledatatable').dataTable({
                    "aLengthMenu": [
                        [5, 15, 50],
                        [5, 15, 50, "Todos"]
                    ],
                    "iDisplayLength": 50,
                    "sPaginationType": "bootstrap",
                    "sDom": "Tflt<'row DTTTFooter'<'col-sm-6'i><'col-sm-6'p>>",
                    "dom": "Bfrtip",
                    "oTableTools": {
                        "aButtons": [
                             {
                                 "sExtends": "copy",
                                 "sButtonText": "Copiar"
                             },
                            {
                                "sExtends": "collection",
                                "sButtonText": "Exportar <i class=\"fa fa-angle-down\"></i>",
                                "aButtons": ["csv", "xls", "pdf"]
                            }
                        ],
                        "sSwfPath": "@url/../../assets/swf/copy_csv_xls_pdf.swf"
                        //"sSwfPath": "@url/assets/swf/copy_csv_xls_pdf.swf"
                    },
                    "language": {
                        "sInfo": "Mostrando _START_ a _END_ de _TOTAL_ registros",
                        "search": "",
                        "sLengthMenu": "_MENU_",
                        "oPaginate": {
                            "sPrevious": "Anterior",
                            "sNext": "Siguiente"
                        }
                    },
                    "aoColumns": [

                        { "bSortable": true },
                        { "bSortable": true },
                        { "bSortable": true },
                        { "bSortable": true },
                        { "bSortable": true },
                        { "bSortable": true }
                    ]
                });
                
                var isEditing = null;
                var isAdding = false;

                //Add New Row
                $('#editabledatatable_new').click(function (e) {
                    e.preventDefault();
                        var Categoria = $('#cantidad').val();
                        var Producto = $('#producto').val();
                        var Cantidad = $('#cantidad').val();
                        var Horas = $('#horas').val();
                        var Dias = $('#dias').val();
                        var aiNew = oTable.fnAddData([
                            Categoria, Producto, Cantidad, Horas,Dias,
                            '<a id="eliminarFila" class="btn btn-danger delete"> Eliminar <i class="fa fa-trash"></i></a>'
                        ]);
                        
                });

                //Delete an Existing Row
                $('#editabledatatable').on("click", 'a.delete', function (e) {
                    e.preventDefault();
                        var nRow = $(this).parents('tr')[0];
                        oTable.fnDeleteRow(nRow);
                });
            }
        };
    }();
    
    
    

    InitiateEditableDataTable.init();
    
</script>
        
    </body>
</html>
