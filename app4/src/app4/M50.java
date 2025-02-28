package app4;

public class M50 {
	public static void main(String[] args) {
		try {
			Class.forName("");
			Thread.sleep(1000);
		} catch (ClassNotFoundException | InterruptedException ex) {
			System.out.println(ex);
			
		}
		
	}
}
