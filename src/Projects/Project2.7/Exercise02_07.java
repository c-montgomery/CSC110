import java.util.Scanner;
	
public class Exercise02_07{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	//525600 minutes/year
	double minutes = input.nextDouble();
	System.out.println((int)(minutes/525600));
	System.out.println("Years and days below");
	//remainder is divided by 1440 to calculate days
	System.out.println((int)(minutes%525600)/(1440));
	
	}
}