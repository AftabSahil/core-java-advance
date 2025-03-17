package app10;

import java.lang.reflect.Field;

class B{
	int param1;
	int age;
}
class C {
	int field1;
	String address;
}
public class M2 {
	public static void main(String[] args) throws Exception
	{
		B b1 = new B();
		printDetails(b1);
		System.out.println("---------");
		C c1 = new C();
		printDetails(c1);
	}
	
	static void printDetails(Object obj) throws Exception
	{
		Class c1 = obj.getClass();
		System.out.println("class name:" + c1.getName());
		Field[] fields = c1.getDeclaredFields();
		System.out.println("field names:");
		for(Field f1 : fields) {
			System.out.println(f1.getName());
		}
	}
}





