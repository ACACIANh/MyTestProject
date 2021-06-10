package test.acacian.superimplement;

public abstract class ClassA implements InterfaceA, InterfaceB, InterfaceC{
	
	//@Override를 안붙여도 되는건가봉가
	public void methodA() {
		System.out.println("ClassA.methodA() call");
	}	
	public void methodB() {
		System.out.println("ClassA.methodB() call");
	}
	public void methodC() {
		System.out.println("ClassA.methodC() call");
	}

}
