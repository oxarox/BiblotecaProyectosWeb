package cl.inacap.DashboarPersonas.Controller;

import javax.inject.Inject;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Data.Persona;
import Service.*;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home.do")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Inject
    private PersonasServiceLocal ps;
    
    public static Date formatoFecha(String s) {
    	try {
    		return new SimpleDateFormat("yyyy-MM-dd").parse(s);
    		
    	}catch(Exception ex) {
    		return null;
    	}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("Site/index.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		Date fechaNacimiento = formatoFecha(request.getParameter("FechaNacimiento").toString());
		
		Persona p = new Persona();
		p.setApellidosPersona(request.getParameter("Apellido").toString());
		p.setDireccion(request.getParameter("Direccion").toString());
		p.setFechaNacimiento(fechaNacimiento);
		p.setFotoPersona(request.getParameter("Foto").toString());
		p.setIdCiudad(Integer.parseInt(request.getParameter("IdCiudad")));
		p.setNombresPersona(request.getParameter("Nombre").toString());
		p.setRut(request.getParameter("Rut").toString());
		ps.agregarPersona(p);
		
		
	}

}
