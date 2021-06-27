package study.sort;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,1,5,7,8,3,9};
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
