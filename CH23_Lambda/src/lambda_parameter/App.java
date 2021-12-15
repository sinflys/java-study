package lambda_parameter;

interface Runner {
	void execute(String t); //추상메서드에 매개변수가 있는경우
}


public class App {
	public static void main(String[] args) {
		// 매개변수가 있는경우
		Runner run1 = (s) -> System.out.println(s);
		run1.execute("펭수");
		
		Runner run2 = (x) -> System.out.println(x);
		run2.execute("길동");
	}

}
