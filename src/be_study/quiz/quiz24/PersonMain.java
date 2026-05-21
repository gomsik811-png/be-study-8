package be_study.quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 아래 컨셉으로 클래스를 만든 후, 해당 클래스를 기반으로 각자 인스턴스 객체를 한개씩 생성해서 값을 저장하고 출력!!!
		 * 
		 * 
		 * 사람 클래스
		 * 
		 * 이름 성별 나이 키 몸무게 직업 혈액형 건강상태 수면중여부
		 */
		
		Person person1 = new Person();
		 person1.name = "류현우";
		 person1.gender = "남자";
		 person1.age = 26;
		 person1.tall = 320;
		 person1.weight = 320;
		 person1.job ="white water";
		 person1.blood = "A";
		 person1.health = "안좋음";
		 person1.sleepCondition = "피곤함";
		 
		 System.out.println( person1.name);
		 System.out.println(person1.gender);
		 System.out.println(person1.age);
		 System.out.println(person1.tall);
		 System.out.println(person1.weight);
		 System.out.println(person1.job);
		 System.out.println(person1.blood);
		 System.out.println(person1.health);
		 System.out.println(person1.sleepCondition);
		 
		 System.out.println("-------------------------");
		 
		 Person p1 = new Person("이름","남자",33,200,200,"백수","A","안좋음","피곤함");
		 

	}

}
