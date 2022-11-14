// Irakiza Dushime Chris 
// Magy Gerges 
// Assignment 2: implementing the warehouse class to execute the inventory functions 


package COEN352.A2;
import java.util.Arrays;
import java.lang.Math;



public class Warehouse_DB_Linked_List 

{

	public static void main(String[] args) 
	
	{
		
		// declaring an object of the type warehouse 
		
		Warehouse_DB_Linked_List warehouseDb = new Warehouse_DB_Linked_List();
		
		// adding the entries from the excel sheet 
		
		// declaring an object of the type inventory to store all information using the set functions to populate the fields
		
				// First item 
				
				Inventory inventory_1 = new Inventory(); 
				
				inventory_1.setSKU("IN0001"); 
				inventory_1.setName("Item 1");
				inventory_1.setDescription("Desc 1");
				inventory_1.setUnitPrice(51.00);
				inventory_1.setQuantityInStock(25);
				inventory_1.setInventoryValue(1275.00);
				inventory_1.setReorderQuantity(29);
				inventory_1.setReorderTime(13);
				inventory_1.setQuantityInReorder(50);
				inventory_1.setDiscontinuedStatus(true);
				
				// Second item 
				
				Inventory inventory_2 = new Inventory(); 
				
				inventory_2.setSKU("IN0002"); 
				inventory_2.setName("Item 2");
				inventory_2.setDescription("Desc 2");
				inventory_2.setUnitPrice(93.00);
				inventory_2.setQuantityInStock(132);
				inventory_2.setInventoryValue(12276.00);
				inventory_2.setReorderQuantity(231);
				inventory_2.setReorderTime(4);
				inventory_2.setQuantityInReorder(50);
				inventory_2.setDiscontinuedStatus(true);
				
				// Third item 
				
				Inventory inventory_3 = new Inventory(); 
				
				inventory_3.setSKU("IN0003"); 
				inventory_3.setName("Item 3");
				inventory_3.setDescription("Desc 3");
				inventory_3.setUnitPrice(57.00);
				inventory_3.setQuantityInStock(151);
				inventory_3.setInventoryValue(8607.00);
				inventory_3.setReorderQuantity(114);
				inventory_3.setReorderTime(11);
				inventory_3.setQuantityInReorder(150);
				inventory_3.setDiscontinuedStatus(false);
				
				// Fourth item 
				
				Inventory inventory_4 = new Inventory(); 
				
				inventory_4.setSKU("IN0004"); 
				inventory_4.setName("Item 4");
				inventory_4.setDescription("Desc 4");
				inventory_4.setUnitPrice(19.00);
				inventory_4.setQuantityInStock(186);
				inventory_4.setInventoryValue(3534.00);
				inventory_4.setReorderQuantity(158);
				inventory_4.setReorderTime(6);
				inventory_1.setQuantityInReorder(50);
				inventory_1.setDiscontinuedStatus(false);
				
				// Fifth item 
				
				Inventory inventory_5 = new Inventory(); 
				
				inventory_5.setSKU("IN0005"); 
				inventory_5.setName("Item 5");
				inventory_5.setDescription("Desc 5");
				inventory_5.setUnitPrice(75.00);
				inventory_5.setQuantityInStock(62);
				inventory_5.setInventoryValue(4650.00);
				inventory_5.setReorderQuantity(39);
				inventory_5.setReorderTime(12);
				inventory_5.setQuantityInReorder(50);
				inventory_5.setDiscontinuedStatus(false);
				
				
				// Sixth item 
				
				Inventory inventory_6 = new Inventory(); 
				
				inventory_6.setSKU("IN0006"); 
				inventory_6.setName("Item 6");
				inventory_6.setDescription("Desc 6");
				inventory_6.setUnitPrice(11.00);
				inventory_6.setQuantityInStock(5);
				inventory_6.setInventoryValue(55.00);
				inventory_6.setReorderQuantity(9);
				inventory_6.setReorderTime(13);
				inventory_6.setQuantityInReorder(150);
				inventory_6.setDiscontinuedStatus(true);
				
				// Seventh item 
				
				Inventory inventory_7 = new Inventory(); 
				
				inventory_7.setSKU("IN0007"); 
				inventory_7.setName("Item 7");
				inventory_7.setDescription("Desc 7");
				inventory_7.setUnitPrice(56.00);
				inventory_7.setQuantityInStock(58);
				inventory_7.setInventoryValue(3248.00);
				inventory_7.setReorderQuantity(109);
				inventory_7.setReorderTime(7);
				inventory_7.setQuantityInReorder(100);
				inventory_7.setDiscontinuedStatus(false);
				
				// Eighth item 
				
				Inventory inventory_8 = new Inventory(); 
				
				inventory_8.setSKU("IN0008"); 
				inventory_8.setName("Item 8");
				inventory_8.setDescription("Desc 8");
				inventory_8.setUnitPrice(38.00);
				inventory_8.setQuantityInStock(101);
				inventory_8.setInventoryValue(3838.00);
				inventory_8.setReorderQuantity(162);
				inventory_8.setReorderTime(3);
				inventory_8.setQuantityInReorder(100);
				inventory_8.setDiscontinuedStatus(true);;
				
				// ninth item 
				
				Inventory inventory_9 = new Inventory(); 
				
				inventory_9.setSKU("IN0009"); 
				inventory_9.setName("Item 9");
				inventory_9.setDescription("Desc 9");
				inventory_9.setUnitPrice(59.00);
				inventory_9.setQuantityInStock(122);
				inventory_9.setInventoryValue(7198.00);
				inventory_9.setReorderQuantity(82);
				inventory_9.setReorderTime(3);
				inventory_9.setQuantityInReorder(150);
				inventory_9.setDiscontinuedStatus(false);
				
				// tenth item 
				
				Inventory inventory_10 = new Inventory(); 
				
				inventory_10.setSKU("IN0010"); 
				inventory_10.setName("Item 10");
				inventory_10.setDescription("Desc 10");
				inventory_10.setUnitPrice(50.00);
				inventory_10.setQuantityInStock(175);
				inventory_10.setInventoryValue(8750.00);
				inventory_10.setReorderQuantity(283);
				inventory_10.setReorderTime(8);
				inventory_10.setQuantityInReorder(150);
				inventory_10.setDiscontinuedStatus(true);
				
				// eleventh item 
				
				Inventory inventory_11 = new Inventory(); 
				
				inventory_11.setSKU("IN0011"); 
				inventory_11.setName("Item 11");
				inventory_11.setDescription("Desc 11");
				inventory_11.setUnitPrice(59.00);
				inventory_11.setQuantityInStock(176);
				inventory_11.setInventoryValue(10384.00);
				inventory_11.setReorderQuantity(229);
				inventory_11.setReorderTime(1);
				inventory_11.setQuantityInReorder(100);
				inventory_11.setDiscontinuedStatus(true);
				
				// twelfth item
				
				Inventory inventory_12 = new Inventory(); 
				
				inventory_12.setSKU("IN0012"); 
				inventory_12.setName("Item 12");
				inventory_12.setDescription("Desc 12");
				inventory_12.setUnitPrice(18.00);
				inventory_12.setQuantityInStock(22);
				inventory_12.setInventoryValue(396.00);
				inventory_12.setReorderQuantity(36);
				inventory_12.setReorderTime(12);
				inventory_12.setQuantityInReorder(50);
				inventory_12.setDiscontinuedStatus(true);
				
				
				// Testing the insert function 
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Inserting new values: ...");
				warehouseDb.InsertRecord(inventory_1);
				warehouseDb.InsertRecord(inventory_2);
				warehouseDb.InsertRecord(inventory_3);
				warehouseDb.InsertRecord(inventory_4);
				warehouseDb.InsertRecord(inventory_5);
				warehouseDb.InsertRecord(inventory_6);
				warehouseDb.InsertRecord(inventory_7);
				warehouseDb.InsertRecord(inventory_8);
				warehouseDb.InsertRecord(inventory_9);
				warehouseDb.InsertRecord(inventory_11);
				warehouseDb.InsertRecord(inventory_12);
				System.out.println("-------------------------------------------------------------------------- ");
				
				// Verifying the total number and value of the added items in the database 
				System.out.println(" Results: ");
				System.out.println(" There are " + warehouseDb.TotalInventoryQuantity() + " inventories in this database.");
				System.out.println(" The total value of the inventories is: " + warehouseDb.TotalInventoryValue());     
				System.out.println();
				
				// printing the sorted array of the indicated index (which is the inventory member function)
				
				// System.out.println(Arrays.toString(warehouseDb.CreateIndex("Quantity")));
				
				// Testing if the insert function functions 
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Inserting " + inventory_10.getSKU() + " in the inventory database.... "); 
				warehouseDb.InsertRecord(inventory_10);
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Results: ");
				// verifying if the totals have changed with the new input 
				System.out.println(" There are " + warehouseDb.TotalInventoryQuantity() + " inventories in this database.");
				System.out.println(" The total value of the inventories is: " + warehouseDb.TotalInventoryValue());
				System.out.println();
				
				System.out.println("-------------------------------------------------------------------------- ");
				// Testing the find function 
				System.out.println(" Finding " + inventory_9.getSKU()+ " in the inventory database...");
				System.out.println("-------------------------------------------------------------------------- ");
				warehouseDb.findRecord("IN009");
				System.out.println();

				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Removing " + inventory_10.getSKU()+ " From the inventory database...");
				System.out.println("-------------------------------------------------------------------------- ");
				// Testing the remove record and verifying if the totals have reduced 
				warehouseDb.RemoveRecord("IN0010");
				System.out.println(" There are " + warehouseDb.TotalInventoryQuantity() + " inventories in this database.");
				System.out.println(" The total value of the inventories is: " + warehouseDb.TotalInventoryValue());
				System.out.println();
				
				System.out.println("-------------------------------------------------------------------------- ");
				// Testing the clear database function and verifying if the warehouse is clean 
				System.out.println(" Clearing the inventory database .....  ");
				warehouseDb.clearDatabase();
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Results: ");
				System.out.println(" Trying to find "+ inventory_1.getSKU()+ " in the deleted inventory database...");
				warehouseDb.findRecord("IN001");
				System.out.println(" There are " + warehouseDb.TotalInventoryQuantity() + " inventories in this database.");
				System.out.println(" The total value of the inventories is: " + warehouseDb.TotalInventoryValue());
				
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println("Testing the CreateIndex function....");
				warehouseDb.InsertRecord(inventory_1);
				warehouseDb.InsertRecord(inventory_2);
				warehouseDb.InsertRecord(inventory_3);
				warehouseDb.InsertRecord(inventory_7);
				warehouseDb.InsertRecord(inventory_5);
				warehouseDb.InsertRecord(inventory_6);
				warehouseDb.InsertRecord(inventory_4);
				warehouseDb.InsertRecord(inventory_8);
				warehouseDb.InsertRecord(inventory_9);
				warehouseDb.InsertRecord(inventory_10);
				warehouseDb.InsertRecord(inventory_11);
				
				Inventory [] sortedInventory = new Inventory[10];
				sortedInventory = warehouseDb.CreateIndex("SKU"); 
				
				int i;
				for(i=0; i < sortedInventory.length ; i++) 
				{
					System.out.print(sortedInventory[i].PrintRecord());
				}
				
				BSTNode<Inventory> Inv = new BSTNode<Inventory> ();
				
				Inv = warehouseDb.createIndex("SKU");
				
				warehouseDb.InOrderTraversing(Inv);
				
				
	}
	
