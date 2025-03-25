import java.util.Scanner;
class ReverseTheString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");	
		String s = sc.next();
		StringBuilder temp = new StringBuilder();
		
		for(int i = s.length()-1 ; i>=0 ; i--){
			temp=temp.append(s.charAt(i));
		}
		
		System.out.println(temp);
	}
}