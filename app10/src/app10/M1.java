package app10;

import java.lang.reflect.Field;

class A {
	int i;
}
public class M1 {
	public static void main(String[] args) throws Exception{
		A a1 = new A();
		
		Class c1 = a1.getClass();
		System.out.println(c1.getName());
		System.out.println(c1.getPackageName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getTypeName());
		
		System.out.println("-------------------");
		Field[] fields = c1.getDeclaredFields();
		for(Field f1 : fields) {
			System.out.println(f1.getName());
		}
		
	}
}
