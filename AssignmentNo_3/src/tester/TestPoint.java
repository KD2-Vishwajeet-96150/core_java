package tester;
import com.app.geometry.*;
import java.util.Scanner;

public class TestPoint {
	public static Scanner sc = new Scanner(System.in);
	public static void accept(Point2D obj) {
		if(obj instanceof Point2D) {
			
			double x,y;
			System.out.println("Enter x co-ordinate");
			x= sc.nextDouble();
			obj.setX(x);
			System.out.println("Enter y co-ordinate");
			y = sc.nextDouble();
			obj.setY(y);
			
		}
	}
	
	public static void print(Point2D obj) {
	}

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		Point2D p2 = new Point2D();
		TestPoint.accept(p1);
		TestPoint.accept(p2);
		String details = p1.getDetails();
		System.out.println(details);
		boolean flag = p1.isEqual(p2);
		System.out.println(flag);
		
		if(!flag) {
			double distance =  p1.calculateDistance(p2);
			System.out.println(distance);
		}

	}

}
