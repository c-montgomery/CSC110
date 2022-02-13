package Projects;
import java.util.Scanner;
import java.lang.Math;

public class Exercise2_15 {

	public static void main(String[] args) {
		System.out.println("Put in some numbers for x1 and y1");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("You entered "+ x1 + " and " + y1 + ", now enter another set of numbers");
		double x2 = input.nextDouble();
		double y2 =input.nextDouble();
		System.out.println("For your second set you entered: "+ x2+ " and " + y2);
		double x3 = x1 - x2;
		double y3 = y1 - y2;
		double x3squared = Math.pow(x3, 2);
		double y3squared = Math.pow(y3, 2);
		System.out.println(java.lang.Math.sqrt((x3squared+y3squared))+" units squared");
		
	}

}
