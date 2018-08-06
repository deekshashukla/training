
public class Person {
	private int age;
	private String name;

	public Person() {

	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Name :" + name + "\t age:" + age;
	}

	public int getAge() {
		return age;
	}

	public int compareTo(Person p) {
		return 0;
	}

}
