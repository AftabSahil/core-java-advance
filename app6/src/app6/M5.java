package app6;

public class M5 {
	public static void main(String[] args) {
		int a = 5;
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print(a + " ");
				
			}
			a--;
			System.out.println();
			
		}
	}
}

/*
			m5:

			5 
			4 4 
			3 3 3 
			2 2 2 2
			1 1 1 1 1

*/