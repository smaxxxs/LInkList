package LinkList;

public class Main {

	public static void main(String[] args) {
		LinkList<Integer> ll = new LinkList<Integer>();
		ll.print();
		System.out.println();
		ll.add(22);
		ll.add(11);
		ll.add(44);
		ll.print();
		System.out.println();
		ll.delete(11);
		ll.print();
		System.out.println();
		ll.add(66);
		ll.add(77);
		ll.print();
		System.out.println();
		ll.reverse();
		ll.print();

	}

}
