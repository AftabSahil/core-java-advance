package app5;
interface M{
	int sum(int i, int j);
}
public class MM {
	static int findSum(int a, int b) {
		M m1 = (i, j) -> i + j;
		return m1.sum(a, b);
	}
	public static void main(String[] args) {
		System.out.println(MM.findSum(4, 5));
	}
}
