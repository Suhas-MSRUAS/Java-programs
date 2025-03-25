class EvenIndex{
	public static void main(String[] args){
		int[] arr = {1,3,4,6,7,9,12,13};
		System.out.println("Numbers in Even Index are:");
		for(int i = 0; i<arr.length ; i+=2){
			System.out.println(arr[i]);
		}
		System.out.println("Numbers in Odd Index are:");
		for(int i = 1; i<arr.length ; i+=2){
			System.out.println(arr[i]);
		}
	}
}