package democorespring.shape_demo.bean;

public class ShapeArea {

	private Shape shape;
	public void setShape(Shape shape) {
		this.shape=shape;
	}
	
	public double calArea() {
		double res=shape.area();
		return res;
	}
}
