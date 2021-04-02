package p05.lecture;

public class A18ArraySample {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 4, 5, 6, 7};
		int[] arr2 = new int[] {99, 88, 70}; 
		
		double abc1 = abc(arr1);
		double abc2 = abc(arr2);
		
		System.out.println(abc1);
		System.out.println(abc2);
	}
	
	public static double abc(int[] arr) {
		double abc = 0;
		for (int i = 0; i < arr.length; i++) {
//			abc += ((double)arr[i] / arr.length); 내가 푼것
			abc += arr[i];
		}
		abc = abc / arr.length;
		return abc;
	}
}
