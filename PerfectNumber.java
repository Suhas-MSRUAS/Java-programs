import java.util.Scanner;
class PerfectNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();	
		int sum = 0;
		for(int i = 1 ; i<n ; i++){
			if(n%i==0){
				sum+=i;
			}
		}
		if(sum==n){
			System.out.println("Perfect Number");
		}else{
			System.out.println("Not A Perfect Number");
		}
	}
}