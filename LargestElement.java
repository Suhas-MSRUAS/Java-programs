class LargestElement{
	public static void main(String[] args){
		int[] arr = {1,5,2,9,3};
		int largest = arr[0];
		for(int i = 1 ; i<arr.length ; i++){
			if(largest < arr[i]){
					largest=arr[i];
			}
		}
		int smallest = arr[0];
		for(int i = 1 ; i<arr.length ; i++){
			if(smallest > arr[i]){
					smallest=arr[i];
			}
		}
	System.out.println(largest+smallest);
	}
}