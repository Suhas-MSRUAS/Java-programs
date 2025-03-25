import java.util.Scanner;
class VowelsOrConsonents{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int v = 0;
		int c = 0;
		for(int i = 0 ; i<s.length() ; i++){
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				v++;
			}else{
				c++;
			}
		}
	System.out.println("No of Vowels = "+v);
	System.out.println("No of Consosnents = "+c);
	}	
}