package coen352.a1;

public class DLink<E> {

	private E element;	//value of this node 
	private DLink<E> next; //pointer to next node in the list 
	private DLink<E> prev; //pointer to previous node in list 
	
	//CONSTRUCTORS 
	DLink(E it, DLink<E> P, DLink<E> N){
		
		element = it;
		prev = P;
		next = N; 
	}
	
	DLink(DLink<E> P, DLink<E> N){prev = P; next = N;}
	
	//GETTERS AND SETTERS 
	DLink<E> next(){return next;}
	DLink<E> setNext(DLink<E> NextVal){return next = NextVal;}
	DLink<E> prev(){return prev;}
	DLink<E> setPrev(DLink<E> PrevVal){return prev = PrevVal;}
	E element() {return element;}
	E setElement(E it) {return element = it;}

}

