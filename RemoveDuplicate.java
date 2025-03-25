import java.util.Arrays;
class RemoveDuplicate{
	public static void main(String[] args){
		int[] arr = {1,1,2,5,3,5,4};
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;
		for(int i = 0 ; i<arr.length-1 ; i++){
			if(arr[i]!=arr[i+1]){
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		System.out.println("j = "+j);
		arr=temp;
		for(int i = 0 ; i<=j ; i++){
			System.out.println(arr[i]);
		}
	
	}
}