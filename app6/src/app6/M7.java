package app6;
/*
1
1 1
1 0 1
1 0 0 1
1 0 0 0 1
1 0 0 0 0 1
1 1 1 1 1 1 1
 */
public class M7 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if(j == 0 || j == i || i == n-1) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
