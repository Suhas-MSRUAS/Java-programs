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
					break;
				}	
			}
		if(b){
			System.out.println(n+" is a Prime Number");	
		}
		else{
			System.out.println(n+" is not a Prime Number");	
		}
	}
}