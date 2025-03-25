import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the String");
		String s = sc.next();	
		String[] arr = s.split("");
		for(int i = 1 ; i<arr.length ; i+=2){
			int a = Integer.parseInt(arr[i]);
			for(int j=1 ; j<=a ; j++){
				System.out.print(arr[i-1]);
			}
		}
	}
}