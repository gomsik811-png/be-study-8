package be_study.quiz.quiz26;

public class Circle {

	int radius;
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	double getArea() {
		double area = radius * radius * 3.14;
		return area;
		// return radius * radius * 3.14;
	}
}
