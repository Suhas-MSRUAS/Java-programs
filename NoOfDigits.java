import java.util.Scanner;
class NoOfDigits{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		long n = sc.nextLong();
		int count = 0;
		while(n!=0){
			count++;
			n/=10;
		}
		System.out.println("No of Digits = "+count);
	}
}