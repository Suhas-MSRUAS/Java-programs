import java.util.Scanner;
class Palindrome{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();	
		int temp = n;
		int rev = 0;
		while(n>0){
				int rem = n%10;
				rev = rev*10 + rem ;
				n/=10;
		}
		if(rev==temp){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not A Palindrome");
		}
	}
}