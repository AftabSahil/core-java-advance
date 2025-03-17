package app30;

import java.util.ArrayList;

public class Util<E> extends ArrayList<E>{
	
	private ArrayList<E> list;
	
	Util(ArrayList<E> list){
		this.list = list;
	}
	
	@Override
	public boolean add(E e) {
		boolean flag = false;
		synchronized (list) {
			System.out.println(Thread.currentThread().getName() + " adding " + e);
			flag = list.add(e);
			A.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " added " + e);
		}
		A.sleep(1);
		return flag;
	}
	
	@Override
	public E get(int index) {
		E element = null;
		synchronized (list) {
			element = list.get(index);
		}
		return element;
	}
	
	@Override
	public E set(int index, E element) {
		synchronized (list) {
			element = list.set(index, element);
		}
		return element;
	}
	
	@Override
	public E getFirst() {
		E element = null;
		synchronized (list) {
			element = list.getFirst();
		}
		return element;
	}
}






