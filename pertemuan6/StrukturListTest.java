package pertemuan6;



public class StrukturListTest {
	
	public static void main(String[] args) {
		StrukturList mylist = new StrukturList();
		// LATIHAN 1 - 2
		
		//add nilai list:
		mylist.addTail(5);
		mylist.addTail(4);
		mylist.addTail(6);
		System.out.println("add list");
		mylist.displayElement();
		
		// find list
		boolean find = mylist.find(6);
		System.out.println();
		System.out.println(find);
		
    }
		
		
		
	}

