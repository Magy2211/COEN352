package coen352.a1;

public class DList<E> implements ADTList<E>{

	private DLink<E> head; //pointer to the head of the list 
	private DLink<E> tail; //pointer to the last element in the list 
	private DLink<E> curr; //pointer ahead of current element
	int count; //number of elements in list 
	
	public DList() {
		
		curr = head = new DLink<E>(null, null);
		tail = new DLink<E>(head, null);
		head.setNext(tail);
		count = 0;
	}
	
	

	public void clear() {
		
		head.setNext(null); //drop access to rest of links 
		curr = head = new DLink<E>(null,null); //create a header 
		tail = new DLink<E>(head,null); //tail points to head as previous element and null so nothing is in between 
		head.setNext(tail); //head points at tail node and nothing exists between them 
		count = 0; //reset size count to 0 
		
	}

	
	public void insert(E item) {
		
		curr.setNext(new DLink<E>(item, curr, curr.next()));
		curr.next().next().setNext(curr.next());
		count++;
	}


	public void append(E item) {
		
		tail.setPrev(new DLink<E> (item, tail.prev(), tail));
		tail.prev().prev().setNext(tail.prev());
		count++;
	}

	
	public E remove() {
		
		if(curr.next() == tail)return null; 
		E item = curr.next().element();
		curr.next().next().setPrev(curr);
		curr.setNext(curr.next().next());
		count--;
		return item;
	}


	public void moveToStart() {
		
		curr = head; 
		
	}

	
	public void moveToEnd() {
		
		curr = tail.prev(); 
	}


	public void prev() {
		
		if(curr != head)
			curr = curr.prev();
		
	}

	public void next() {
		
		if(curr != tail)
			curr = curr.next();
		
	}


	public int length() {
		
		return count;
	}

	public int currPos() {
	
		DLink<E> Temp = head; 
		int i;
		for(i=0; curr != Temp; i++)
		{Temp = Temp.next();}
		
		return i;
	}

	public void moveToPos(int pos) {
		
		assert (pos>=0) && (pos<=count) : "Position is out of range";
		curr = head;
		for(int i=0; i<pos; i++){curr = curr.next();}
		
	}


	public E getValue() {
		
		if(curr.next() == null)return null;
		return curr.next().element();
		
	}
}


