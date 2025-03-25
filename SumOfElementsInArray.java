import java.util.Scanner;
class SumOfElementsInArray{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the "+size+" elements");
			for(int i = 0 ; i<arr.length ; i++){
				arr[i]=sc.nextInt();
			}
			int sum = 0;
			for(int a : arr){
				sum+=a;
		}	
		System.out.println("Sum of elements in array is :"+sum);
		double avg = (double)sum/size;
		System.out.println("Average of elements in array is :"+avg);
	}
}