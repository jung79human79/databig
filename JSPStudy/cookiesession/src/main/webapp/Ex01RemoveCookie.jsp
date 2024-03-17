<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키삭제페이지</h1>

	<%
	//CRU도 자바코드이니 D도 당근 자바코드
	// 쿠키는 삭제에 대한 매서드가 존재 안함 ->유효기간을 짧게 수정하여
	// 기간만료로 삭제를 진행한다!
	// 쿠키삭제의 조건 
	// -->생성되어 있는 쿠키와 동일한 이름 즉 키("first")으로 새로운 쿠키를 생성한다
	// --> 키가 같으면 서버는 새로운 것으로 인식하지앟고 중복으로 인식하여 밸류,유효기간등을 덮어씌운다
	// 참고--> 만약 동일키의 쿠기가 있다면 중복으로 덮으므로 생성페이지를 실행시 유효기간도
	//   --> 새롭게 업데이트 되어(새롭게 덮는다) 원래기간보다 길어진다.

	Cookie cookie1 = new Cookie("first", "testcookie");

	cookie1.setMaxAge(0);
	response.addCookie(cookie1);
	%>

	<a href="Ex01GetCookie.jsp">쿠키확인하기</a>

</body>
</html>