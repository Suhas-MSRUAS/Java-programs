import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);				
				System.out.println("Enter the value");
				int n = sc.nextInt();
				boolean b = true;
				for(int  i = 2 ; i<n ; i++){
				if(n%i==0){
					b = false;
				}	
			}
		}
}