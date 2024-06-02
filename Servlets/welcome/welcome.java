import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "welcome user", urlPatterns = { "/welcome" })
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String first = request.getParameter("fn");
		String last = request.getParameter("ln");
		
		out.println("<html><body>");
		out.println("Welcome <b>" + first + " " + last + "</b>");
		out.println("</html></body>");
	}
}