package app29;

public class ArrayList <E> {
	private Object[] elements;
	private int size;
	private int capacity;	
	public ArrayList() {
		capacity = 10;
		elements = new Object[capacity];
	}
	public ArrayList(int capacity) {
		this.capacity = capacity;
		elements = new Object[capacity];
	}	
	public ArrayList(ArrayList list) {
		elements = list.elements;
		capacity = list.capacity;
		size = list.size;
	}
	public void add(E element) {
		if(size == capacity) {
			alterCapacity();
		}		
		elements[size++] = element;
	}	
	private void alterCapacity() {
		capacity = capacity * 2;
		Object[] temp = elements;
		elements = new Object[capacity];
		for(int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
	}

	public E get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException(index + " should be from 0 to " + (size - 1));
		}
		return (E)elements[index];
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < size; i++) {
			sb.append(elements[i] + ", ");
		}
		String s1 = sb.substring(0, sb.length() - 2);
		return s1 + "]";
	}
	
}





