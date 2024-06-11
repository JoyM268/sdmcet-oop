import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "addition of two numbers", urlPatterns = { "/compute" })
public class compute extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));

		int sum = n1 + n2;
		out.print("Sum = <font color='red'>" + sum + "</font><br>");
		out.print("1st Number: " + n1 + "<br>");
		out.print("2nd Number: " + n2);
		//out.print("Sum = " + sum);
	}
}