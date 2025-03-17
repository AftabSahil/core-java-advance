package app28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person{
	String name;
	Integer age;
	Double weight;
	Person(String name, Integer age, Double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + age + ", " + weight + "]";
	}
}
public class M6 {
	public static void main(String[] args) {
		Person p1 = new Person("vijay", 22, 55.4);
		Person p2 = new Person("kiran", 21, 56.4);
		Person p3 = new Person("kumar", 23, 65.4);
		Person p4 = new Person("divya", 26, 57.4);
		Person p5 = new Person("nithya", 25, 75.4);
		Person p6 = new Person("babu", 24, 59.4);
		
		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
		System.out.println(persons);
		Collections.sort(persons, (o1, o2) -> o1.name.compareTo(o2.name));
		System.out.println(persons);
		Collections.sort(persons, (o1, o2) -> o1.age.compareTo(o2.age));
		System.out.println(persons);
		Collections.sort(persons, (o1, o2) -> o1.weight.compareTo(o2.weight));
		System.out.println(persons);
	}
}