	// creating the database Variables 
	
	private double inventoryTotalValue; // will help in calculating total cost of the inventory
	private int inventory_number_of_entries; // will help in calculating total value of the inventory
	private Linked_List_Dictionary<String,Inventory> warehouse;  // warehouse object to store all inventory items
	

	// Database member function 
	
	// constructor 
	 Warehouse_DB_Linked_List()
	{
		warehouse = new Linked_List_Dictionary<String, Inventory>();      
		inventoryTotalValue = 0.0;
		inventory_number_of_entries = 0;
	}
	
// inserting a record 
	public void InsertRecord(Inventory I) 
	{
		warehouse.insert(I.getSKU(),I);
	    inventoryTotalValue += I.getInventoryValue();
	    inventory_number_of_entries ++;
	}
	
	// removing a record given a key 
	public void RemoveRecord(String k)
	{
		if(warehouse.find(k) != null)
		{
			inventory_number_of_entries--;
			inventoryTotalValue -= warehouse.find(k).getInventoryValue() ;
			warehouse.remove(k);
			System.out.println(" Item " + k + " Has been removed.");
		}
		else System.out.println(" Item " + k + " is non existant or has already been removed.");
	}
	
	// Clearing the database 
	public void clearDatabase() 
	{
	    warehouse.clear();
	    inventory_number_of_entries = 0;
	    inventoryTotalValue = 0;
	}
	
