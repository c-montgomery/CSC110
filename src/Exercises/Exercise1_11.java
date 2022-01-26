package Exercises;

public class Exercise1_11 {
	
	public static void main(String[] args) {
		double yearSeconds = 365 * 24.0 * 60.0 * 60;
		float population = 312032486;
		float birth = population/7;
		float death = population/13;
		float immigrant = population/45;
		// TODO Auto-generated method stub
		System.out.println(312032486);
		System.out.println(yearSeconds);
		System.out.println(312032486 + ((yearSeconds/7)+ (yearSeconds/45)-yearSeconds/45));
		System.out.println(312032486 + 2*((yearSeconds/7)+ (yearSeconds/45)-yearSeconds/45));
		System.out.println(312032486 + 3*((yearSeconds/7)+ (yearSeconds/45)-yearSeconds/45));
		System.out.println(312032486 + 4*((yearSeconds/7)+ (yearSeconds/45)-yearSeconds/45));
		System.out.println(312032486 + 5*((yearSeconds/7)+ (yearSeconds/45)-yearSeconds/45));
	}

}
