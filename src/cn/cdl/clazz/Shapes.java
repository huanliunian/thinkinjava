package cn.cdl.clazz;

abstract class Shape{
	void draw(){
		System.out.println(this+".draw");
	}
	abstract public String toString();
}

class Circle extends Shape{
	@Override
	public String toString() {
		return "Circle";
	}
}

class Square extends Shape{
	@Override
	public String toString() {
		return "Square";
	}
}

class Triangle extends Shape{
	@Override
	public String toString() {
		return "Triangle";
	}
}

class Rhomboid extends Shape{
	@Override
	public String toString() {
		return "Rhomboid";
	}
}

public class Shapes {

	public static void main(String[] args) {
		Rhomboid rhomboid = new Rhomboid();
//		rhomboid = (Rhomboid) rhomboid;
		System.out.println(rhomboid instanceof Shape);
		if(rhomboid instanceof Shape){}
//			rhomboid = (Circle) rhomboid;
	}

}
