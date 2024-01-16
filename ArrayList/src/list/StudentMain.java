package list;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {

		// 1.Student 자료형을 보관할 수 있는 slist 라는 이름을 가진 ArrayList 생성
				ArrayList<Student> slist = new ArrayList<Student>();
			    
				// 데이터 추가 이름 나이 넣고 이름만 출력
				//Student st1= new Student("우석",25);
				
				//slist.add(st1);
				
				slist.add(new Student("우석",25));           // 한 줄 표현
				// System.out.println(st1.getName());
				// System.out.println(st1.getAge());
				System.out.println(slist.get(0).getName());     // get(0)은 0번째 인덱스에서 getName()을 뽑는다 get(0)은 st1이라는 객체이다.
				System.out.println(slist.get(0).getAge());       // 즉 0번째 인덱스가 st1 객체이다. 즉 인덱스 하나가 객체하나이다
				                                                // 그래서 클래스들의 집합=여러개의 객체를 보관 객체는 하나의 인덱스
				                                                 // get(0)을 출력하면 주소 값이 나온다  // get() 매서드=slist의 매서드는 리턴타입이 Student
				                                                  //getName()매서드=Student의 매서드는 리턴타입이 스트링 
				
				// 4 팀원 4개추가하기 //for-each문사용하기
				
				slist.add(new Student("ㅁㅁ",25));  // 인덱스0번  //slist라는 리스트의 0번 인덱스에 Student 클래스의 객체 1개를 저장
				slist.add(new Student("ㅋㅋ",28));  // 인덱스1번  //slist라는 리스트의 1번 인덱스에 Student 클래스의 또 객체 1개를 저장
				slist.add(new Student("ㅂㅂ",29));  
				slist.add(new Student("ㅜㅜ",30));
				
				System.out.println("===== 인원 정보 출력====");
				
				for(Student s : slist) {                                   //  반복시킬 객체변수 : 반복시킬 리스트(배열)
					
					System.out.println(s.getName()+"\t"+s.getAge());       // 0번째 인덱스부터 순차적으로 쭉 돌아가면서 출력
				}
				// 객체배열과 객체리스트 차이는 바로 가변성(크기조정)
				// 공통점은 각각의 인덱스에 객체를 넣는 다는 것
//				ArrayList<Student> slist = new ArrayList<Student>();
//				--> 내 객체를 저장하는 배열리스트 클래스***이다.
//
//				Pokemon []           bag = new Pokemon[3];  
//				--> 내 객체가 배열에~  ***클래스는 아니다.
//
//				 slist.get(0).getName();
//				--> slist는 클래스 객체이므로 .매서드를 부르고 get(0)은 Student타입을 반환하는 클래스의 객체와 같으므로
//				--> 다시 매서드를 호출한다. 물론 매서드 이므로 매개변수가 있다면 적어준다
//				--> slist 클래스이자 리스트이므로 0번째 인덱스에 Student 클래스 객체를 넣는다. 그  인덱스 0번째 중 
//				--> 이름필드를 getName() 매서드로 호출한다
//				bag[0].getName();
//				-->  bag는 클래스가 아닌 배열이다 0번째 인덱스의 있는 Pokemon클래스의 객체가 있는데 그 객체의 필드중 이름을
//				-->  getName() 매서드로 호출한다

	}

}
