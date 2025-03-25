import java.util.Scanner;
class SumOfFirstAndLast{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();	
		int last = n%10;
		int first = 0;
		while(n>0){
				if(n<10){
					first=n;
				}
				n/=10;
		}
		System.out.println(first+last);
	}
}