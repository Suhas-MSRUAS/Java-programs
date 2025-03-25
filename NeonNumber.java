import java.util.Scanner;
class NeonNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();	
		int sum = 0;
		int sq = n*n;
		while(sq>0){
			int rem = sq%10;
			sum+=rem;
			sq/=10;
		}
		if(sum==n){
			System.out.println("Neon Number");
		}else{
			System.out.println("Not A Neon Number");
		}
	}
}