/* Write a Java servlet that implements a simple calculator. The program must provide following implementations:
i) HTML file: displays a form, that reads two numbers from the user and provides the buttons: Add, Subtract, Multiply and Divide
ii) Java Servlet: provides features to handle the request (from HTML file), computes the result and sends back the result in HTML format */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Simple calculator", urlPatterns = { "/Q12" })
public class Q12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = Integer.parseInt(request.getParameter("n2"));
		String op = request.getParameter("op");
		out.println("<html><body>");
		switch(op) {
			case "Add":
				out.println("The result is:<br>");
				out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "Subtract":
				out.println("The result is:<br>");
				out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "Multiply":
				out.println("The result is:<br>");
				out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "Divide":
				if(num2 != 0) {
					out.println("The result is:<br>");
					out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				}else {
					out.println("Second number cannot be zero for division");
				}
				break;
		}
		out.println("</body></html>");
		out.close();
	}
}