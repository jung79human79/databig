<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!-- 오류가 발생할 경우 띄워줄 수 있는 error용 페이지 지정! -->
<%@ page errorPage="Ex06_ErrorPage.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    500 – 내부 서버 오류 --> 데이터값에 대한 오류 
    404 -        오류 --> 파일을 못찾는 경우 --> ex)파일 [/Ex03_inputame.jsp]을(를) 찾을 수 없습니다.
	
	2를 0으로 나누어 볼까요?
	<%=2/0%>
	나누는 것이 불가능하므로 500 오류가 발생함 이때 오류페이지를 보여주는 대신 
	위의 6행의 지시자를 사용해 Ex06_ErrorPage.jsp의 내용(이미지)을 띄워주지만
	실제 사이트 주소는 여기(Ex06_Error.jsp)로 보인다

</body>
</html>