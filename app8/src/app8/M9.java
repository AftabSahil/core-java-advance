package app8;

class I < X >{
	X f1;
	I(X f1){
		this.f1 = f1;
	}
	
	void setValue(X f1) {
		this.f1 = f1;
	}
	
	X getValue() {
		return f1;
	}
}

public class M9 {
	public static void main(String[] args) {
		I<Integer> obj1 = new I<>(90);
		int i = obj1.getValue();
		System.out.println(i);
		obj1.setValue(190);
		i = obj1.getValue();
		System.out.println(i);
		
		I<String> obj2 = new I<>("abc");
		String s1 = obj2.getValue();
		System.out.println(s1);
		obj2.setValue("xyz");
		s1 = obj2.getValue();
		System.out.println(s1);
		
		
		
	}
}












