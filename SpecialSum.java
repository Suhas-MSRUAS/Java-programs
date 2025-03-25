import java.util.Scanner;
class SpecialSum{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9,1};
		System.out.println("Enter the n value");
		int n = s.nextInt();
		int sum = 0;
		int j = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(j<n){
				sum+=arr[i];
				j++;
			}else{
				j=0;
				i+=n-1;	
			}
		}
	System.out.println(sum);
	}
}