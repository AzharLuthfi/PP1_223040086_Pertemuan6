package pertemuan6;

public class StrukturListTest2 {
	public static void main(String[] args) {
	// LATIHAN 3 - 4
		StrukturList mylist = new StrukturList();
		
		//add nilai list:
		mylist.addTail(7);
		mylist.addTail(6);
		mylist.addTail(4);
		mylist.addTail(2);
		mylist.addTail(3);
		System.out.println("add list");
		mylist.displayElement();
		
		// hitung panjang list
		int size= mylist.size();
		System.out.println();
		System.out.println(size);
	}
}
