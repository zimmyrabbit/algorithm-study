package study.math;

import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		
		int fibo1 = 1;
		int fibo2 = 1;
		int fibo3;
		
		int num = 10;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(fibo1);
		arr.add(fibo2);
		
		for(int i=0; i<num-2; i++) {
			
			fibo3 = fibo1 + fibo2;
			
			arr.add(fibo3);
			
			fibo1 = fibo2;
			fibo2 = fibo3;
		}
		
		Iterator<Integer> iter = arr.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}  
}
