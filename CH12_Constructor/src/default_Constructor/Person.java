package default_Constructor;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		System.out.println("디폴트 생성자로 생성됨");
		name = "모름";
		age = 0;
	}
	
	public Person(String name) { //생성자는 클래스 이름과 같고고 리턴 타입이 없음
		System.out.println("새 person이 생성됨");		
		this.name = name;
		age = 0;
	}

	public Person(String name, int age) { //생성자는 클래스 이름과 같고고 리턴 타입이 없음
		System.out.println("새 person이 생성됨");		
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
