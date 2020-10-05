package Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> qu = new Queue<Integer>();
		
		qu.enqueu(1);
		qu.enqueu(2);
		qu.enqueu(3);
		qu.enqueu(4);
		qu.enqueu(5);
		qu.enqueu(6);
		
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		System.out.println("The number of elements is: "+qu.size());
	}

}
