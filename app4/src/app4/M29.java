package app4;

public class M29 {
	public static void main(String[] args) {
		M29 obj = new M29();
		
	//	obj.clone();
		
		
//		try {
//			obj.clone();
//		}
//		catch(ClassNotFoundException ex) {
//			
//		}
		
		try {
			obj.clone();
		}
		catch(CloneNotSupportedException ex) {
			
		}
		
		try {
			System.out.println(1);
			int i = 10;
			i++;
			obj.clone();
			obj.clone();
			obj.clone();
			obj.clone();
		}
		catch(CloneNotSupportedException ex) {
			
		}
		
	}
}
