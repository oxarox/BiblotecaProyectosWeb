package Service;
import java.util.List;
import javax.ejb.Local;
import Data.Persona;

@Local
public interface PersonasServiceLocal {

	public void agregarPersona(Persona p);
	public List<Persona> listarPersona();
	public void eliminarPersona(Persona p);
	public void editarPersona(Persona p);	
	
}
