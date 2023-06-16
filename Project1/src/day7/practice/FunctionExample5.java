package day7.practice;

public class FunctionExample5 {
public void f1() {
	System.out.println("f1");
}
public static void f2() {
	System.out.println("f2");
}
public final void f3() {
	System.out.println("f3");
}
}

class FunctionExample6 extends FunctionExample5  {
	@Override
	
	public void f1() {
		System.out.println("f11");
	}
	
	
}
