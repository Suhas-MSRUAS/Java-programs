class DuplicateElements{
	public static void main(String[] args){
		int[] arr = {5,1,2,5,3,2};
		for(int  i = 0 ; i<arr.length ; i++){
			for(int j = i+1 ; j<arr.length ; j++){
					if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
	}
}