package Projects;
import java.util.Scanner;
import java.lang.Math;

public class Exercise2_19 {

	public static void main(String[] args) {
		System.out.println("Put in some numbers for x1 and y1");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("You entered "+ x1 + " and " + y1 + ", now enter another set of numbers");
		double x2 = input.nextDouble();
		double y2 =input.nextDouble();
		System.out.println("For your second set you entered: "+ x2+ " and " + y2);
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double x1length = (x1-x2);
		double y1length = (y1-y2);
		double x2length = (x2-x3);
		double y2length = (y2-y3);
		double x3length = (x3-x1);
		double y3length = (y3-y1);
		
		double side1 = java.lang.Math.sqrt(java.lang.Math.pow((x1length),2)+ java.lang.Math.pow((y1length),2));
		double side2 = java.lang.Math.sqrt(java.lang.Math.pow((x2length),2)+ java.lang.Math.pow((y2length),2));
		double side3 = java.lang.Math.sqrt(java.lang.Math.pow((x3length),2)+ java.lang.Math.pow((y3length),2));
		
		double s = (side1 + side2 + side3)/2;
		System.out.println(s);
		double solution = (java.lang.Math.sqrt((s*(s - side1)*(s - side2)*(s - side3))));
		System.out.println("total area: " + solution);
		
	}

}
