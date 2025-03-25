import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first value");
	int a = sc.nextInt();
	System.out.println("Enter the Operator[+,-,*,/]");
	char ch = sc.next().charAt(0);
	System.out.println("Enter the second value");
	int b = sc.nextInt();
	switch(ch){
		case '+':{
			System.out.println(a+b);
		}break;
		case '-':{
			System.out.println(a-b);
		}break;
		case '*':{
			System.out.println(a*b);
		}break;
		case '/':{
			System.out.println(a/b);
		}break;
		default : {
			System.out.println(" please select correct Operator");
		}
	}
}
}