import java.util.Scanner;
class SpyNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();	
		int sum = 0;
		int pro = 1;
		for(int i = n ; i>0 ; i/=10){
			int rem = i%10;
			sum+=rem;
			pro*=rem;
			
		}
		if(sum==pro){
		System.out.println("Spy Number");
		}else{
		System.out.println("Not A Spy Number");
		}
	}
}