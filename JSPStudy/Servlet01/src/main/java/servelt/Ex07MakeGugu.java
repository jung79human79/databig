package servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07MakeGugu")
public class Ex07MakeGugu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=utf-8");

		String color = request.getParameter("data1");
		int num1 = Integer.valueOf(request.getParameter("data2"));
		int num2 = Integer.valueOf(request.getParameter("data3"));

		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		//table태그에 경계선에 빨강 경계선을 제외한 부분인 경계안쪽에 입력색
		//만약 td태그에 색을 안주면 경계선을 제외한 부분인 경계안쪽에 입력색이 전부 표현
		out.print("<table border=1 border bgcolor="+color+" bordercolor=red>" );
		for (int i = num1; i <= num2; i++) {
			int a = num1++;
		out.print("<tr>");

		for (int j=1; j<=9; j++) {
			//int a = num1++;
			out.print("<td  bgcolor=yellow>" + a + " * " + j + " = " + a*j + "</td>");			
		}
		// td태그에 노란색
		out.print("</tr>");
		}
		out.print("</table>");

		out.print("</body>");
		out.print("</html>");

	}

}
