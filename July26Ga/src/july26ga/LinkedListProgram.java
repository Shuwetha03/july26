package july26ga;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList<String> sList=new LinkedList<String>();
		LinkedList<String> sList2=new LinkedList<String>();

		sList.add("C");
		sList.add("C++");
		sList.add("Java");
		sList.add("Python");
		sList.add("C");
	
		sList2.add("Hey");
		sList2.add("Hello");
		sList2.add("Hi");
		sList2.add("Hie");
		
		System.out.println("LinkedList before :" + sList);
		sList.addAll(sList2);
		System.out.println("LinkedList After :" + sList);
		sList.addFirst("First");
		System.out.println("LinkedList after adding firt Element :" + sList);
		sList.addLast("Last");
		System.out.println("LinkedList after adding last Element :" + sList);
		System.out.println("Index of Hello :" + sList.indexOf("Hello"));
		System.out.println("Last index of 'C' :" + sList.lastIndexOf("C"));
		System.out.println("First elemnt is :" + sList.peekFirst());
		System.out.println("Last element is :" + sList.peekLast());
		System.out.println("Head element is :" + sList.pollFirst());
		System.out.println("LinkedList After :" + sList);
		System.out.println("Tail element is :" + sList.pollLast());
		System.out.println("LinkedList After :" + sList);
        System.out.println("Size of the LinkedList :" + sList.size());
		
	
	}
}
