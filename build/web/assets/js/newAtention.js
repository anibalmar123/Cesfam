$(document).ready(function(){
    
    $('#categoria').on('change', function(){
        
        
       $.ajax({
                  url: 'ControladorNewAtention',
                  type: 'GET',
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
        
    
       });
 });


