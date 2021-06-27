package study.sort;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,2,1,5,7,8,3,9};
		
		int min = 0;
		
		for(int i=0; i<arr.length; i++) {
			min = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
