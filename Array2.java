import java.util.Scanner;
class Array2{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the "+size+" elements");
			for(int i = 0 ; i<arr.length ; i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("Elements in Array are :");
			for(int a : arr){
				System.out.println(a);
			}			
	}
}