	public Inventory[] CopyList() {
		
		Inventory[] copy = new Inventory[warehouse.size()];
		Integer Count = 0;
		
		for(warehouse.getV_list().moveToStart(); warehouse.getV_list().currPos() < warehouse.size();warehouse.getV_list().moveToPos(Count)) 
		{
			copy[Count++] = (warehouse.getV_list()).getValue();
		}
		return copy;
		
	}
	// returning the total number of inventories 
	public int TotalInventoryQuantity() {return inventory_number_of_entries;}

	// prints out the total inventory value 
	public double TotalInventoryValue() {return inventoryTotalValue; }
	
	// finding the record in the inventory 
	public void findRecord (String SKU) 
	{
	    if(warehouse.find(SKU)!= null)
	    {
	    	System.out.println(" " + warehouse.find(SKU).getSKU()+ " has been found and corresponds to: ");
	    	warehouse.find(SKU).PrintRecord(); 
	    }
	    else System.out.println(" The record was not found in the inventory."); 

	}
	
	// Method for finding the pivot 
	
		int findpivot(Inventory[] A, int i, int j){ return (i+j)/2; }
		
		// Partition method to be used inside quicksort
		
		int partition(String Att, Inventory[] A, int l, int r, Inventory pivot) {
			  
			do {// Move bounds inward until they meet

				  if (Att == "SKU") //fetch the SKU variables from the inventory database
				  {
				     while (A[++l].getSKU().compareTo(pivot.getSKU())<0);
				     while ((r!=0) && (A[--r].getSKU().compareTo(pivot.getSKU())>0));
				  }
				  else if (Att == "Name")
				  {
					  while (A[++l].getName().compareTo(pivot.getName())<0);
					  while ((r!=0) && (A[--r].getName().compareTo(pivot.getName())>0));
				  }
				  else if(Att == "Description")
				  {
					  while (A[++l].getDescription().compareTo(pivot.getDescription())<0);
					  while ((r!=0) && (A[--r].getDescription().compareTo(pivot.getDescription())>0));
				  }
				  
				  
			DSutil.swap(A, l, r);       // Swap out-of-place values
			  }
			
			while (l < r);              // Stop when they cross
			  DSutil.swap(A, l, r);         // Reverse last, wasted swap
			  return l;      // Return first position in right partition
			}
		
