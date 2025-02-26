package app6;
/*
1
2 1
3 2 1 
4 3 2 1
5 4 3 2 1 
6 5 4 3 2 1
 */
public class M6 {
    public static void main(String[] args) {
      int num = 6;
      for (int i = 1; i <= num; i++) {
          for (int j = i; j >= 1; j--) {
              System.out.print(j + " ");
          }
          System.out.println();
      }
    }
}
