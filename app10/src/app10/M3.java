package app10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class D{
	int param;
	D(){
		
	}
	D(int i){
		
	}
	void test1() {
		
	}
	void test2(int i) {
		
	}
}
public class M3 {
	public static void main(String[] args) throws Exception {
		D d1 = new D();
		
		Class c1 = d1.getClass();
		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
		for(Field f1 : fields) {
			System.out.println(f1.getName());
		}
		System.out.println("--------");
		Method[] methods = c1.getDeclaredMethods();
		for(Method m1 : methods) {
			System.out.println(m1.getName());
		}
		System.out.println("--------");
		Constructor[] constructors = c1.getDeclaredConstructors();
		for(Constructor con : constructors) {
			System.out.println(con.getName());
		}
		
	}
}



















