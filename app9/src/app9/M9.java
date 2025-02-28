package app9;

class H {
	int i;
	H(int i){
		this.i = i;
	}
	
}
public class M9 {
	public static void main(String[] args) {
		H h1 = new H (90);
		H h2 = new H (90);
		H h3 = h1;
	    H h4 = h2;
	    System.out.println(h1.hashCode());
	    System.out.println(h2.hashCode());
	    System.out.println(h3.hashCode());
	    System.out.println(h4.hashCode());
	}
}