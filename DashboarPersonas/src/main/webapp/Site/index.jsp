<%@include file="Comont/Header.jsp" %>
      <div class="content">
      
        
      <form action="Home.do" method="post">  	
      		<div class="row">
      		
      			<div class="col-md-3"><input type="text" name="Rut" placeholder="Rut" id="Rut" class="form-control require"></div>      		
        		<div class="col-md-3"><input type="text" name="Nombre" placeholder="Nombre" id="Nombre" class="form-control require"></div>
				<div class="col-md-3"><input type="text" name="Apellido" placeholder="Apellido" id="Apellido" class="form-control require"></div>

<div class="col-md-3"><input type="text" name="Direccion" placeholder="Direccion" id="Direccion" class="form-control require"></div>

<div class="col-md-3"><input type="date" name="FechaNacimiento" placeholder="FechaNacimiento" id="FechaNacimiento" class="form-control require"></div>

<div class="col-md-3"><input type="text" name="Foto" placeholder="Foto" id="Foto" class="form-control "></div>

<div class="col-md-3"><input type="text" name="IdCiudad" placeholder="IdCiudad" id="IdCiudad" class="form-control require"></div>

<!-- button class="btn btn-primary" type="submit">Enviar</button> -->
<button class="btn btn-primary" type="button" onclick="savePersona()" id="btn-envion">
<span class="carga"></span>
Enviar
</button> 

 </div>
</form>
        	
       
          
      </div>
<%@include file="Comont/Footer.jsp" %>



<script language="javascript">
	
	//function savePersona(){
		
	$("#btn-envion").click({
		
		
		var swError=0
		$(".require").each(function (){
			if($(this).val()==""){
				swError=1
			}
				
		})
		
		if(swError==1){
			alert("Error,favor de ingresar todos los datos.")
			return 0
			
		}else{
			
			$("#btn-envion").prop("disabled",true)
			$(".carga").html("<i class=\"fas fa-spinner fa-spin \"></i>")
			
			var objData={
					"Rut":	$("#Rut").val(),
					"Nombre":	$("#Nombre").val(),
					"Apellido":	$("#Apellido").val(),
					"Direccion":	$("#Direccion").val(),
					"FechaNacimiento":	$("#FechaNacimiento").val(),
					"Foto":	$("#Foto").val(),
					"IdCiudad":	$("#IdCiudad").val()
			}
			
			$.ajax({
				url:"Home.do",
				type:"POST",
				data:objData,
				success:function(response){
					console.log(response)	
					alert(response)
					$("#btn-envion").prop("disabled",false)
					$(".carga").html("")
						
				}
				
				
			})
			
		}
		
		
		
	//s}

	})	

</script>