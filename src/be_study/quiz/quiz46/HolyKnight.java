package be_study.quiz.quiz46;

public class HolyKnight implements Tanker, Healer {
	
	private String name;
	private int hp;

	public HolyKnight(String name, int hp) {
	this.name = name;
	this.hp = hp;
	}

	@Override
	public void increaseHp() {
		// TODO Auto-generated method stub
		System.out.println(name+"님이 채력은 "+hp+" 입니다.");
		System.out.println("전체 체력 +50 증가시킵니다.");
		hp = hp+50;
		System.out.println(name+"님이 채력은 "+hp+" 입니다.");
	}

	@Override
	public void heal() {
		hp = hp+30;
		System.out.println("체력 30을 회복시킵"
				+ "니다.");
	}

}

