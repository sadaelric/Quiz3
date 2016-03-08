package base;

public abstract class Triangle extends GeometricObject {
private double side1 = 1.0;
private double side2 = 1.0;
private double side3 = 3.0;
public Triangle(){
}

	public Triangle(double side1,double side2,double side3){
	
	}
public double getSide1() {
	return side1;
}

public double getSide2() {
	return side2;
}
public double getSide3() {
	return side3;
}
public double getArea() {
	return (side1*side2)*.5;
	
}

public double getPerimeter() {
	return side1+side2+side3;
}
public String toString(){
	return ("The triangle has the sides " +side1+","+side2+"and"+side3+"the area equal to"
			+getArea()+ "and the perimiter is"+getPerimeter()+"these are the specification of the triangle"); 
}
}
