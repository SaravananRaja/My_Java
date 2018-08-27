/**
 * 
 */
package singlyLinkedList;

import singlyLinkedList.My_Linked_List.Node;

/**
 * @author Saravanan
 *
 */

// Move last element to front of a given Linked List

 
public class MoveLastElement {

	private void moveFront(My_Linked_List aMy_Linked_List) {
		Node last = aMy_Linked_List.getNode();
		Node sec_Last = null;
		while (last.next != null) {
			sec_Last = last;
			last = last.next;
		}
		sec_Last.next = null;
		last.next = aMy_Linked_List.head;
		aMy_Linked_List.head = last;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		My_Linked_List aMy_Linked_List = new My_Linked_List();
		aMy_Linked_List.push(5);
		aMy_Linked_List.push(4);
		aMy_Linked_List.push(3);
		aMy_Linked_List.push(2);
		aMy_Linked_List.push(1);

		System.out.println("Linked List before moving last to front ");
		aMy_Linked_List.printList();

		MoveLastElement aMoveLastElement = new MoveLastElement();
		aMoveLastElement.moveFront(aMy_Linked_List);
		System.out.println();
		System.out.println("Linked List after moving last to front ");
		aMy_Linked_List.printList();
	}

}
