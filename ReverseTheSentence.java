import java.util.Scanner;
class ReverseTheSentence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");	
		String s = sc.nextLine();
		String temp = "";
		String[] arr = s.split(" ");
		for(int i = arr.length-1 ; i>=0 ; i--){
			temp+=(arr[i]+" ");
		}
		System.out.println(temp);
	}
}