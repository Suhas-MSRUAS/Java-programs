import java.util.Scanner;
class XylemOrPhloem{
	public  static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();	
		int last = n%10;
		n/=10;
		int first = 0;
		int sum1 = 0;int sum2 = 0;
		while(n>0){
				if(n<10){
					first=n;
				}else{
					sum2=sum2+n%10;
				}
				n/=10;
		}
		sum1=first+last;
		if(sum1==sum2){
			System.out.println("Xylem Number");
		}else{
			System.out.println("Phloem Number");
		}
	}
}