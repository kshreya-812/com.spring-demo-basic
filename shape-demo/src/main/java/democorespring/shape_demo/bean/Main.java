package democorespring.shape_demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        ShapeArea sarea1=(ShapeArea) context.getBean("shapearea");
        double area= sarea1.calArea();
        System.out.println("Area:" +area);
	}

}
