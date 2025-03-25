import java.util.Scanner;
class RangeOfEven{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first range");
	int n1 = sc.nextInt();
	System.out.println("Enter the second range");
	int n2 = sc.nextInt();
	for(int i = n1 ; i<=n2 ; i++){
		if(i%2==0){
			System.out.println(i);
		}
	}
}
}