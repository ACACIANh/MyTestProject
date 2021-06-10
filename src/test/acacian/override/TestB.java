package test.acacian.override;

public class TestB extends TestA {
	@Override
	public void methodB() {
		System.out.println("B.methodB() call");
	}
}
