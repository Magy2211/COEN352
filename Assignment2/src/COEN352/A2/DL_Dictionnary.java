// Irakiza Dushime Chris 
// Magy Gerges 
// Assignment 1 Q3: implementing a Double linked list to the dictionary class


package COEN352.A2
public class DL_Dictionnary<Key, E> implements ADTDictionary<Key, E>{

	
	private DList<Key> KeyList;
	private DList<E> ValueList; 

	// constructor
	DL_Dictionnary(){
		
		KeyList = new DList<Key> ();
		ValueList = new DList<E> (); 
	}
	
	@Override
	 /** Reinitialize dictionary */
	public void clear() {
		
		KeyList.clear();
		ValueList.clear();
	}

	/** Insert a record
    @param  k The key for the record being inserted.
    @param  e The record being inserted. */
	public void insert(Key k, E e) {
		
		if(find(k) == null) {
			KeyList.append(k);
			ValueList.append(e);
		}
		
	}

	/** Remove and return a record.
    @param k The key of the record to be removed.
    @return A matching record. If multiple records match
    "k", remove an arbitrary one. Return null if no record
    with key "k" exists. */
	public E remove(Key k) {
		
		E Temp = find(k);
		int origin = KeyList.currPos();
		if(Temp != null)
		{
			KeyList.remove();
			ValueList.remove();
		}
		
		KeyList.moveToPos(origin);
		ValueList.moveToPos(origin);
		return Temp;
	}

	
	/** Remove and return an arbitrary record from dictionary.
    @return the record removed, or null if none exists. */
	public E removeAny() {
		
		if(size() != 0)
		{
			KeyList.remove();
			E temp = ValueList.getValue();
			ValueList.remove();
			return temp;
		}
		else 
			return null;
	}
	
	/** @return A record matching "k" (null if none exists).
    If multiple records match, return an arbitrary one. */
	public E find(Key k) {
		
		for(KeyList.moveToStart();KeyList.currPos()<KeyList.length();KeyList.next())
		{
			int pos = KeyList.currPos();
			ValueList.moveToPos(pos);
			
			if(k == KeyList.getValue())
			{
				return ValueList.getValue();
			}	
		}
		return null;
	}

	 /** @return the number of records in the dictionary. */
	public int size() {
		
		return KeyList.length();
	}
	
}
