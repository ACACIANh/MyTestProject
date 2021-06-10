package test.acacian.superimplement;

public class ClassC extends ClassB{
	@Override
	public void methodB() {
		System.out.println("ClassC.methodB() call");
	}
	@Override
	public void methodC() {
		System.out.println("ClassC.methodC() call");
	}
}
