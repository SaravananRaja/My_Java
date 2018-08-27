/**
 * 
 */
package singlyLinkedList;

import singlyLinkedList.My_Linked_List.Node;

/**
 * @author Saravanan
 *
 */

 
// Pairwise swap elements of a given linked list
public class PairwiseSwap {

	private void pairwiseSwap(My_Linked_List aMy_Linked_List) {
		
		Node temp = aMy_Linked_List.getNode();
		while(temp != null && temp.next != null) {
			int k = temp.data;
			temp.data = temp.next.data;
			temp.next.data = k;
			temp = temp.next.next;
		}
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

		PairwiseSwap aPairwiseSwap = new PairwiseSwap();
		
		System.out.println("Linked List before Swapping ");
		aMy_Linked_List.printList();
		
		System.out.println();
		System.out.println("Linked List After Swapping ");
		aPairwiseSwap.pairwiseSwap(aMy_Linked_List);
		aMy_Linked_List.printList();
	}

}
