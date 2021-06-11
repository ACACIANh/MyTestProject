package test.acacian.interfacegeneric;

import java.util.stream.IntStream;

public class TestMain {
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 9);
		stream.forEach(TestMain::loop);
	}

	static void loop(int i) {
		IntStream stream = IntStream.rangeClosed(1, i);

		String[] arr = new String[i];
		stream.forEach(j -> arr[j - 1] = String.valueOf(j));
		System.out.println(String.join(",", arr));
	}
}
