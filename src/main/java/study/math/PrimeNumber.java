package study.math;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 120;
		
		for(int i=2; i<=num; i++) {
			boolean primeFlag = true;
			
			for(int j=2; j <= Math.sqrt(i); j++) {
				if(i % j == 0) {
					primeFlag = false;
					break;
				}
			}
			
			if(primeFlag) {
				System.out.print(i + " ");
			}
		}
	}

}
