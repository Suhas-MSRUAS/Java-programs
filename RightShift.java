class RightShift{
	public static void main(String[] args){
			System.out.println(fact(5));
	}
	static int fact = 1;
	public  static int fact(int a){
		if(a>0){
		fact*=a;
		a--;
		fact(a);
		}
return fact;
	}
}