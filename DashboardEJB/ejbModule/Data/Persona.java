package Data;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="personas")
@NamedQueries({
    @NamedQuery(name="Persona.getAll",query="select p from Persona p")
})
public class Persona implements Serializable {
	
	//integrar la clase de regiones           @ManyToOne    private Department department; // jpql
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdPersona;
	
	@Column(name="NombresPersona")
	private String NombresPersona;
	
	@Column(name="Apellido_persona")
	private String ApellidosPersona;
	
	
	private String Rut;
	
	
	private Date FechaNacimiento;
	
	
	private String FotoPersona;
	
	
	private String Direccion;
	
	//@ManyToOne
	//@JoinColumn
	private int IdCiudad;
	
	public int getIdPersona() {
		return IdPersona;
	}
	public void setIdPersona(int idPersona) {
		IdPersona = idPersona;
	}
	public String getNombresPersona() {
		return NombresPersona;
	}
	public void setNombresPersona(String nombresPersona) {
		NombresPersona = nombresPersona;
	}
	public String getApellidosPersona() {
		return ApellidosPersona;
	}
	public void setApellidosPersona(String apellidosPersona) {
		ApellidosPersona = apellidosPersona;
	}
	public String getRut() {
		return Rut;
	}
	public void setRut(String rut) {
		Rut = rut;
	}
	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getFotoPersona() {
		return FotoPersona;
	}
	public void setFotoPersona(String fotoPersona) {
		FotoPersona = fotoPersona;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getIdCiudad() {
		return IdCiudad;
	}
	public void setIdCiudad(int idCiudad) {
		IdCiudad = idCiudad;
	}
	
	
	
}

