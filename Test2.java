import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");	
		String s = sc.nextLine();
		String temp = "";
		String[] arr = s.split(" ");
		for(int i = arr.length-1 ; i>=0 ; i--){
			String rev = "";
			String a = arr[i];
			for(int j = a.length()-1 ; j>=0 ; j--){
				rev+=a.charAt(j);
			}
			temp+=(rev+" ");
		}
		temp = temp.trim();
		temp = temp.replace(' ','_');
		System.out.println(temp);
	}
}