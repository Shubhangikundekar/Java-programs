package Java;

public class constructor{

	public constructor() {
		System.out.println("i am default constructor");
	}
	public constructor(int a) {
		System.out.println("i am parameterized constructor");
		System.out.println("value of a is:"+a);
	}
	public constructor(int a,int b) {
		System.out.println("i am parameterized constructor");
		System.out.println("value of a is:" +a);
		System.out.println("value of b is:" +b);
		System.out.println("value of a and b is:"+a+" "+b);
	}
    public static void main(String[] args) {
		constructor a=new constructor();
		constructor b=new constructor(35);
		constructor c=new constructor(35 , 12);
	}

}