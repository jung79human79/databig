package servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex05실습")
public class Ex05실습 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		
		out.print("<table border=1>");
		out.print("<tr>");
		
		//out.print("<td>1</td>");
		//out.print("<td>2</td>");
		//out.print("<td>3</td>");
		//out.print("<td>4</td>");
		//out.print("<td>5</td>");
		//out.print("<td>6</td>");
		
		for(int i =1; i<=6; i++) {
			
			out.print("<td>" + i + "</td>");
			
		}
		
		
		out.print("</tr>");
		out.print("</table>");
		
		
		
		
		out.print("</body>");
		out.print("</html>");
	
	// 중요--> 현재 상태에서 실행시 'http://localhost:8080/Servlet01/Ex05%EC%8B%A4%EC%8A%B5'
	// 근데 html로 연동해서 살행시(다른예제침조) 주소 맨 끝에 확장자 .html 이 주소에 붙는다
    // .html이 안붙어도 개발자도구에서는 html코드로 확인된다
	
	
	
	
	
	}

}