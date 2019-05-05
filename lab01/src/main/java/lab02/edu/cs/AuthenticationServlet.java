package lab02.edu.cs;

import lab02.edu.data.DataFacade;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AuthenticationServlet
 */
@WebServlet("/AuthenticationServlet")
public class AuthenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthenticationServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ServletContext ctx = request.getServletContext();
 
		String name = request.getParameter("name");
		String password = request.getParameter("password");

  		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		String expectedPassword = data.findPassword(name );
		
		if(expectedPassword == null || !expectedPassword.equals(password)) {
							response.sendRedirect("lab02.jsp");
		} else {
			request.getRequestDispatcher("/WEB-INF/jsp/lab02/advice.jsp").forward(request,response);
		}
	}

}
