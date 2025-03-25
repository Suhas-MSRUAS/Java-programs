import java.util.Scanner;
class PrimeNumbersInArray{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the "+size+" elements");
			for(int i = 0 ; i<arr.length ; i++){
				arr[i]=sc.nextInt();
			}
			System.out.println("Prime Numbers in Array are:");
			for(int i = 0 ; i<arr.length ; i++){
			int a = arr[i];
			boolean b = true;
			for(int j = 2 ; j<a ; j++){
				if(a%j==0){
					b=false;
					break;
				}
			}
		
			if(b){
				System.out.println(a);
			}	
		}
	}
}