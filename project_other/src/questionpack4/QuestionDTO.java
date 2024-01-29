package questionpack4;

public class QuestionDTO {
	

	private String name;
	private String id;
	private String pw;
	
	
	private String grade;
	private int best_score;
	
	private int qeustion_num;
	private String question;
	private String answer;
	private int question_score;
	
	
	String getQuestion() {
		return question;
	}

	String getAnswer() {
		return answer;
	}

	int getQuestion_score() {
		return question_score;
	}

	int getQeustion_num() {
		return qeustion_num;
	}

	
	public QuestionDTO(String name, String id, String pw, String grade, int best_score, int qeustion_num) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.grade = grade;
		this.best_score = best_score;
		this.qeustion_num = qeustion_num;
	}

	public QuestionDTO(int qeustion_num, String question, String answer, int question_score) {
		this.qeustion_num = qeustion_num;
		this.question = question;
		this.answer = answer;
		this.question_score = question_score;
	}



	public QuestionDTO(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	

	public QuestionDTO(String name, String id, String pw, String grade, int best_score) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.grade = grade;
		this.best_score = best_score;
	}

	public QuestionDTO(String user_name, String grade, int best_score) {
		this.name = user_name;
		this.grade = grade;
		this.best_score = best_score;
	}





	String getGrade() {
		return grade;
	}



	int getBest_score() {
		return best_score;
	}



	String getName() {
		return name;
	}

	String getId() {
		return id;
	}

	String getPw() {
		return pw;
	}
	
	
	
	
	
	
	
	
	
	
	


}
