package pack1;

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
	}	
	public void read() {
		ListNode current = first;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public int size() {
		ListNode current = first;
		int size = 0;
		while(current != null) {
			size ++;
			current = current.next;
		}
		return size;
	}
}
public class M4 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.read();
	}
}
