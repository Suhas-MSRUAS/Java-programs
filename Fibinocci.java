import java.util.Scanner;
class Fibinocci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.print(a+" "+b+" ");
		for(int i=2 ; i<n ; i++){
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}