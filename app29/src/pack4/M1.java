package pack4;

class ListNode{
	int data;
	ListNode next;
	ListNode prev;
	ListNode(int data){
		this.data = data;
	}
}

class LinkedList{
	private ListNode first;
	private ListNode last;
	
	public void add(int data) {
		ListNode node = new ListNode(data);
		if(first == null) {
			first = node;
		}
		else {
			last.next = node;
		}
		node.prev = last;
		last = node;
		last.next = first;
		first.prev = last;
	}
	
	public void read() {
		ListNode current = first;
		if(current == null) {
			return;
		}
		System.out.println(current.data);
		current = current.next;
		while(current != first) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public void readInReverse() {
		ListNode current = last;
		if(current == null) {
			return;
		}
		System.out.println(current.data);
		current = current.prev;
		while(current != last) {
			System.out.println(current.data);
			current = current.prev;
		}
	}
}
public class M1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.read();
		System.out.println("------");
		list.readInReverse();
	}
}
