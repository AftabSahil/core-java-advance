package app30;

import java.util.HashSet;

public class SynchronizedHashSet<E> extends HashSet<E>{
	private HashSet<E> set;
	public SynchronizedHashSet(HashSet<E> set) {
		this.set = set;
	}
	@Override
	public boolean add(E e) {
		boolean falg = false;
		synchronized (set) {
			flag = set.add(e);
		}
		return flag;
	}
}
