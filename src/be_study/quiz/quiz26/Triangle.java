package be_study.quiz.quiz26;

public class Triangle {

	double width;
	double height;
	//double로 준게 아니라 int 로 줬을시 리턴할때 (double)을 입혀주거나 2로 나누는 값에 2.0으로준다
	
	void setSize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height / 2;
		// 
	}
	
	
}
