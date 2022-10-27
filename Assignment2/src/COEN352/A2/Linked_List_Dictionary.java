// Irakiza Dushime Chris 
// Magy Gerges 
// Assignment 1 Q1: implementing a linked list to the dictionary class 


package COEN352.A2;

public class Linked_List_Dictionary<Key,E> implements ADTDictionary<Key,E> 

{
    
	// declaring objects of the type Key and E 
	private LList<Key> K_list;
    private LList<E> V_list;
    
    
    // constructor 
    Linked_List_Dictionary()
    
    {
    	 
    	K_list = new LList<Key>();
    	V_list = new LList<E>();
    	
    } 
   
    // program to clear all entries in the dict
	public void clear() {
		K_list.clear();
		V_list.clear();
		
	}
	public E[] getV_list() {
		
		E [] Temp = null;
		V_list.moveToStart();
		
		for(int i=0; i<=V_list.length()-1;i++) {
			
			Temp[i] = V_list.getValue();
			V_list.moveToPos(i++);
		}
		
		return Temp; 
	}

	/** Insert a record
    @param  k The key for the record being inserted.
    @param  e The record being inserted. */
	public void insert(Key k, E e) 
	{
			if(find(k)==null)
				// if the key address is null, add the desired entry 
			{
				K_list.append(k);
				V_list.append(e);
			}		
	}

	/** Remove and return a record.
	@param k The key of the record to be removed.
	@return A matching record. If multiple records match
	"k", remove an arbitrary one. Return null if no record
	with key "k" exists. */
	public E remove(Key k)
	{
			E temp = find(k);  // variable that holds the location of the key k 
			
			int pos = K_list.currPos();  // value that stores the current location 
			
			if (temp == null)
				// if the record is empty, return null 
			{
				return null; 
			}
			if (temp != null) // if the record is not empty, remove the record stored 
			{
				K_list.remove();
				V_list.remove();
			}
			
			K_list.moveToPos(pos);
			V_list.moveToPos(pos);
			
			return temp;
			
	}

	
	/** Remove and return an arbitrary record from dictionary.
	@return the record removed, or null if none exists. */
	public E removeAny() 
	{
		
		if (size() != 0) // if the size of the list is not zero, remove a random record  
		{
		  K_list.remove();
		  
		  E temp = V_list.getValue();
		  
		  V_list.remove();
		  
		  return temp;
		}
		
		else return null; // if the size is zero , return null 
	}


	/** @return A record matching "k" (null if none exists).
    If multiple records match, return an arbitrary one. */
	public E find(Key k)
	{
		
		// implementing a for loop to go through record and find the record 
		for(K_list.moveToStart(); K_list.currPos() < K_list.length(); K_list.next()) 
		{
			int z = K_list.currPos();  
			
			V_list.moveToPos(z);
			
				if (k == K_list.getValue()) {
					
					return  V_list.getValue();  // returns the value of the record in key k 
				}
				
			}  // end of the for loop 
		
		 return null;  // if no record matching K , return null 
		
	}

	/** @return the number of records in the dictionary. */
	public int size()
	{
		return K_list.length();
	}
	
};
