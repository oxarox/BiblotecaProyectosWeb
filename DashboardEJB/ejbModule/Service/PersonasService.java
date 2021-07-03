package Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Data.Persona;

/**
 * Session Bean implementation class PersonasService
 */
@Stateless
@LocalBean
public class PersonasService implements PersonasServiceLocal {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DashboardEJB");
	
	
	/**
     * Default constructor. 
     */
    public PersonasService() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void agregarPersona(Persona p) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		try {
			em.persist(p);
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
		
	}

	@Override
	public List<Persona> listarPersona() {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		try {
			return em.createNamedQuery("Persona.getAll", Persona.class).getResultList();
		}catch(Exception ex){
			return null;
		}finally{
			em.close();
		}
	}

	@Override
	public void eliminarPersona(Persona p) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		try {
			em.remove(em.find(Persona.class, p.getIdPersona()));
			em.flush();
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
		
	}

	@Override
	public void editarPersona(Persona p) {
		// TODO Auto-generated method stub
		EntityManager em = this.emf.createEntityManager();
		try {
			Persona original= em.find(Persona.class, p.getIdPersona());
			original.setApellidosPersona(p.getApellidosPersona());
			original.setDireccion(p.getDireccion());
			original.setFechaNacimiento(p.getFechaNacimiento());
			original.setFotoPersona(p.getFotoPersona());
			original.setIdCiudad(p.getIdCiudad());
			original.setNombresPersona(p.getNombresPersona());
			original.setRut(p.getRut());
			
			em.merge(original);
			em.flush();
			
		}catch(Exception ex){
			
		}finally{
			em.close();
		}
		
	}

}
