package cl.praxis.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.models.dao.UserDAO;
import cl.praxis.models.dao.UserDAOImpl;
import cl.praxis.models.dto.User;


@WebServlet("/Register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private UserDAOImpl uDAO;

    public void init() {
        uDAO = new UserDAOImpl();
    }
       
    
    public RegisterController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		
		String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String nick = request.getParameter("nick");
        String password = request.getParameter("password");
        int peso = Integer.parseInt(request.getParameter("peso"));
        

        if (uDAO.validation(correo)) {
            response.getWriter().println("Correo ya esta registrado.");
        } else {
            User user = new User(correo, nick, nombre, password, peso);
            uDAO.create(user);
            request.getRequestDispatcher("/views/success.jsp").forward(request, response);
        }
	}

}
