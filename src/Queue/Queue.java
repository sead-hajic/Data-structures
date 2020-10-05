package Queue;


public class Queue<Item> {
	private Node<Item> head = null;
	private Node<Item> tail = null;
	private int length = 0;
	
	public void enqueu(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.data = item;
		if(isEmpty()) {
			head=tail=newNode;
		}
		else {
		tail.next = newNode;
		}
		tail = newNode;
		tail.next = null;
		length++;
	}
	
	public Item dequeue() {
		Item item = head.data;
		if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty");
		
		else if(length==1){
			head = tail = null;
		}
		else {
			head = head.next;
		}
		if(isEmpty()) tail = null;
		length--;
		return item;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int size() {
		return length;
	}
	

}
