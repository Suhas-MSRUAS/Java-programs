import java.util.Scanner;
class CountingCharacters{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the String");
		String s = sc.next();	
		int count = 0;
		for(int i=0 ; i<s.length() ; i++){
			count++;
		}
	System.out.println("The No Of Characters in string = "+count);
	}
}