package study.math;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a = 5;
		
		int fac = 1;
		
		for(int i = 1; i <= a; i--) {
			fac = fac * i;
		}
		
		System.out.println(fac);
	}

}
