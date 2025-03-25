import java.util.Scanner;
class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int n = sc.nextInt();
		if((n%100==0 && n%400==0) || (n%4==0)){
			System.out.println(n+" is a Leap Year");
		}else{
			System.out.println(n+" is not a Leap Year");
		}
	}
}