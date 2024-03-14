package pertemuan6;

public class StrukturListTest3 {
	public static void main(String[] args) {
		// TUGAS
			StrukturList mylist = new StrukturList();
			
			//add nilai list:
			mylist.addHead(7);
			mylist.addHead(6);
			mylist.addHead(4);
			mylist.addHead(2);
			mylist.addHead(3);
			System.out.println("add list");
			mylist.displayElement();
			
			// remove semua list
			 mylist.removeAll();
			 System.out.println();
			 mylist.displayElement();
		}
}
