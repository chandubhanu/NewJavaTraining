package newjavatraining.operators;

public class bitwiseandlogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bitwise operator
		int a=5;
		int b=6;
		int c=10;
		System.out.println(a>b&a++<c);
		System.out.println(a);
		System.out.println(a>b|a++<c);//true || true = true  
		System.out.println(a);

		
		//Logical operator
		System.out.println(a>b&&a++<c);
		System.out.println(a);
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);

	}

}
