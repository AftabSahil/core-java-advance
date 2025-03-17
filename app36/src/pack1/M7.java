package pack1;

interface P{
	void test1();
}

interface Q{
	void test1();
}

class R implements P, Q{
	public void test1() {
		System.out.println("R-test1");
	}
}

public class M7 {

}
