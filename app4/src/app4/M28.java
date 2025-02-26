package app4;

public class M28 {
	public static void main(String[] args) {
		//Class.forName("java.lang.String");
	
//		try {
//			Class.forName("java.lang.String");
//		}
//		catch(InterruptedException ex) {
//			System.out.println(1);
//		}
	
		try {
			Class.forName("java.lang.String");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(1);
		}

		try {
			System.out.println(1);
			int i = 20;
			i++;
			System.out.println(i);
			Class.forName("java.lang.Integer");
			Class.forName("java.lang.Integer");
			Class.forName("java.lang.Integer");
			Class.forName("java.lang.Integer");
			Class.forName("java.lang.Integer");
			Class.forName("java.lang.Integer");
		}
		catch(ClassNotFoundException ex) {
			System.out.println(1);
		}
		
	
	}
}
