import java.util.Scanner;
class PatternN{
	public static void main(String[] args){
				Scanner sc = new Scanner(System.in);				
				System.out.println("Enter the value");
				int n = sc.nextInt();
				for(int i = 1 ; i<=n ; i++)
				{
						for(int j = 1 ; j<=n ; j++)
						{
								if(i==j || j==1 || j==n)
								{
										System.out.print("*");
								}
								else
								{
										System.out.print(" ");
								}
						}
					System.out.println();
				}
		}
}