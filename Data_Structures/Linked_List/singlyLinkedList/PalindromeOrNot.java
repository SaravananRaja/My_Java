/**
 * 
 */
package singlyLinkedList;

import java.util.Stack;

import singlyLinkedList.My_Linked_List.Node;

/**
 * @author Saravanan
 *
 */

// Function to check if a singly linked list is palindrome

public class PalindromeOrNot {

	private void checkPalindrome(My_Linked_List aMy_Linked_List) {
		Stack<Integer> mystack = new Stack<Integer>();

		Node temp = aMy_Linked_List.head;

		 
		StringBuffer sb = new StringBuffer();

		while (temp != null) {
			sb.append(temp.data);
			mystack.push(temp.data);
			temp = temp.next;
		}

		 
		StringBuffer sb1 = new StringBuffer();
		while (!mystack.isEmpty()) {
			sb1.append(mystack.pop());
		}

		 System.out.println("1 " + sb.toString());
		 System.out.println("2 " + sb1.toString());
		 if(sb.toString().equals(sb1.toString())) {
			 System.out.println("It is a Palindrome");
		 }else {
			 System.out.println("It is not a Palindrome");
		 }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		My_Linked_List aMy_Linked_List = new My_Linked_List();
		aMy_Linked_List.push(1);
		aMy_Linked_List.push(2);
		aMy_Linked_List.push(3);
		aMy_Linked_List.push(2);
		aMy_Linked_List.push(1);

		PalindromeOrNot aPalindromeOrNot = new PalindromeOrNot();
		aPalindromeOrNot.checkPalindrome(aMy_Linked_List);

	}

}
