/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-15 10:26:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ex04Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body align=\"center\">\r\n");
      out.write("	<!--html에서 보내주는 데이터를 활용하여 로그인이 가능한지 판단하는 페이지!!   \r\n");
      out.write("     요청을 받고 다시 응답을 해줘야 한다!-->\r\n");
      out.write("	\r\n");
      out.write("	");

	// 0. 요청에 대한 인코딩 작업 진행!
	request.setCharacterEncoding("utf-8");
	// 1.요청(post 방식)의 값을 받아오기
	// 변수 저장하는 이유 --> 연산을 하든지 출력하든지 재사용하므로 반드시 변수로 저장
	String id = request.getParameter("id"); 
	String pw = request.getParameter("pw");
	String id2 = request.getParameter("id2"); 
	String pw2 = request.getParameter("pw2");
	
	// 2. 사용자가 입력한 데이터가 로그인이 가능한지 판단!
	if (id.equals("wjdeown") && pw.equals("123")) {
		// Login.jsp에서 새롭게 요청을 전달하는 위치
		// 보내고 싶은/공유하고 싶은 데이터를 포함하여 요청한다
		//->get방식에서 사용할 수있는 query string 문법 사용 ? 사용 ----> ? 변수명 = +값(현재페이지에서 다른 페이지로 보내고자 하는 변수)
		// ? 키:밸류 이므로 키값을 성공페이지에서 불러준다 그래야 밸류를 로그인 페이지에서 표현 할 수 있다. 
		
		// 로그인 성공의 상태
		// response --> 응답의 내장함수 --> 내에 sendRedirect라는 함수가 존재 ->jsp에서는 내장함수를 자유롭게 사용가능
		// 근데 프로젝트명만 써도 이동되는 이유 --> 같은 페이지에서 어떤로컬에서 어떤 포트에서 어떤 프로젝트로 가는 것이므로 프로젝트명만 넣어도 이동한다
		// 네이버로 가려면 실은 전체 주소를 적어야 한다
		
		response.sendRedirect("Ex04_login_success.jsp?data=" + id);
	}else if(id2.equals("wjd") && pw2.equals("12")){
		
		
		// forward 방식 : 요청에 대한 내용을 공유하며 새로운 요청을 할 수있는 기법!  -> Dispatch:보내다
		// 주소를 보면 쿼리문은 보안이 약한데 그것이 없이 주소가 보이므로 보안이 좋다 즉 주소창에 키=밸류가 안보인다
		//RequestDispatcher()은 경로를 매개변수로~
		RequestDispatcher rd = request.getRequestDispatcher("Ex04_login_success.jsp");
		// 공유하고자 하는 데이터 연결하기
		request.setAttribute("id", id2);
		// forward()는 아래의 2개의 매개변수
		rd.forward(request, response);
		
	} else {
		// 로그인 실패의 상태
		response.sendRedirect("Ex04_login_fail.jsp");
	}
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}