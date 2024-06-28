/* Write a Java program that provides the following implementations:
i) HTML file: displays a text box to read a line of text and provides a submit button
ii) Java Servlet: provides features to handle the request (from HTML file), processes the request
and sends the number of vowels and consonants present in the line of text in HTML format */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Prints number of vowels and consonants", urlPatterns = { "/Q1_a" })
public class Q1_a extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String str = request.getParameter("textbox").toLowerCase();
		int vowels = 0;
		int consonants = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowels++;
			}else if(ch >= 'a' && ch <= 'z'){
				consonants++;
			}
		}
		out.println("<html><body>");
		out.println("The number of vowels in the line of text is: <b>" + vowels + "</b><br>");
		out.println("The number of consonants in the line of text is: <b>" + consonants + "</b>");
		out.println("</body></html>");
		out.close();
	}
}