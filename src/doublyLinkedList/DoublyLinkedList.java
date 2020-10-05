package doublyLinkedList;

import java.util.Iterator;



public class DoublyLinkedList<Item> implements Iterable<Item> {
	
	Node<Item> head = null;
	Node<Item> tail = null;
	int size = 0;
	
	public void addToFront(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.data = item;
		if(size==0) {
			tail = newNode;
		}
		else {
			head.prev = newNode;
		}
		newNode.next = head;
		head = newNode;
		size++;
		
	}
	
	public void removeFromFront() {
		if(size==0) {
			throw new IndexOutOfBoundsException("LL is empty.");
		}
		Node<Item> temp = head;
		if(head == tail) {
			tail = null;
		}
		else {
			head.next.prev = null;
		}
		head = head.next;
		temp.next = null;
		size--;
	}
	
	public void addToRear(Item item) {
		Node<Item> newNode = new Node<Item>();
		newNode.data = item;
		if(size==0) {
			head = newNode;
		}
		else {
			tail.next = newNode;
			newNode.prev = tail;
		}
		tail = newNode;
		size++;
		
	}
	
	public void removeFromRear() {
		if(size==0) {
			throw new IndexOutOfBoundsException("LL is empty.");
		}
		Node<Item> temp = tail;
		if (head == tail) {
			head = null;
		}
		else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
		size--;
	}
	
	public int count() {
		return size;
	}
	
	private class DoublyLinkedListIterator implements Iterator<Item> {
		Node <Item> current = head;
		
		public boolean hasNext() {
			return current != null;
		}
		
		public Item next() {
			Item item = current.data;
			current = current.next;
			return item;
		}
		
		
	}

	public Iterator<Item> iterator(){
			return new DoublyLinkedListIterator();
		}
	

}
