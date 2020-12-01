package day_15_try_harder;

public class Node {
	//PROPERTIES
	Node next;
	int data;
		
	//CONSTRUCTORS
	public Node(int newData) {
		data = newData;
		next = null;	
	}
	
	public Node(int newData, Node newNext) {
		data = newData;
		next = newNext;
	}
		
	//GETTERS AND SETTERS
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setData(int newData) {
		data = newData;
	}
	
	public void setNext(Node newNode) {
		next = newNode;
	}
	
}
