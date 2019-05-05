package lab03;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RandomServlet")
public class RandomServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RandomModel randomModel = new RandomModel();
        request.setAttribute("randomModel",randomModel);
        request.getRequestDispatcher("/WEB-INF/jsp/lab03/random.jsp").forward(request,response);
    }
}