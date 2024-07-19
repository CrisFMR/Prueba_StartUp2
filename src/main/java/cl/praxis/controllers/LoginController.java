package cl.praxis.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.praxis.models.dao.UserDAO;
import cl.praxis.models.dao.UserDAOImpl;
import cl.praxis.models.dto.User;


@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private UserDAOImpl uDAO;

    public void init() {
        uDAO = new UserDAOImpl();
    }
    
    public LoginController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		 String correo = request.getParameter("correo");
	     String password = request.getParameter("password");

	     User user = uDAO.read(correo);
	       

	        if (user != null && user.getPassword().equals(password)) {
	            HttpSession session = request.getSession();
	            session.setAttribute("user", user);
	           	            
	            if (user.admin()) {
	                List<User> usuarios = uDAO.read();
	                request.setAttribute("usuarios", usuarios);
	                RequestDispatcher dispatcher = request.getRequestDispatcher("/views/home.jsp");
	                dispatcher.forward(request, response);
	            } else {
	            	request.getRequestDispatcher("/views/access.jsp").forward(request, response);
	            }
              
	        } else {
	            response.getWriter().println("Correo o password invalidos, favor intentar nuevamente.");
	        }
		
	}

}
