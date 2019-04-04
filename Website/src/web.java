import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class web extends HttpServlet {
 
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
         
      out.println("<html>\n" +"<head><title>" + "Contact Form" +
      "</title> </head>\n" +"<body bgcolor = \"Cornsilk\">\n" +"<h1 align = \"center\">" +
      "Our Operators will resolve your query and reach to you within 24 hours" + 
      "</h1>\n"+"<h2 align = \"center\">"+"Contact Details As Follow"+"<br>"+"</h2>"+"<h3 align = \"center\">" +"<b>Name : </b> " + request.getParameter("name") +"<br>"+
      "<b>Mobile no. : </b> " + request.getParameter("mobile") +"<br>"+
      "\n" +"  <b>Email :</b> "+ request.getParameter("email")+"</h3>" + "\n" +
      "</body>" +"</html>"
      );
   }
}