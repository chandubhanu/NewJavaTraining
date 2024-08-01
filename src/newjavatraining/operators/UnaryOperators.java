package newjavatraining.operators;

public class UnaryOperators {

	public static void main(String[] args) {
		//Post-fix operator
		int a=3;
		int b=4;
		System.out.println(a++);
		System.out.println(b--);
        System.out.println(a);
        System.out.println(b);
	//Pre-Fix Operator
        //1
        int c=5;
        int d=6;
        System.out.println(++c);
        System.out.println(--d);
        //2
        int e=7;
        int f=5;
        System.out.println(-e);
        System.out.println(+f);
        //logical negotaion(!)
        boolean g=true;
        System.out.println(!g);
        //Logical bitwise(~);
        int h=-10;
        System.out.println(~h);
        
	}

}
