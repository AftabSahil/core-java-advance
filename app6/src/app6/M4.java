package app6;
/*
1
2 3 
4 5 6
7 8 9 10
 */
public class M4 {
    public static void main(String[] args) {
        int rows = 4; 
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
