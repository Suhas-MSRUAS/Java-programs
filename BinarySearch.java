import java.util.Scanner;
import java.util.Arrays;
class BinarySearch{
	public static void main(String[] args){
		int[] arr = {1,5,2,9,3};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Search");
		int n = sc.nextInt();
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;
		int count = 0;
		while(low<=high){
			int mid = (low+high)/2;
			if(n==arr[mid]){
				System.out.println("Element Found");
				count++;
				break;		
			}
			else if(n>arr[mid]){
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		if(count==0){
		System.out.println("Element Not Found");	
	}
	}
}