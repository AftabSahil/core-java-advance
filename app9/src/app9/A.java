package app9;

class A 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int j = test(test(test(i++) + i++) + i++);
		System.out.print(i);
		System.out.print(j);
	}
	static int test(int j){
		return j++ + j;
	}
}
    java memory management