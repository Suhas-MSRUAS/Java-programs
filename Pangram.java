import java.util.Scanner;
class Pangram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String s = sc.nextLine();
		int count = 0;
		if(s.length()<26){
			System.out.println("Not A Pangram");
		}else{
			s=s.toLowerCase();
			for(char ch = 'a' ; ch<='z' ; ch++){
					if(s.contains(String.valueOf(ch))){
						count++;
					}
			}
		if(count==26){
				System.out.println("Pangram");
			}else{
				System.out.println("Not A Pangram");
			}
		}
	}
}