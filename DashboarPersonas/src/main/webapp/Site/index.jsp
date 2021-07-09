<%@include file="Comont/Header.jsp" %>
      <div class="content">
      
        
      <form action="Home.do" method="post">  	
      		<div class="row">
        	<div class="col-md-3"><input type="text" name="Nombre" placeholder="Nombre" id="Nombre" class="form-control"></div>

<div class="col-md-3"><input type="text" name="Apellido" placeholder="Apellido" id="Apellido" class="form-control"></div>

<div class="col-md-3"><input type="text" name="Direccion" placeholder="Direccion" id="Direccion" class="form-control"></div>

<div class="col-md-3"><input type="date" name="FechaNacimiento" placeholder="FechaNacimiento" id="FechaNacimiento" class="form-control"></div>

<div class="col-md-3"><input type="text" name="Foto" placeholder="Foto" id="Foto" class="form-control"></div>

<div class="col-md-3"><input type="text" name="IdCiudad" placeholder="IdCiudad" id="IdCiudad" class="form-control"></div>

<div class="col-md-3"><input type="text" name="Rut" placeholder="Rut" id="Rut" class="form-control"></div>
<button class="btn btn-primary" type="submit">Enviar</button>
 </div>
</form>
        	
       
          
      </div>
<%@include file="Comont/Footer.jsp" %>