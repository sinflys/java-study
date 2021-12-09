package equals;

import java.util.Objects;

class Person {
	private String name;	
	public Person(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //객체가 같을 경우
			return true;
		if (obj == null) //비교대상이 널값이면
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.deepEquals(name, other.name);
	}
}

public class App {

	public static void main(String[] args) {
		// 같은지 비교하는 메소드
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
