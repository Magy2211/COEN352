package Question3;

import coen352.a1.DList;


public class DL_Dictionnary<Key, E> implements ADTDictionary<Key, E>{

	
	private DList<Key> KeyList;
	private DList<E> ValueList; 

	
	DL_Dictionnary(){
		
		KeyList = new DList<Key> ();
		ValueList = new DList<E> (); 
	}
	@Override
	public void clear() {
		
		KeyList.clear();
		ValueList.clear();
	}

	
	public void insert(Key k, E e) {
		
		if(find(k) == null) {
			KeyList.append(k);
			ValueList.append(e);
		}
		
	}

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

	
	public int size() {
		
		return KeyList.length();
	}
	
}
