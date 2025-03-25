import java.util.Scanner;
class Sum{
	public static void main(String[] args){
		int[] arr = {1,3,4,6,7,9,12,13};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Search");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0 ; i<arr.length ; i++){
			if(n==arr[i]){
				count++;
				break;
			}
		}
		if(count>0){
			System.out.println("Found");
		}else{
			System.out.println("Not Found");
		}
	}
}