package Stack;

public class Stack<Item> {
	@SuppressWarnings("unchecked")
	private Item[] s = (Item[]) new Object[1];
	private int top = 0;
	private int length = 0;
	
	@SuppressWarnings("unchecked")
	public void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        for (int i = 0; i < length; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }
	
	public void push(Item item) {
		if(s.length == length) {
			resize(2 * s.length);
		}
		s[top++] = item;
		length++;
	}
	
	public Item pop() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Stack is empty");
		}
		Item item = s[--top];
		s[top]=null;
		if(length > 0 && length == s.length/4) {
			resize(s.length/2);
		}
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
