import java.util.Scanner;
class EvenIndexCharacters{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the String");
		String s = sc.next();	
		for(int i=0 ; i<s.length() ; i+=2){
			System.out.println(s.charAt(i));
		}
	}
}