package app6;
/*
0
0 0
0 1 0
0 2 1 0
0 3 2 1 0
0 4 3 2 1 0
0 5 4 3 2 1 0
0 0 0 0 0 0 0 0
 */
public class M9 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i || i == n-1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(i-j+ " ");
                }
            }
            System.out.println();
        }
    }
}
