package be_study.quiz.quiz30;

public class Student {

	private String co;
	private int tagNum;
	
	public void setCo(String co) {
		this.co = co;
	}
	
	public String getCo() {
		return co;
	}
	
	private void methodInfo() {
		System.out.printf("학과는 %s 학번은 %d \n", co , tagNum);
	}

	public static void main(String[] args) {

//		//1.
//		다음을 만족하는 Student 클래스를 작성하시오.
//		· String 형의 학과와 정수형의 학번을 필드로 선언
//		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//		학과와 학번 필드에 적당한 값을 입력 후 출력
//		기능 추가.
//		· 필드를 모두 private 로 하고, 
//		getter 와 setter 를 구현하고
//		· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//		setter 를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
		
		
		Student student = new Student();
//		student.co = "영문";
//		student.tagNum=123456;
//		student.methodInfo();
		student.setCo("영문");
		student.methodInfo();
		
		
	}
}