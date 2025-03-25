import java.util.Scanner;
class PerfectNumberRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int n = sc.nextInt();	
		int m = sc.nextInt();
		for(int i = n ; i<=m ; i++){
			int sum = 0;
			for(int j = 1 ; j<i ; j++){
				if(i%j==0){
				sum+=j;
				}
			}
			if(sum==i){
			System.out.println(i);
			}
		}
	}
}