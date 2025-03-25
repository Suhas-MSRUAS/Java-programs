import java.util.Arrays;
class AssemblyLine{
	public static void main(String[] args){
		int arr[] = {1,5,6,4,9,2,8,7};
		int brr[] = new int[arr.length];
		for(int i = 0 ; i<arr.length ; i++){
			brr[i]=arr[i];
		}
		Arrays.sort(brr);
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]!=brr[i]){
				System.out.println(i);
			}
		}
	}
}