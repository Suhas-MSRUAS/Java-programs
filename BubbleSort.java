import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int arr[] = new int[sc.nextInt()] ;
		System.out.println("Enter the elements");
		for(int i = 0 ; i<arr.length ; i++){
			arr[i]=sc.nextInt();	
		}
		for(int i =0 ; i<arr.length ; i++){
			for(int j = i+1 ; j<arr.length ; j++){
					if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int a : arr){
			System.out.println(a);
		}
	}
}