/* Create a dynamic web application to perform following operations:
a) Create a html file to 2 read an integer
b) On clicking the submit button servlet finds the sum of two numbers and prints it on web browser */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(description = "arithmatic operations", urlPatterns = { "/calculate" })
public class calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		int res = num1 + num2;
		out.println("Sum = " + res);
	}
}