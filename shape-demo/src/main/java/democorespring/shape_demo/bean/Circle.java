package democorespring.shape_demo.bean;

public class Circle implements Shape {
	private int radius;
	public void setRadius(int radius) {
		this.radius=radius;
	}

	public double area() {
		// TODO Auto-generated method stub
		double area=3.14*radius*radius;
		return area;
	}
	
}

