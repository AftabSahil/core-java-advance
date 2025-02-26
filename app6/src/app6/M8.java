package app6;
/*
0
0 0
0 1 0
0 1 2 0
0 1 2 3 0
0 1 2 3 4 0
0 1 2 3 4 5 0
0 0 0 0 0 0 0 0
 */
public class M8 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i || i == n-1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(j+ "");
                }
            }
            System.out.println();
        } 
    }
    
}
