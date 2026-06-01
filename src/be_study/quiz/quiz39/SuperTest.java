package be_study.quiz.quiz39;

public class SuperTest  {

	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("찌르꼬",200);
//		orc.name ="찌르꼬";
//		orc.hp = 100;
		System.out.printf("이름: %s 채력: %d \n",orc.name, orc.hp);
		System.out.println(orc.toString());
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior o1 = new OrcWarrior("피죤투",300,10);
		System.out.printf("이름: %s 채력: %d 방어력: %d \n",o1.name,o1.hp,o1.amor);
		System.out.println(o1.toString());
	}
}

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		String str = "Orc { name :" + name+ " , hp : " + hp + "}";
		return str;
	}
}

class OrcWarrior extends Orc{
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		//return "이름 :"+name+" 체력 :"+ hp+ " 방어력 :"+ amor;
		return String.format("OrcWarrior { name :" + name + " , hp :" + hp + "amor :" + amor +" }");
		
	}
}
