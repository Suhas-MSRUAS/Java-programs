import java.util.Scanner;
class ArmStrong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	int temp1 = n;
	int temp2 = n;
	int count = 0;
	while(temp1!=0){
		count++;
		temp1/=10;		
	}
	int sum = 0;
	while(temp2!=0){
		int rem = temp2%10;
		int pro = 1;
		for(int i = 0 ; i<count ; i++){
			pro*=rem;
		}
	sum+=pro;
	temp2/=10;
	}

	if(sum==n){
		System.out.println("Armstrong Number");
	}else{
		System.out.println("NOt A Armstrong Number");
	}
}
}