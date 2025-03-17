package app19;

public class M1 {
	public static void main(String[] args) {
//		String s1 = String.format("hello %s", "abc");
//		String s1 = String.format("%s hello ", "abc");
//		String s1 = String.format("test %s hello", "abc");
//		String s1 = String.format("age value is %d", 40);
//		String s1 = String.format("weight value is %f", 70.56);
//		String s1 = String.format("you are a graduate. true/false. ans: %b", true);
//		String s1 = String.format("sum of %d and %d is %d", 10, 20, 10 + 20);
		String s1 = String.format("%3$d is sum of %2$d and %2$s", 10, 20, 10 + 20);
//		String s1 = String.format("[%10d]", 1345);
//		String s1 = String.format("[%-10d]", 1345);
//		String s1 = String.format("[%010d]", 1345);
//		String s1 = String.format("[%,10d]", 13453454);
//		String s1 = String.format("[%(10d]", -13453454);
//		String s1 = String.format("[%10.3f]", 13.453454);
		System.out.println(s1);
		System.out.printf("PI value is %f", Math.PI);
		System.out.printf("\nPI value is {%10.2f}", Math.PI);
		System.out.printf("\nPI value is {%010.2f}", Math.PI);
		System.out.printf("\nPI value is {%-10.2f}", Math.PI);
		System.out.printf("\nPI value is {%,10.2f}", Math.PI);
	
	
	
	}
}
