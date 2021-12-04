/**
* A class that models a SinglyLinkedList with add(), addByIndex(), removeByElement(),
* removeByIndex(), and toString() methods. A SinglyLinkedList "knows" only its head node.
* It contains an inner Node class. A Node object "knows" only its data (e.g., an int in this case) 
* and the next node.
*
* @author	Kyle Bush
* @version	November 22, 2021
*/
public class SinglyLinkedList {

	private String listName;
	private Node head;
	
	public SinglyLinkedList(String listName) {
		this.listName = listName;
		this.head = null;
	}
	
	/**
	* Returns an element specified by index from the list.
	*
	* @param	int 	index
	* @return	int		value
	*/
	public int getByIndex(int index) {
		Node current = this.head;
		if(index < 0){
			//If the index is less than zero we return -999.
			return -999;
		} else if(index == 0 && current != null) {
			//If the index is the first index we will return whatever value is the head node.
			return head.data;
		} else {
			//In all other cases iterate through the nodes until the correctly indexed node is found.
			//Then we would return the data inside the node.
			for(int i = 0; i < index ; i++){
				current = current.next;
			}
			return current.data;
		}
	}
	
	/**
	* Adds an element to the end of the list.
	*
	* @param	int 	element
	*/
	public void add(int element) {
		Node newNode = new Node(element);
		if (head == null) {
			
			//Provide implementation where element is added at the head node.
			
			head = newNode;
			
		} else {
			//Provide implementation where element is added to a list that is not empty.
			//One way is to make the head node the tail node and "iterate" through by 
			//making the tail node's next node the new tail and then assigning the new 
			//node as the tail node's next node.
			Node current = head;
			while(current.next!=null){
				current = current.next;
			}
			current.next = newNode;
		}
	}
	
	/**
	* Adds an element to the list at a specified index.
	*
	* @param 	int 	index
	* @param	int 	element
	*/
	public void addByIndex(int index, int element) {
		int printIndex = index;
		Node newNode = new Node(element);
		Node current = this.head;
		
		if (index == 0) {
			
			//Provide implementation where the index at which to add an element is 0.
			newNode.next = head;
			head = newNode;
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was added at index " + index + ".");
		} else {
			//Provide implementation where the index at which to add an element is greater than 0.

			
			for(int i = 0; i < index - 1; i++){
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode; 
			
			
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was added at index " + printIndex + ".");
		}
	}
	
	/**
	* Removes an element from the list.
	*
	* @param	int 	element
	*/
	public void removeByElement(int element) {
		Node current = this.head;
		Node previous = null;
		
		if (current != null && current.data == element) {
			
			//Provide implementation when removing the element from the head.
			head = head.next;
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element " + element + " was found and removed.");
		} else {
			while(current != null && current.data != element) {
				//Provide implementation to "iterate" through your linked list.
				previous = current;
				current = current.next;
			}
			//If element was found, then it is at the current node.  Remove it.
			if (current != null) {
				
				//Provide implementation to remove the desired element--e.g., the current node.
				
				current = previous;
				current.next = current.next.next;


				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("Element " + element + " was found and removed.");
			}
			//If element was not found, then the current node should be null.
			if (current == null) {
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("Element " + element + " was not found.");
			}
		} 		
	}
	
	/**
	* Removes an element specified by index from the list.
	*
	* @param	int 	index
	*/
	public void removeByIndex(int index) {
		Node current = this.head;
		Node previous = null;
		
		if (index == 0 && current != null) {
			
			//Provide implementation where the index from which to remove is 0.
			head = head.next;
			//KEEP THIS LINE TO PRINT RESULT!
			System.out.println("Element at index " + index + " removed.");
		} else {
			int counter = 0;
			
			while(current != null) {
				if (counter == index) {
					
					//Provide implementation to remove the element from the specified index.
					current.next = current.next.next;
					//KEEP THIS LINE TO PRINT RESULT!
					System.out.println("Element at index " + index + " removed.");
					break;
				} else {
					
					//Continue "iterating" through your linked list and increment the counter.

					while(counter < index ){
						previous = current;
						if(current.next == null){
							break;
						}
						
						current = current.next;
						counter ++;
					}
					if(current.next !=null){
						
						Node temp = current;
						current = previous;
						current.next = temp;
						
					} else {
						current = null;
					}
				
				}
				
			}	
			//If the element at the specified index was found, then it should be at the current node.
			if (current == null) {
				//KEEP THIS LINE TO PRINT RESULT!
				System.out.println("The element at index " + index + " was not found.");
			}
		}
	}
	
	@Override
	public String toString() {
		String list = "LinkedList: ";
		Node current = this.head;  
   
        while (current != null) {  
            list = list + current.data + " "; 
            current = current.next; 
        }
		return list + "\n";
	}
	
	public class Node {
		private int data;
		private Node next;
				
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
}