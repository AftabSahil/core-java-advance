package app6;
/*
5 
4 4 
3 3 3 
2 2 2 2
1 1 1 1 1
 */
public class M5 {
	    public static void main(String[] args) {
	        int rows = 4; // Change this to generate more rows
	        int num = 1;

	        for (int i = 1; i <= rows; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }
	

}
