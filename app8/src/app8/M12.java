package app8;
class L<E extends R>{
	E field;
}
public class M12 {
	public static void main(String[] args) {
		
		L<Integer> obj1 = new L<> ();
		L<P> obj2 = new L<>();
		L<Q> obj2 = new L<>();
		L<R> obj2 = new L<>();
		L<S> obj2 = new L<>();
		L<T> obj2 = new L<>();
		L<String> obj7 = new L<> ();
	}
}
