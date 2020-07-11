package week3;

public class SumArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		int sum =0;
		double average =0.0;
		
		for( int i=0;i<arr.length;i++) {
			
	//	for(int i : arr) {
			sum = sum+arr[i];
		}		
		average = sum/arr.length;
	}

}
