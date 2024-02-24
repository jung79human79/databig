package servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex08Star")
public class Ex08Star extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String color = request.getParameter("data1");
		int num1 = Integer.valueOf(request.getParameter("data2"));
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<style>");
		out.print("#cc{background-color:"+color+"; border: 1px solid red; font-size:50px}");
		out.print("#aa{background-color:white; border: 1px solid red; font-size:50px}");
		out.print("#bb{width: max-content; border: 1px solid black; padding: 10px 10px 0px 10px; display: flex;  flex-direction: column; justify-content: bottom; align-items: bottom;}");  //display: inline;도 가능
		// box-sizing: border-box;
		//width: max-content; = display: inline;
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div id = bb >"); //style=line-height:100%
		for (int i = 1; i <= num1; i++) {
			out.print("<div>");
			for (int j=1; j<=i; j++) {
				    if (i%2==1) {
				    	out.println("<span id = cc>*</span>");
				    }else 
					out.println("<span id = aa>*</span>");
			}
			out.print("</div>");
			out.print("<br>");
		}
		out.print("</div>");

		out.print("</body>");
		out.print("</html>");
	
	
	
	
	}

}