		// implementing the quicksort algorithm from the source code
		
		void qsort(String att, Inventory[] A, int i, int j) 
		{      
			
			  int pivotindex = findpivot(A, i, j); // Pick a pivot
			  
			  DSutil.swap(A, pivotindex, j);       // Stick pivot at end
			  
			  // k will be the first position in the right subarray
			  
			  int k = partition(att,A, i-1, j, A[j]);
			  
			  DSutil.swap(A, k, j);  // Put pivot in place
			  
			  if ((k-i) > 1) qsort(att, A, i, k-1);   // Sort left partition
			  if ((j-k) > 1) qsort(att, A, k+1, j);   // Sort right partition
			}


	public Inventory[] CreateIndex(String Attribute) 
	{
		/* Algorithm: 
		 * 1. Create a temporary value to store a copy of the inventory database 
		 * 2. switch statement to determine which attribute will be selected for sorting 
		 * 3. Sort the attribute inside of the switch statement 
		 * 4. return the sorted temporary array 
		 */
		Inventory[] Temp = this.CopyList(); 
		qsort(Attribute,Temp,0,warehouse.size()-1); 
		return Temp; 
	}
	
	//Q1.2 
	public BSTNode<Inventory> createIndex(String Attribute){
		 
		BSTNode<Inventory> TreeRoot = new BSTNode<Inventory>();
		Inventory [] CopyInv = CopyList();
		
	
		for(int i=0; i<=CopyInv.length-1; i++) {
			
			inserthelp(Attribute,TreeRoot,CopyInv[i]);
		}
		
		return TreeRoot;
	}
	
	public void InOrderTraversing(BSTNode<Inventory> I) {
		
		if (I == null) return; // Empty subtree - do nothing
		InOrderTraversing(I.left()); // Process left nodes
		System.out.print(I.element().PrintRecord()); // Process root node
		InOrderTraversing(I.right()); // Process all nodes in right
		
	}
	
	public void inserthelp(String Attribute,BSTNode<Inventory> rt,Inventory e) {
		  if (rt == null) {
			  
			  rt = new BSTNode<Inventory> (e);
		  }
		  else {
			  if(Attribute == "SKU") {
				 
				  if((rt.element().getSKU()).compareTo(e.getSKU())== 1) {
					  //go right 
					  if(rt.element() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.element() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Name")
			  {}
		  }
		}
	
	//Q2 
	
	public String query(String attribute, double perct) {
		
		Inventory [] Temp = new Inventory[warehouse.size()];
		Temp = CreateIndex(attribute);
		
		double pivot = Math.floor(warehouse.size()*perct);
	
		return Temp[(int) pivot].PrintRecord();
	}
}
