package questionpack4;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {


	      System.setProperty("file.encoding", "UTF-8");
	      Random random = new Random();
	      Scanner sc = new Scanner(System.in);
	      QuestionDTO you = null;

	      //////////////////////////////////////////////////////////////////////////////
	      MP3Player mp3 = new MP3Player();
	      MP3Player mp3_bgm = new MP3Player();

	      String comPath = "C:\\Users\\wjd1e\\OneDrive\\바탕 화면\\javaStudy\\project_other\\BGM\\";
	      ArrayList<Music> musicList = new ArrayList<Music>();
	      // ArrayList에 BGM추가

	      Music bgm = new Music("bgm", comPath + "bgm.mp3");
	      Music correct = new Music("correct", comPath + "correct.mp3");
	      Music die = new Music("die", comPath + "die.mp3");
	      Music incorrect = new Music("incorrect", comPath + "incorrect.mp3");
	      Music select = new Music("select", comPath + "select.mp3");
	      Music start = new Music("start", comPath + "start.mp3");
	      Music enter = new Music("enter", comPath + "enter.mp3");
	      Music appear = new Music("appear", comPath + "appear.mp3");

	      musicList.add(bgm);
	      musicList.add(correct);
	      musicList.add(die);
	      musicList.add(incorrect);
	      musicList.add(select);
	      musicList.add(start);
	      musicList.add(enter);
	      musicList.add(appear);
	      try {
	         //////////////////////////////////////////////////////////////////////////////////////////////////
	         mp3_bgm.play(musicList.get(0).getPath());
	         //////////////////////////////////////////////////////////////////////////////////////////////////

	         //////////////////////////////////////////////////////////////////////////////////////////////////
	         String[] titles = new String[36];
	         titles[0] = "────────────────────────────────────────────────────────────────────────────────────────────────────\r\n";
	         titles[1] = "──────────────────────────▒▒▒▒───────────────────────────▒▒▒▒▒──▒▒▒▒────────▒▒▒▒▒▒▒─────────────────\r\n";
	         titles[2] = "─────────────────▒▒▒▒▒▒▒▒▒▒▒##▒──▒▒▒▒▒▒▒▒▒▒▒▒───────────▒▒###▒──▒##▒──▒▒▒▒▒▒▒##▒##▒─────────────────\r\n";
	         titles[3] = "─────────────────▒########▒▒##▒─▒###########▒──────────▒###▒##▒─▒##▒──######▒##▒##▒─────────────────\r\n";
	         titles[4] = "─────────────────▒▒▒▒▒▒▒##▒▒##▒──▒▒▒▒▒##▒▒▒▒▒──────────▒##▒▒▒##▒▒##▒──▒▒##▒▒▒##▒##▒─────────────────\r\n";
	         titles[5] = "───────────────────────▒##▒▒##▒─────▒▒##▒─────────────▒▒#▒──▒##▒▒##▒───▒##▒─▒##▒##▒─────────────────\r\n";
	         titles[6] = "─────────────────▒########▒▒##▒─────▒####▒────────────▒▒#▒──▒##▒▒##▒───▒##▒─▒##▒##▒─────────────────\r\n";
	         titles[7] = "─────────────────▒▒▒▒▒▒▒##▒▒##▒────▒######▒───────────▒▒##▒▒▒##▒▒##▒───▒##▒─▒##▒##▒─────────────────\r\n";
	         titles[8] = "───────────────────────▒##▒▒##▒──▒▒###▒▒###▒▒▒─────────▒#######▒▒##▒───▒##▒─▒#####▒─────────────────\r\n";
	         titles[9] = "────────────────▒#############▒─▒###▒───▒####▒──────────▒▒▒▒▒▒──▒##▒───▒##▒─▒##▒##▒─────────────────\r\n";
	         titles[10] = "────────────────▒▒▒▒▒▒##▒▒▒##▒──▒▒▒─────▒▒▒▒▒───────────────────▒##▒───▒##▒─▒##▒##▒─────────────────\r\n";
	         titles[11] = "────────────────────▒##▒▒─▒##▒─────────────────────────▒▒▒▒▒────▒##▒───▒###▒▒##▒##▒─────────────────\r\n";
	         titles[12] = "───────────────────▒##▒───▒##▒──────────────────────────▒##▒────▒▒▒▒──▒##▒##▒##▒##▒─────────────────\r\n";
	         titles[13] = "──────────────────▒##▒────▒##▒──▒▒▒▒▒▒▒▒▒▒▒▒▒▒──────────▒##▒─────────▒##▒─▒####▒##▒─────────────────\r\n";
	         titles[14] = "─────────────────▒##▒─────▒##▒──▒############▒──────────▒##▒▒▒▒▒▒▒▒▒─##▒──▒####▒##▒─────────────────\r\n";
	         titles[15] = "─────────────────▒▒▒▒─────▒##▒──▒▒▒▒▒▒▒▒▒▒▒▒▒▒──────────▒##########▒─▒▒─────▒##▒##▒─────────────────\r\n";
	         titles[16] = "──────────────────────────▒▒▒▒───────────────────────────▒▒▒▒▒▒▒▒▒▒▒────────▒▒▒▒▒▒▒─────────────────\r\n";
	         titles[17] = "────────────────────────────────────────────────────────────────────────────────────────────────────\r\n";
	         titles[18] = "────────────────────────────────────────────────────────────────────────────────────────────────────\r\n";
	         titles[19] = "────────────────────────────────────────────────────────────────────────────────────────────────────\r\n";
	         titles[20] = "────────────────────────────────────────────────────────────────────────────────────────────────────\r\n";
	         titles[21] = "──────────────────────────▒▒▒▒▒▒▒▒─▒▒▒▒▒▒▒──▒▒▒──▒▒▒─▒▒▒────▒▒▒▒▒▒▒─▒▒▒─────────────────────────────\r\n";
	         titles[22] = "─────────────────────────▒#######▒─▒##▒##▒──▒##▒▒##▒─##▒───▒######▒─▒##▒────────────────────────────\r\n";
	         titles[23] = "──────────────────────────▒▒▒▒▒###▒▒##▒##▒──▒##▒▒##▒─##▒──▒##▒▒▒▒##▒▒##▒────────────────────────────\r\n";
	         titles[24] = "───────────────────────────────▒##▒▒##▒##▒──▒######▒─####▒▒##▒──▒##▒▒##▒────────────────────────────\r\n";
	         titles[25] = "───────────────────────────────▒##▒▒##▒##▒──▒##▒▒##▒─####▒▒###▒▒▒##▒▒##▒────────────────────────────\r\n";
	         titles[26] = "───────────────────────────────▒##▒▒##▒##▒──▒##▒▒##▒─##▒───▒######▒─▒##▒────────────────────────────\r\n";
	         titles[27] = "───────────────────────────────▒##▒▒#####▒──▒######▒─##▒──▒▒▒▒▒▒▒▒▒▒▒##▒────────────────────────────\r\n";
	         titles[28] = "───────────────────────────────▒##▒▒#####▒──▒▒▒▒▒▒▒▒▒▒▒▒──▒############▒────────────────────────────\r\n";
	         titles[29] = "───────────────────────────────▒##▒▒##▒##▒──▒##########▒──▒▒▒▒##▒▒▒▒▒##▒────────────────────────────\r\n";
	         titles[30] = "─────────────────────────────▒▒##▒─▒##▒##▒──────────▒##▒─────▒##▒▒#####▒────────────────────────────\r\n";
	         titles[31] = "────────────────────────────▒###▒──▒##▒##▒──▒▒▒▒▒▒▒▒▒##▒───────▒────▒##▒────────────────────────────\r\n";
	         titles[32] = "──────────────────────────▒▒##▒▒───▒##▒##▒──▒##########▒───▒##▒─────▒##▒────────────────────────────\r\n";
	         titles[33] = "─────────────────────────▒###▒─────▒##▒##▒──▒##▒▒▒▒▒▒▒▒▒───▒##▒▒▒▒▒▒▒▒▒─────────────────────────────\r\n";
	         titles[34] = "─────────────────────────▒▒▒───────▒##▒##▒──▒##########▒───▒###########▒────────────────────────────\r\n";
	         titles[35] = "───────────────────────────────────▒▒▒▒▒▒▒───▒▒▒▒▒▒▒▒▒▒▒────▒▒▒▒▒▒▒▒▒▒▒─────────────────────────────";

	         for (int i = 0; i < titles.length; i++) {
	            System.out.print(titles[i]);

	            try {
	               Thread.sleep(140);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	         try {

	            Thread.sleep(2000);
	         } catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	         //////////////////////////////////////////////////////////////////////////////////////////////////
	         mp3.play(musicList.get(7).getPath());
	         //////////////////////////////////////////////////////////////////////////////////////////////////

	         while (true) {
	            System.out.println("\n\n");
	            System.out.println(
	                  "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒>>   ");
	            System.out.println(
	                  "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ [1]로그인 ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ [2]회원가입 ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒>>      ");
	            System.out.print(
	                  "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒>>   ");
	            // 처음화면엔 게임시작을 지우고 회원가입과 랭킹확인만
	            try {
	               int choice = sc.nextInt();
	               // BGM(Enter)
	              mp3.play(musicList.get(6).getPath());
	               //
	               if (choice == 1) {
	                  // BGM(select)
	                  mp3.play(musicList.get(5).getPath());
	                  //
	                  System.out.println(
	                        "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	                  System.out.println("\n\t\t\t\t 로그인을 원하다.");
	                  System.out.print("\t\t\t\t ID 입력하다 : ");
	                  String id = sc.next();
	                  // BGM(Enter)
	                  mp3.play(musicList.get(6).getPath());
	                  //
	                  System.out.print("\t\t\t\t PW 입력하다 : ");
	                  String pw = sc.next();
	                  // BGM(Enter)
	                  mp3.play(musicList.get(6).getPath());
	                  //

	                  QuestionDAO dao = new QuestionDAO();
	                  QuestionDTO dto = dao.login(id,pw);
	                  if (dto != null) {
	                     // 로그인 성공했을때
	                     // BGM(select)
	                     //
	                     try {
	                        System.out.println("\t\t\t\t 접속중.......");
	                        Thread.sleep(3000);
	                        System.out.print(
	                              "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");
	                        mp3.play(musicList.get(5).getPath());
	                        System.out.println("\n\t\t\t\t" + dto.getName() + "님 환영합니다\n");
	                        Thread.sleep(750);
	                        mp3.play(musicList.get(5).getPath());
	                        System.out.println(
	                              "\t\t\t\t계급 : " + dto.getGrade() + "\t최고 점수: " + dto.getBest_score() + "\n");
	                        Thread.sleep(750);
	                        mp3.play(musicList.get(5).getPath());
	                        System.out.print(
	                              "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");
	                        Thread.sleep(1750);

	                     } catch (InterruptedException e) {
	                        e.printStackTrace();
	                     }

	                     you = dto;
	                     break;
	                  } else {
	                     // 로그인 실패했을때
	                     // BGM(incorrect)

	                     try {
	                        System.out.println("\t\t\t\t 접속중.......");
	                        Thread.sleep(2800);
	                        System.out.println("\t\t\t\t 재시도중.......");
	                        Thread.sleep(2400);
	                        mp3.play(musicList.get(3).getPath());
	                        System.out.println("\t\t\t\t 로그인 실패했습니다");
	                        Thread.sleep(550);
	                        System.out.println("\t\t\t\t 아이디와 비밀번호를 확인해주세요");

	                     } catch (InterruptedException e) {
	                        e.printStackTrace();
	                     }
	                     //

	                  }

	               }  else if (choice == 2) {
	                  // BGM(select)
	                 mp3.play(musicList.get(5).getPath());
	                  //

	                  System.out.print(
	                        "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	                  System.out.println("\n\t\t\t\t 함께을 원하다.");
	                  System.out.println("\t\t\t\t 가입을 시작합니다");
	                  System.out.print("\t\t\t\t ID 입력 : ");
	                  String id = sc.next();
	                  // BGM(Enter)
	                  mp3.play(musicList.get(6).getPath());
	                  //
	                  System.out.print("\t\t\t\t PW 입력 : ");
	                  String pw = sc.next();
	                  // BGM(Enter)
	                  mp3.play(musicList.get(6).getPath());
	                  //
	                  System.out.print("\t\t\t\t name 입력 : ");
	                  String name = sc.next();
	                  // BGM(Enter)
	                 mp3.play(musicList.get(6).getPath());
	                  System.out.println(
	                        "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	                  System.out.print("\n\t\t\t\t ID: " + id + "\n\t\t\t\t PW: " + pw + "\n\t\t\t\t name: " + name
	                        + "\n\n\t\t\t\t 입력한 정보가 확실합니까?");
	                  System.out.print("\n\n\t\t\t\t [1]네니오 [2]네 >> ");
	                  String joke = sc.next();

	                  //
	                  QuestionDAO dao = new QuestionDAO();
	                  QuestionDTO dto = new QuestionDTO(name, id, pw);
	                  int row = dao.join(dto);
	                  if (row > 0) {
	                     System.out.print(
	                           "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	                     // BGM(correct)
	                     try {
	                        Thread.sleep(1250);
	                        System.out.print("\n\n\t\t\t\t 함께 해도 될지 걱정중...");
	                        Thread.sleep(3500);
	                        System.out.println("\n\n\t\t\t\t 음.... ㅇㅋ");
	                        Thread.sleep(1250);
	                       mp3.play(musicList.get(1).getPath());
	                        //
	                        System.out.println("\n\n\t\t\t\t 함께하다 성공");
	                     } catch (Exception e) {
	                        e.printStackTrace();
	                     }

	                  } else {
	                     System.out.print(
	                           "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	                     // BGM(incorrect)
	                     mp3.play(musicList.get(3).getPath());
	                     //
	                     System.out.println("\n\n\t\t\t\t 함께하다 실패");

	                  }

	               } else {
	                  System.out.println("\n\n\t\t\t\t 누르는 거만 누르시오");
	                  System.out.println("\t\t\t\t 다시 선택하세요.");
	               }

	            } catch (Exception e) {
	               System.out.println("\n\n\t\t\t 응 예외처리 했어~ ");
	               System.out.println("\t\t\t\t 다시 입력해주세요");
	               sc.nextLine();
	            }

	         }
	/////////////////////////// 로그인 하면 루프 탈출

	         while (true) {
	            // BGM(Enter)
	            mp3.play(musicList.get(6).getPath());

	            System.out.println("\n\t\t\t\t" + you.getName() + "님 무엇을할까요?\n");
	            System.out.print("\t\t\t[1]게임시작\t[2]게임종료\t[3]랭킹확인  >> ");
	            // BGM(Enter)
	            mp3.play(musicList.get(6).getPath());
	            try {

	               int choice = sc.nextInt();
	               System.out.println();
	               int sum = 0;
	               int life = 5;
	               int minuslife = 0;// 필요 지역변수들

	               // BGM(Enter)
	               mp3.play(musicList.get(6).getPath());
	               //
	               if (choice == 1) {
	                  // BGM(select)

	                  mp3.play(musicList.get(5).getPath());
	                  //

	                  QuestionDAO dao = new QuestionDAO();
	                  int row = 0;

	                  int[] array = dao.random();/////// 추가
	                  int a = 0;/////// 추가

	                  while (true) {
	                     ArrayList<QuestionDTO> qd = dao.quiz();
	                     String answer = qd.get(array[a]).getAnswer(); // DB의 answer ///////array[a]추가
	                     int nScore = qd.get(array[a]).getQuestion_score();/////// array[a]추가

	                     try {
	                        System.out.println("\t\t\t\t 문제 내는중....");
	                        Thread.sleep(2000);

	                     } catch (InterruptedException e) {
	                        e.printStackTrace();
	                     }

	                     System.out.println(
	                           "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
	                     System.out.print("\n\t\t\t" + qd.get(array[a]).getQuestion() + " >> ");// get(정수형 변수)으로 랜덤출제
	                                                                           // ///////array[a]추가
	                     String input = sc.next(); // 사용자의 입력
	                     System.out.println();
	                     // BGM(Enter)
	                     mp3.play(musicList.get(6).getPath());
	                     //

	                     if (input.equals(answer)) {
	                        // BGM(correct)
	                        mp3.play(musicList.get(1).getPath());
	                        //
	                        System.out.println("\t\t\t\t 정답입니다 정답은 '" + answer + "' 입니다");
	                        sum += nScore;
	                        System.out.println("\t\t\t\t 현재 스코어 : " + sum);

	                     } else {
	                        // BGM(incorrect)
	                        mp3.play(musicList.get(3).getPath());
	                        //
	                        life += dao.lifeminus(input.equals(answer));
	                        System.out.println("\t\t\t\t 틀렸습니다. 정답은 '" + answer + "' 입니다. ");
	                        System.out.print("\t\t\t\t생명감소!! 남은 목숨 :(" + life + ")");
	                        for (int i = 0; i < life - minuslife; i++) {
	                           System.out.print("♥");
	                        }
	                        System.out.println("\n");

	                        if (life == 0) {
	                           mp3_bgm.play(musicList.get(2).getPath());

	                           System.out.println(
	                                 "생명이 다 하였습니다.\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	                           // GAME OVER //
	                           String[] gameover_t = new String[10];

	                           gameover_t[0] = " ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ \r\n";
	                           gameover_t[1] = "                                                                                                  \r\n";
	                           gameover_t[2] = "    ▒▒▒▒▒▒#    ▒▒▒▒▒#     ▒▒▒#   ▒▒▒#   ▒▒▒▒▒▒▒#         ▒▒▒▒▒▒#    ▒▒#   ▒▒#   ▒▒▒▒▒▒▒#   ▒▒▒▒▒▒# \r\n";
	                           gameover_t[3] = "   ▒▒######    ▒▒   ▒▒#   ▒▒▒▒# ▒▒▒▒#   ▒▒######        ▒▒####▒▒#   ▒▒#   ▒▒#   ▒▒######   ▒▒   ▒▒#\r\n";
	                           gameover_t[4] = "   ▒▒#  ▒▒▒#   ▒▒▒▒▒▒▒#   ▒▒#▒▒▒▒#▒▒#   ▒▒▒▒▒#          ▒▒#   ▒▒#   ▒▒#   ▒▒#   ▒▒▒▒▒▒▒    ▒▒▒▒▒▒##\r\n";
	                           gameover_t[5] = "   ▒▒#   ▒▒#   ▒▒###▒▒#   ▒▒# ▒▒##▒▒#   ▒▒####          ▒▒#   ▒▒#    ▒▒  ▒▒##   ▒▒####     ▒▒###▒▒#\r\n";
	                           gameover_t[6] = "    ▒▒▒▒▒▒#    ▒▒#  ▒▒#   ▒▒# ### ▒▒#   ▒▒▒▒▒▒▒#        #▒▒▒▒▒▒##     ▒▒▒▒##    ▒▒▒▒▒▒▒#   ▒▒#  ▒▒#\r\n";
	                           gameover_t[7] = "    #######    ###  ###   ###     ###   ########         #######      #####     #######     ##  ###\r\n";
	                           gameover_t[8] = "                                                                                                   \r\n";
	                           gameover_t[9] = " ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\r\n\n";

	                           for (int i = 0; i < gameover_t.length; i++) {

	                              System.out.print(gameover_t[i]);

	                              try {
	                                 Thread.sleep(140);
	                              } catch (InterruptedException e) {
	                                 e.printStackTrace();
	                              }
	                           }
	                           try {

	                              Thread.sleep(500);
	                           } catch (InterruptedException e) {
	                              e.printStackTrace();
	                           }
	                           // GAME OVER //

	                           break;
	                        }
	                        

	                     }
	                     a++;//////////// 추가
	                     if (a >= qd.size()) {//////////////////////////////////////////// if문 추가
	                        System.out.println("\t\t\t\t 더이상 풀 문제가 없습니다");
	                        break;
	                     }
	                  }

	                  row = dao.updateScore(you, sum);
	                  if (row > 0) {
	                     System.out.println();
	                     System.out.println("\t\t\t\t 업데이트성공");

	                  } else {
	                     System.out.println("\t\t\t\t 업데이트실패");
	                  }

	               } else if (choice == 2) {
	                  // BGM(select)
	                  mp3.play(musicList.get(5).getPath());
	                  //
	                  System.out.println("\t\t\t\t 게임을 종료합니다.");
	                  mp3_bgm.stop();
	                  break;

	               } else if (choice == 3) {
		                  // BGM(select)
		                  mp3.play(musicList.get(5).getPath());
		                  //
		                  System.out.println(
		                        "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒전설의 레전드▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");

		                  QuestionDAO dao = new QuestionDAO();
		                  ArrayList<QuestionDTO> dtolist = dao.serch();

		                  for (int i = 0; i < dtolist.size(); i++) {
		                     // BGM(Enter)
		                     try {
		                        mp3.play(musicList.get(6).getPath());
		                        System.out.println("\t\t\t" + (i + 1) + "등 :" + dtolist.get(i).getName() + "\t계급 :"
		                              + dtolist.get(i).getGrade() + "\t최고 점수:" + dtolist.get(i).getBest_score());
		                        Thread.sleep(250);
		                     } catch (InterruptedException e) {
		                        e.printStackTrace();
		                     }

		                  }
		                  System.out.println(
		                        "\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		               
	            	   
	               }
	            	   else {
	                  System.out.println("\t\t\t\t 다시 입력하세요.");
	               }
	            } catch (Exception e) {
	               System.out.println("\n\n\t\t\t\t 응 예외처리 했어~ ");
	               System.out.println("\t\t\t\t 다시 입력해주세요");
	               sc.nextLine();
	            }
	            
	         }
	      } catch (Exception e) {
	         System.out.println("\n\n\n\t\t\t\t 예외사항 오류발생 강제종료");
	         System.exit(0);
	      }
	   
	}

}
