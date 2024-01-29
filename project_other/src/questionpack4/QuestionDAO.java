package questionpack4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class QuestionDAO {


	private PreparedStatement psmt = null;
	private Connection conn = null;
	private ResultSet rs = null;
	
//			CSlass.forName("com.mysql.cj.jdbc.Driver");
//			String url = "jdbc:mysql://project-db-campus.smhrd.com:3307/cgi_23K_BIG23_p1_1";
//			String user = "cgi_23K_BIG23_p1_1";
//			String password = "smhrd1";

	private void getConn() { // 연결 메소드
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://project-db-campus.smhrd.com:3307/cgi_23K_BIG23_p1_1";
			String user = "cgi_23K_BIG23_p1_1";
			String password = "smhrd1";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getClose() { // 자원 반납 메소드
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int join(QuestionDTO dto) {// 회원가입 메소드
		int row = 0;

		try {
			getConn();

			String sql = "INSERT INTO cgi_23K_BIG23_p1_1.userdata (id, pw, user_name) values(?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	public QuestionDTO login(String id, String pw) {// 로그인 메소드
		QuestionDTO dto = null;

		try {
			getConn();

			String sql = "select * from cgi_23K_BIG23_p1_1.userdata inner join cgi_23K_BIG23_p1_1.score on userdata.user_num = score.user_num where id = ? and pw=? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {

				String user_name = rs.getString("user_name");
				String grade = rs.getString("grade");
				int best_score = rs.getInt("best_score");

				// rs에 있는 데이터 DTO에 옮기기
//				dto = new MemberDTO(null, null, name, age, 0);
				dto = new QuestionDTO(user_name, id, pw, grade, best_score, 0);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return dto;

	}

	public ArrayList<QuestionDTO> serch() {// 랭킹 조회 메소드
		ArrayList<QuestionDTO> fkarr = new ArrayList<QuestionDTO>();
		try {
			getConn();

			String sql = "select * from cgi_23K_BIG23_p1_1.score inner join cgi_23K_BIG23_p1_1.userdata on score.user_num = userdata.user_num order by best_score desc;";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("user_name");
				String grade = rs.getString("grade");
				int best_score = rs.getInt("best_score");

				// 조회 결과(rs)에 있는 데이터 DTO로 옮겨담기
				QuestionDTO dto = new QuestionDTO(name, grade, best_score);
//				MemberDTO dto = new MemberDTO(id, pw, name, age, score);

				fkarr.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return fkarr;
	}

	public ArrayList<QuestionDTO> quiz() {// 문제와 정답을 리턴하는 메소드
		Random rd = new Random();
		ArrayList<QuestionDTO> quiz = new ArrayList<QuestionDTO>();
		try {
			getConn();

			String sql = "select * from cgi_23K_BIG23_p1_1.question";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				int question_num = rs.getInt("qeustion_num");
				String question = rs.getString("question");
				String answer = rs.getString("answer");
				int question_score = rs.getInt("question_score");

				// 조회 결과(rs)에 있는 데이터 DTO로 옮겨담기
				QuestionDTO dto = new QuestionDTO(question_num, question, answer, question_score);
				quiz.add(dto);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return quiz;
	}

	public int updateScore(QuestionDTO you, int score) {
		int row = 0;
		try {
			getConn();
			String sql = "SELECT * FROM cgi_23K_BIG23_p1_1.score inner join cgi_23K_BIG23_p1_1.userdata on score.user_num=userdata.user_num where id = ? and pw=? ";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, you.getId());
			psmt.setString(2, you.getPw());
			rs = psmt.executeQuery();

			if (rs.next() == true) {
				// 사용자가 존재할 경우에만 업데이트 실행
				int index = rs.getInt("user_num");

				int best_Score = rs.getInt("best_score");
				int sum_Score = rs.getInt("score_sum");

				if (score > best_Score) {
					best_Score = score;
				}
				if (score >= 0) {
					sum_Score += score;
				}

				// 점수 업데이트
				String updateSql = "update cgi_23K_BIG23_p1_1.score set score = ?, best_score =?,score_sum=? where user_num= ?";
				psmt = conn.prepareStatement(updateSql);
				psmt.setInt(1, score);
				psmt.setInt(2, best_Score);
				psmt.setInt(3, sum_Score);
				psmt.setInt(4, index);
//				psmt.setString(4, you.getId());
//				psmt.setString(5, you.getPw());
				row = psmt.executeUpdate();

			} else {
				System.out.println("rs가 실행이안댐");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}

	/////////////////////////////////////// 랜덤
	/////////////////////////////////////// 메소드////////////////////////////////////
	public int[] random() {

		int[] lotto = new int[89];
		Random random = new Random();

		for (int j = 0; j < 12; j++) {
			lotto[j] = random.nextInt(89);
			for (int i = 0; i < j; i++) {
				if (lotto[i] == lotto[j]) {
					j--;
					break;
				}
			}
		}
		return lotto;

	}

	public int lifeminus(boolean a) { // 생명감소 메소드

		if (a) {
			return 0;
		} else {
			return -1;
		}
	}


}
