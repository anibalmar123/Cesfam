<%-- 
    Document   : patientList
    Created on : 17-jun-2017, 19:19:47
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
        <title>Listado de Pacientes</title>
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
                                <li class="active"><a href="patientList.jsp">Listar Pacientes</a></li>
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
                    <h3>Listado de Pacientes</h3>
                    <div class="table-toolbar">
                        <!--<div class="form-group">
                            <label class="control-label label-default col-md-3">Ingresar Rut de Paciente</label>
                            <div class="col-md-2">
                                <input type="text" class="input-sm form-control" >
                            </div>
                            <button type="button" class="btn btn-primary">Buscar Paciente</button>
                        </div>-->
                    </div>
                    <table class="table table-striped table-hover table-bordered" id="editabledatatable">
                            <thead>
                                <tr>
                                    <th>C&oacute;digo de Libreta</th>
                                    <th>Nombre</th>
                                    <th>Rut Paciente</th>
                                    <th>Direccion</th>
                                    <th>Acciones</th>
                                </tr>
                            </thead>
                            <tbody>    
<%-- start web service invocation --%>
    <%
    try {
	org.tempuri.Service2 service = new org.tempuri.Service2();
	org.tempuri.IService2 port = service.getBasicHttpBindingIService2();
	// TODO process result here
	org.datacontract.schemas._2004._07.cesfamnegocio.ArrayOfPaciente result = port.listarPacientes();
	//out.println("Result = "+result);
        
         for(int i = 0; i < result.getPaciente().size(); i++)
             
        {%>
        
                                <tr>
                                    <td><%=result.getPaciente().get(i).getCodigoLibreta().getValue()%></td>
                                    <td><%=result.getPaciente().get(i).getNombre().getValue()+" "+result.getPaciente().get(i).getApellidoPaterno().getValue()+" "+result.getPaciente().get(i).getApellidoMaterno().getValue()%></td>
                                    <td><%=result.getPaciente().get(i).getRut().getValue()%></td>
                                    <td><%=result.getPaciente().get(i).getDireccion().getValue()%></td>
                                    <td><a href="./EditarPaciente?param1=<%=result.getPaciente().get(i).getIdPaciente().intValue()%>" class="btn btn-info"> Nueva Consulta <i class="fa fa-file-o"></i></a></td>
                                </tr>
      
        <%}
        
    } catch (Exception ex) {
	
        ex.toString();
    }
    %>
    <%-- end web service invocation --%>
                            </tbody>
                    </table>
                </div>
            </div>
        </div>
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/datatable/jquery.dataTables.min.js"></script>
<script src="assets/js/datatable/dataTables.tableTools.min.js"></script>
<script src="assets/js/datatable/dataTables.bootstrap.min.js"></script>
<script src="assets/js/bootbox/bootbox.js"></script>
<script>
    $(document).ready(function() {
        $('#editabledatatable').dataTable();
    } );
    
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
                    "sDom": "Tflt<'DTTTFooter'<'col-sm-6'i><'col-sm-6'p>>",
                    "dom": 'Bfrtip',
                    "oTableTools": {
                        "aButtons": [
                             {
                                 "sExtends": "copy",
                                 "sButtonText": "Copiar"
                             },
                        ],
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

                $('#editabledatatable').on("click", '.delete-confirm', function (e) {
                    var xChildKey = $(this).parents('tr')[0].id;
                    var nRow = $(this).parents('tr')[0];

                    var _this = this;
                    var opsConfirm = jsCore.bootBoxConfirmDeleteOptions;
                    opsConfirm.message = "¿Desea eliminar este registro?";
                    opsConfirm.buttons.success.callback = function () {

                        $.ajax({
                            url: '@url/DeleteAjax/' + xChildKey,
                                type: 'post',
                                dataType: "html",
                                async: false,
                                success: function (_result) {
                                    var _objr = JSON.parse(_result);
                                    switch (_objr.Flag) {
                                        case jsCore.FlagError:
                                            //jsCore.showErrorModal("Error", _objr.ErrorDescription);
                                            $(document).ready(function () {
                                                Notify('Un error ocurrió en el sistema', 'bottom-right', '10000', 'danger', 'fa-times', true);
                                            });
                                            break;
                                        case jsCore.FlagOK:
                                            var oTable = $('#editabledatatable').dataTable()
                                            oTable.fnDeleteRow(nRow);
                                            jsCore.showSuccessModal("Eliminado", "El registro fue eliminado con éxito");
                                            break;
                                        default:
                                            break;
                                    }
                                }
                            });

                        };
                        bootbox.dialog(opsConfirm);
                    });
                }

            };
        }();  
    InitiateEditableDataTable.init();    
</script>
        
        
    </body>
</html>
