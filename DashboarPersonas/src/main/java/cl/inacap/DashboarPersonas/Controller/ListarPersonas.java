package cl.inacap.DashboarPersonas.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.PersonasServiceLocal;
import Data.*;
import Service.PersonasService;
import Service.PersonasServiceLocal;
/**
 * Servlet implementation class ListarPersonas
 */
@WebServlet("/ListarPersonas.do")
public class ListarPersonas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarPersonas() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    @Inject
    private PersonasServiceLocal ps;
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		
		
		
		
		List<Persona> per=new ArrayList<Persona>();
		per=ps.listarPersona();
		request.setAttribute("listado", per);
		
		/*ps.listarPersona().stream()
		.filter(p->p.getRut().equals("181635"))
		.forEach(p->out.println(p.toString()));*/
		request.getRequestDispatcher("Site/ListarPersonas.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
