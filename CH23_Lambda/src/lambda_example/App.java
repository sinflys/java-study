package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");

		list.forEach(new Consumer<String>() {
			public void accept(String t) {
				// 익명 클래스에서 추상메서드를 구현
				System.out.print(t + "\t");
			}
		});
		System.out.println();
		
		// 익명 클래스 => 람다식으로
		list.forEach(t -> System.out.print(t + "\t"));
	}

}
