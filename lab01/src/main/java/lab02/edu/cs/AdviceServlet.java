package lab02.edu.cs;

import lab02.edu.data.DataFacade;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdviceServlet
 */
@WebServlet("/AdviceServlet")
public class AdviceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdviceServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String roast = request.getParameter("roast");		
		
  		DataFacade data = (DataFacade) getServletContext().getAttribute("dataSource");
		List<String> advices = data.getAdvice(roast);
//		String adviceOutput = prepareAdviceOutput(roast, advices);

		request.setAttribute("advices",advices);
		request.setAttribute("roast",roast);

		request.getRequestDispatcher("/WEB-INF/jsp/lab02/display.jsp").forward(request,response);
		
//		response.setContentType("text/html");
//		response.setHeader("Cache-Control", "no-cache");
//		PrintWriter writer = response.getWriter();
//		writer.println(adviceOutput);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/lab02/advice.jsp").forward(request,response);
	}
	
	private String prepareAdviceOutput(String roast, List<String> advice) {
			
		StringBuilder sb = new StringBuilder();
		sb.append("<!DOCTYPE html>\n");
		sb.append("<html><head> </head>\n");
		sb.append("<body><form action=\"../action/login\" method=\"get\">\n");
		
		sb.append("Starbuck's " + roast.toUpperCase() + " Roast Coffees:");
		
		sb.append("<table>\n");
		for( int i=0;i<advice.size();i++) {
			if (i%2 == 0)  sb.append("<tr style=\"background-color:cyan\">");
			else sb.append("<tr style=\"background-color:yellow\">");
 
			sb.append("<td>" + advice.get(i) + "</td></tr>\n");
 
		}
		sb.append("</table>\n");

		sb.append("<input type=\"submit\" value=\"Back\">\n");
		sb.append("</body></html>");
		return sb.toString();
	}

}
