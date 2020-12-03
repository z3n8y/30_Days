package day_18_queues_stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {
	
	LinkedList queue = new LinkedList();
	
	
	public Queuey() {
		queue = new LinkedList();
	}
	
	//Is it empty?
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	//What is the size?
	public int size() {
		return queue.size();
	}
	
	//Enqueuing an item
	public void enqueue(String n) {
		queue.addLast(n);
	}
	
	//Dequeuing an item
	public String dequeue() {
		return (String) queue.remove(0);		
	}
	
	//Peek at the first item
	public String peek() {
		return (String) queue.get(0);
	}
	
	
	public static void main(String[] args) {
//		Queuey numberQueue = new Queuey();	
//		numberQueue.enqueue(5);
//		numberQueue.enqueue(7);
//		numberQueue.enqueue(6);		
//		System.out.println("First out: " + numberQueue.dequeue());
//		System.out.println("Peek at second Item: " + numberQueue.peek());
//		System.out.println("Second out: " + numberQueue.dequeue());
//		System.out.println("Third out: " + numberQueue.dequeue());
		
//		Queuey stringQueue = new Queuey();
//		stringQueue.enqueue("hi");
//		stringQueue.enqueue("there");
//		stringQueue.enqueue("friend");
//		System.out.print(stringQueue.dequeue()+ " ");
//		System.out.print(stringQueue.dequeue() + ".");
		
		Stack<String> stacky = new Stack<>();
		stacky.push("there.");
		stacky.push("hi ");
		System.out.print(stacky.pop());
		System.out.print(stacky.pop());
		//Queue<String> queue = new Queue<>();
		
		
		
		
		
		
	}

}
