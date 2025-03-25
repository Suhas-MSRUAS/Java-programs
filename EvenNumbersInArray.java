import java.util.Scanner;
class EvenNumbersInArray{
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
			if(a%2==0){
				sum+=a;
			}
		}
		System.out.println("Sum of Even Numbers in Array is : "+sum);
	}
}