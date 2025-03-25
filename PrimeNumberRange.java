import java.util.Scanner;
class PrimeNumberRange{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);				
				System.out.println("Enter the first value");
				int n1 = sc.nextInt();
				System.out.println("Enter the second value");
				int n2 = sc.nextInt();
				for(int j = n1 ; j<=n2 ; j++){
					boolean b = true;
					for(int  i = 2 ; i<j ; i++){
					if(j%i==0){
					b = false;
					break;
				}	
			}
			if(b){
			System.out.println(j);	
			}
		}
	}
}