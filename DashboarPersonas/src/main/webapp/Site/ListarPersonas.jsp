<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="Comont/Header.jsp" %>
      <div class="content">
  
  
  <style>
  
  	.color_fond{
  	background-color:red
  	}
  </style>
 <div class="row">
    <div class="col-md-12">
        <table class="table table-dark table-striped">
            <thead>
                <tr>
                    <th>id</th>
                    <th>nombre</th>
                    <th>Apellido</th>
                    <th>FEcha nacimiento</th>                       
                    <th>Rut</th>                       
                    <th>Direccion</th>                       
                    <th>Foto</th>
                    <th>Ciudad</th>                       
                </tr>
            </thead>
            <tbody class="tbody" name="bodyMain">  
           		<c:forEach var="persona" items="${listado}">
                <tr>
                    <td>${ persona.getIdPersona() }</td>
                    <td>${ persona.getNombresPersona() }</td>
                    <td>${ persona.getApellidosPersona() }</td>
                    <td>${ persona.getFechaNacimiento() }</td>                       
                    <td>${ persona.getRut() }</td>                       
                    <td>${ persona.getDireccion() }</td>                       
                    <td>${ persona.getIdCiudad() }</td>
                    <td>${ persona.getFotoPersona() }</td>    
                    
                </tr>  
                </c:forEach> 
            
            </tbody>
       </table>
     </div>
    
	

</div>
      
      
      	
      
      
       
          
      </div>
<%@include file="Comont/Footer.jsp" %>



<script language="javascript">
	

</script>