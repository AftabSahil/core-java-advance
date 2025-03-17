package pack2;


class ListNode{
	int data;
	ListNode next;
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
		last = node;
		last.next = first;	//	circular
	}
	
//	public void read() {
//		ListNode current = first;
//		while(current != null) {
//			System.out.println(current.data);
//			current = current.next;
//		}
//	}
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
}
public class M5 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.read();
	}
}
