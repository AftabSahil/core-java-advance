package app9;

class G{
	int i;
	int j;
	G(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof G) && this.i == ((G)obj).i && this.j == ((G)obj).j;
	}
}
public class M7 {
	public static void main(String[] args) {
		G g1 = new G(10, 20);
		G g2 = new G(10, 20);
		G g3 = new G(20, 20);
		System.out.println(g1.equals(g2));
		System.out.println(g1.equals(g3));
		System.out.println(g2.equals(g3));
		System.out.println(g2.equals("abc"));
		System.out.println(g2.equals(23));
		System.out.println(g2.equals(new Thread()));
	}
}
