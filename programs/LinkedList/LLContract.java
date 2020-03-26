public interface LLContract{
	
	public int size(); // - returns number of data elements in list
 	public boolean empty(); //- bool returns true if empty
 	public int value_at(int index); // - returns the value of the nth item (starting at 0 for first)
 	public void push_front(int value); // - adds an item to the front of the list
 	public int pop_front(); //  - remove front item and return its value
 	public void push_back(int value); // - adds an item at the end
 	public int pop_back(); //  - removes end item and returns its value
 	public int front(); //  - get value of front item
 	public int back(); // - get value of end item
 	public void insert(int index,int value);// - insert value at index, so current item at that index is pointed to by new item at index
 	public void erase(int index);//  - removes node at given index
 	public int value_n_from_end(int n); // - returns the value of the node at nth position from the end of the list
 	public void reverse(); // - reverses the list
 	public void remove_value(int value); //- removes the first item in the list with this value
 	public void print();

}