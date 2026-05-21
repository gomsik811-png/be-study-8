package be_study.quiz.quiz24;

public class Person {

	/*
	 * 아래 컨셉으로 클래스를 만든 후, 해당 클래스를 기반으로 각자 인스턴스 객체를 한개씩 생성해서 값을 저장하고 출력!!!
	 * 
	 * 
	 * 사람 클래스
	 * 
	 * 이름 
	 * 성별 나이 키 몸무게 직업 혈액형 건강상태 수면중여부
	 */
	
	String name;
	String gender;
	int age;
	int tall;
	int weight;
	String job;
	String blood;
	String health;
	String sleepCondition;
	
	
	Person(){	
		
		
	}
	Person(String name,String gender,
	int age,
	int tall,
	int weight,
	String job,
	String blood,
	String health,
	String sleepCondition) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
		this.job = job;
		this.blood = blood;
		this.health = health;
		this.sleepCondition = sleepCondition;
	}

}
