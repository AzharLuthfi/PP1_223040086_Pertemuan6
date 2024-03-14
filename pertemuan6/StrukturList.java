package pertemuan6;

public class StrukturList {

	private Node HEAD;
	
	public StrukturList() {
		this.HEAD = HEAD;
	}
	
	//fungsi add tail
	public void addTail(double data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			Node posNode = null;
			Node curNode = HEAD;
			
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			
			posNode.setNext(newNode);
		}
	}
	
	//LATIHAN 2
	//fungsi add middle
	public void addMid(double data, int pos) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			Node posNode = null;
			Node curNode = HEAD;
			
			if (pos == 1) {
				newNode.setNext(HEAD) ;
				HEAD = newNode;
			} else {
				int i = 1; 
				while (curNode != null && i < pos) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;	
				}
				
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			
			}
		}
	}
	
	//fungsi add head
	public void addHead(double data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
	}
	
	//fungsi remove head
	public void removeHead() {
		
		if (isEmpty()) {
			System.out.println("List Kosong");
		} else {
			Node temp = HEAD;
			HEAD = HEAD.getNext();
			
		}
	}
	
	//fungsi remove Tail
		public void removeTail() {
			
			Node preNode = null;
			Node lastNode;
			
			if (!isEmpty()) {
				if (HEAD.getNext() == null) {
					HEAD = null;
				} else {
					lastNode = HEAD;
					while (lastNode.getNext() != null){
						preNode = lastNode;
						lastNode = lastNode.getNext();
					}
					preNode.setNext(null);
					dispose(lastNode);
				}
			}
				
		}

		// fungsi remove mid
		public void removeMid(double e) {
	        Node preNode = null;
	        Node tempNode = HEAD;
	    
	        if (isEmpty()) {
	            System.out.println("List kosong");
	        } else {
	            boolean ketemu = false;
	    
	            while (tempNode != null && !ketemu) {
	                if (tempNode.getData() == e) {
	                    ketemu = true;
	                } else {
	                    preNode = tempNode;
	                    tempNode = tempNode.getNext();
	                }
	            }
	    
	            if (ketemu) {
	                if (preNode == null) { // Jika node yang akan dihapus berada di HEAD
	                    HEAD = tempNode.getNext();
	                } else {
	                    preNode.setNext(tempNode.getNext());
	                }
	                dispose(tempNode);
	            } else {
	                System.out.println("Elemen tidak ditemukan");
	            }
	        }
	   }
		
		// fungsi Find List
		public boolean find(int x) {
			Node curNode = HEAD;
			boolean ketemu = false;
			
			while (curNode != null && !ketemu) {
				if (curNode.getData() == x)
					ketemu = true;
				else
					curNode = curNode.getNext();
			}
			
			return ketemu;
				
		}
		
		// fungsi menghitung size/panjang linked link
		
		public int size() {
			Node curNode = HEAD;
			int jumlah = 0;
			
			while(curNode != null) {
				jumlah = jumlah + 1;
				curNode = curNode.getNext();
			}
			
			return jumlah;
		}
		
  // fungsi untuk menghapus semua nilai
		 public void removeAll() {
		        HEAD = null; // Menghapus referensi ke node 
		        			// pertama membuat semua node terputus dari linked list
		    }
		
						
	// fungsi dispose	
	private void dispose(Node temp) {
		// TODO Auto-generated method stub
		temp.setNext(null); 
		temp = null;
	}

	//fungsi isEmpty
	private boolean isEmpty() {
		return HEAD == null;
	}
	
	
	
	//display node
	public void displayElement() {
		Node curNode = HEAD;
		
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
		
		if (isEmpty()) {
			System.out.println("List Kosong");
		}		
	}
}
