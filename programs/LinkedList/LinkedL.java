import java.util.*;


public class LinkedL implements LLContract{

	public class Node {
		int data;
		Node next;

		Node(int data){
			this.data = data;
		}
	}

	Node head = null;	
	

	@Override
	public int size(){
		int size = 0;
		Node current = head;

		while (current != null){
			size++;
			current = current.next;
		}

		return size;
	}

	@Override
 	public boolean empty(){
 		return head == null;
 	} //- bool returns true if empty
 	
 	@Override
 	public int value_at(int index){
 		int currI = 0;
 		Node current = head;
 		while(current != null && currI < index){
 			current = current.next;
 			currI++;
 		}


 		return current == null ? Integer.MIN_VALUE : current.data;
 	} // - returns the value of the nth item (starting at 0 for first)
 	
 	@Override
 	public void push_front(int value){
 		Node current = head;

 		Node temp = new Node(value);
 		temp.next = current;
 		head = temp;

 	} // - adds an item to the front of the list
 	
 	@Override
 	public int pop_front(){
 		if(head == null)
 			return Integer.MIN_VALUE;
 		
 		int val = head.data;
 		head = head.next;

 		return val;
 	}//  - remove front item and return its value
 	
	@Override
	public void push_back(int value){
		Node current = head;

		while(current.next != null){
			// System.out.print(current.data+" ");
			current = current.next;

		}
		System.out.print("\n");
		Node newNode = new Node(value);
		current.next = newNode;

	} // - adds an item at the end
 	
 	@Override
 	public int pop_back(){
 		Node curr = head;
 		Node prev = null;

 		while(curr.next != null){
 			prev = curr;
 			curr = curr.next;
 		}
 		int d = curr.data;
 		prev.next = null;

 		return d;
 	} //  - removes end item and returns its value
 	
 	@Override
 	public int front(){

 		return head == null ? Integer.MIN_VALUE : head.data;
 	} //  - get value of front item
 	
 	@Override 
 	public int back(){
 		Node curr = head;

 		while(curr.next != null){
 			curr = curr.next;
 		}

 		return curr.data;
 	} // - get value of end item
 	
 	@Override
 	public void insert(int index,int value){
 		int currI = 0;
 		Node current = head;
 		Node prev = null;
 		while(current != null && currI < index){
 			prev = current;
 			current = current.next;
 			currI++;
 		}

 		Node newnode = new Node(value);
 		if(current == null) //last item
 			newnode.next = current;
 		else if(prev != null){
 			prev.next = newnode;
 			newnode.next = current;
 		}else{
 			newnode.next = head;
 			head = newnode;
 		}

 	}// - insert value at index, so current item at that index is pointed to by new item at index
 	
 	@Override
 	public void erase(int index){
 		Node current = head;
 		Node prev = null;
 		int currI = 0;

 		while(current != null && currI < index){
 			prev = current;
 			current = current.next;
 			currI++;
 		}

 		if(current != null && prev != null){
 			prev.next = current.next;
 		}else if(prev == null && current != null){
 			head = current.next;
 		}

 	}//  - removes node at given index
 	
 	@Override
 	public int value_n_from_end(int n){
 		int size = size();

 		int targe = size - n;

 		return value_at(targe + 1);

 	} //- returns the value of the node at nth position from the end of the list
 	
 	@Override
 	public void reverse(){

 	} // - reverses the list
 	
 	@Override
 	public void remove_value(int value){
 		
 	} // - removes the first item in the list with this value
 	
 	@Override
 	public void print(){
 		Node node = head;
 		System.out.println("List is :");
 		while(node != null){
 			System.out.print(node.data+" ");
 			node = node.next;
 		}
 		System.out.println("");
 	}


 	public static void main(String[] args){

 		LinkedL list = new LinkedL();

 		System.out.println("empty = "+list.empty());
 		System.out.println("pop_front = "+list.pop_front());
 		list.push_front(10);
 		list.push_front(20);
 		list.push_front(30);
 		list.push_front(40);
 		list.push_front(50);
 		list.push_front(60);
 		list.print();
 		System.out.println("size = "+list.size());
 		System.out.println("value at 0 = "+list.value_at(0));
 		System.out.println("value at 3 = "+list.value_at(3));
 		System.out.println("value at 10 = "+list.value_at(10));
 		
 		// pop front
 		System.out.println("pop_front = "+list.pop_front());
 		System.out.println("pop_front = "+list.pop_front());
 		list.print();

 		// push back
 		list.push_back(50);
 		list.push_back(60);
 		list.print();

 		System.out.println("pop_back = "+list.pop_back());
 		System.out.println("pop_back = "+list.pop_back());
 		list.print();

 		list.insert(2,25);
 		System.out.print("After insert 2,25 ");
 		list.print();

 		list.insert(0,50);
 		System.out.print("After insert 0,50 ");
 		list.print();
 		System.out.print("After insert 5,5 ");
 		list.insert(5,5);
 		list.print();

		System.out.print("erase 0 "); list.erase(0);
		list.print();
		System.out.print("erase 2 "); list.erase(2);
		list.print();
		System.out.print("erase 5 ");list.erase(5);
		list.print();

		System.out.println("value 0 from end "+list.value_n_from_end(0));
		System.out.println("value 2 from end "+list.value_n_from_end(2));
		System.out.println("value 5 from end "+list.value_n_from_end(5));
		System.out.println("value 10 from end "+list.value_n_from_end(10));

 		System.out.println("front = "+list.front());
 		System.out.println("back = "+list.back());
 		System.out.println("empty = "+list.empty());
 	}
}