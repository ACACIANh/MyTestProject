package test.acacian.superimplement;

public abstract class ClassA implements InterfaceA, InterfaceB, InterfaceC{
	
	//@Override�� �Ⱥٿ��� �Ǵ°ǰ�����
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
