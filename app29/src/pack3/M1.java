package pack3;

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
	}
	
	public void read() {
		ListNode current = first;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public void readInReverse() {
		ListNode current = last;
		while(current != null) {
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
