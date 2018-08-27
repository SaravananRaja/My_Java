/**
 * 
 */
package singlyLinkedList;

import singlyLinkedList.My_Linked_List.Node;
import java.util.*;

/**
 * @author Saravanan
 *
 */

// Remove duplicates from an unsorted linked list

/*
 * Write a removeDuplicates()function which takes a list and deletes any
 * duplicate nodes from the list.The list is not sorted.
 * 
 * For example if the linked list is 12->11->12->21->41->43->21 then
 * removeDuplicates()should convert the list to 12->11->21->41->43.
 */

// Logic using Hashing

public class RemoveDuplicates {

	private void RemoveDuplicates(Node head) {
		HashSet<Integer> hs = new HashSet<Integer>();
		Node current = head;
		Node prev = null;

		while (current != null) {
			int currentValue = current.data;
			if (hs.contains(currentValue)) {
				prev.next = current.next;
			} else {
				hs.add(currentValue);
				prev = current;
			}
			current = current.next;
		}
		System.out.println();
		System.out.println("Linked List after REmoving duplicate ");
		printList(head);
	}

	public void printList(Node temp) {

		while (temp != null) {
			System.out.print(temp.data + "-- ");
			temp = temp.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		My_Linked_List aMy_Linked_List = new My_Linked_List();
		aMy_Linked_List.push(10);
		aMy_Linked_List.push(11);
		aMy_Linked_List.push(12);
		aMy_Linked_List.push(11);
		aMy_Linked_List.push(11);
		aMy_Linked_List.push(12);
		aMy_Linked_List.push(10);
		System.out.println("Linked List before REmoving duplicate ");
		aMy_Linked_List.printList();

		RemoveDuplicates aRemoveDuplicates = new RemoveDuplicates();
		aRemoveDuplicates.RemoveDuplicates(aMy_Linked_List.head);

	}

}
