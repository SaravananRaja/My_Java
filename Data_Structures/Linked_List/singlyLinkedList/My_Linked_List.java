package singlyLinkedList;

public class My_Linked_List {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int new_data){
			this.data = new_data;
			next = null;
		}
	}
	
	
	public Node getNode() {
		return head;
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "-- ");
			temp = temp.next;
		}
	}
	
	
}
