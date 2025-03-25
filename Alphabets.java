import java.util.Scanner;
class Char{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z'){
			System.out.println(ch+" is a Small Letter");
		}
		else if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is a Capital Letter");
		}
		else{
			System.out.println(ch+" is not a Alphabet");
		}
	}
}