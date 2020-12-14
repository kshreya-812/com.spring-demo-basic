package democorespring.shape_demo.bean;

public class Rectangle implements Shape {

	private int length;
	private int breadth;
	public void setlength(int length) {
		this.length=length;
	}
	
	public void setbreadth(int breadth) {
		this.breadth=breadth;
	}
	public double area() {
		// TODO Auto-generated method stub
		
		return (length*breadth);
	}

}
