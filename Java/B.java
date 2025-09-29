package Java;

public class B {
int xb=40;

	public void m1() {
		System.out.println("i am in m1 of class B");
	
	}
	public void m2() {
		System.out.println("i am in m2 of class B");	
		}
    public void m3() {
	System.out.println(this.xb);
    }
	public static void main(String[] args) {
		new B().m3();
	}

}
