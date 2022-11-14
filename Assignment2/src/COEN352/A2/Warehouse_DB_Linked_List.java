// Irakiza Dushime Chris 
// Magy Gerges 
// Assignment 2: implementing the warehouse class  

package COEN352.A2;
import java.util.Arrays;
import java.lang.Math;

public class Warehouse_DB_Linked_List 
{
public static void main(String[] args) 
	{
		// declaring an object of the type warehouse 
		
		Warehouse_DB_Linked_List warehouseDb = new Warehouse_DB_Linked_List();
		
			/* adding the entries from the excel sheet 
			declaring an object of the type inventory to store all information using the set functions to populate the fields
			*/
				// First item 
				Inventory inventory_1 = new Inventory("IN0001","Item 01","Desc 01",51.00,25,1275.00,29,13,50,true); 
				
				// Second item 
				Inventory inventory_2 = new Inventory("IN0002","Item 02","Desc 02",93.00,132,12276.00,231,4,50,true); 
				
				// Third item 
				Inventory inventory_3 = new Inventory("IN0003","Item 03","Desc 03",57.00,151,8607.00,114,11,150,false); 
				
				// Fourth item 
				Inventory inventory_4 = new Inventory("IN0004","Item 04","Desc 04",19.00,186,3534.00,158,6,50,false); 
				
				// Fifth item
				Inventory inventory_5 = new Inventory("IN0005","Item 05","Desc 05",75.00,62,4650.00,39,12,50,false); 
				
				// Sixth item 
				Inventory inventory_6 = new Inventory("IN0006","Item 06","Desc 06",11.00,5,55.00,9,13,150,false); 
				
				// Seventh item 
				Inventory inventory_7 = new Inventory("IN0007","Item 07","Desc 07",56.00,58,3428.00,109,7,100,false); 
				
				// Eighth item 
				Inventory inventory_8 = new Inventory("IN0008","Item 08","Desc 08",38.00,101,3838.00,162,3,100,true); 
				
				// ninth item 
				Inventory inventory_9 = new Inventory("IN0009","Item 09","Desc 09",59.00,122,7198.00,82,3,150,false); 
				
				// tenth item 
				Inventory inventory_10 = new Inventory("IN0010","Item 10","Desc 10",50.00,175,8750.00,283,8,150,true); 
			
				// eleventh item 
				Inventory inventory_11 = new Inventory("IN0011","Item 11","Desc 11",59.00,176,10384.00,229,1,100,true); 
				
				// twelfth item
				Inventory inventory_12 = new Inventory("IN0012","Item 12","Desc 12",18.00,22,396.00,36,12,50,true); 
				
			// testing 
				
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Inserting new values: ...");
				warehouseDb.InsertRecord(inventory_2);
				warehouseDb.InsertRecord(inventory_4);
				warehouseDb.InsertRecord(inventory_1);
				warehouseDb.InsertRecord(inventory_7);
				warehouseDb.InsertRecord(inventory_5);
				warehouseDb.InsertRecord(inventory_6);
				warehouseDb.InsertRecord(inventory_3);
				warehouseDb.InsertRecord(inventory_8);
				warehouseDb.InsertRecord(inventory_10);
				warehouseDb.InsertRecord(inventory_12);
				warehouseDb.InsertRecord(inventory_9);
				warehouseDb.InsertRecord(inventory_11);
				
				// Question 1.1: Testing the Createindex() method that return Inventory
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Question 1.1: Testing the CreateIndex function that outputs the sorted values of an attribute....");
	
				Inventory [] sortedInventory = new Inventory[11];
				sortedInventory = warehouseDb.CreateIndex("Inventory Value"); 
				
				int i;
				for(i=0; i < sortedInventory.length ; i++) 
				{
					System.out.print(sortedInventory[i].PrintRecord());
				}
				System.out.println();
				System.out.println();
				
				// Question 1.2: Testing the Createindex() method that does in-order traversing
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println("-------------------------------------------------------------------------- ");
				System.out.println(" Question 1.2: Testing the CreateIndex function to return in-order traversing....");
				System.out.println(); 
				
				System.out.println("SKU");
				BSTNode<Inventory> Inv1 = warehouseDb.createIndex("SKU");
				warehouseDb.InOrderTraversing(Inv1);
				System.out.println(); 
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Name");
				BSTNode<Inventory> Inv2 = warehouseDb.createIndex("Name");
				warehouseDb.InOrderTraversing(Inv2);
				System.out.println(); 
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Description");
				BSTNode<Inventory> Inv3 = warehouseDb.createIndex("Description");
				warehouseDb.InOrderTraversing(Inv3);
				System.out.println(); 
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Unit Price");
				BSTNode<Inventory> Inv4 = warehouseDb.createIndex("Unit Price");
				warehouseDb.InOrderTraversing(Inv4);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Quantity in Stock");
				BSTNode<Inventory> Inv5 = warehouseDb.createIndex("Quantity in stock");
				warehouseDb.InOrderTraversing(Inv5);
				System.out.println(); 
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Inventory Value");
				BSTNode<Inventory> Inv6 = warehouseDb.createIndex("Inventory Value");
				warehouseDb.InOrderTraversing(Inv6);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Reorder Quantity");
				BSTNode<Inventory> Inv7 = warehouseDb.createIndex("Reorder Quantity");
				warehouseDb.InOrderTraversing(Inv7);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Reorder Time");
				BSTNode<Inventory> Inv8 = warehouseDb.createIndex("Reorder Time");
				warehouseDb.InOrderTraversing(Inv8);
				System.out.println();
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println(" Quantity in Reorder");
				BSTNode<Inventory> Inv9 = warehouseDb.createIndex("Quantity in Reorder");
				warehouseDb.InOrderTraversing(Inv9);
				System.out.println();
				
				// Question 2 and Question 3. Queury() method is being tested in J-UNIT testing 
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
				  else if(Att == "Unit Price")
				  {
					  while (A[++l].getUnitPrice() < pivot.getUnitPrice());
					  while ((r!=0) && (A[--r].getUnitPrice()> pivot.getUnitPrice()));
				  }
				  else if(Att == "Quantity in stock")
				  {
					  while (A[++l].getQuantityInStock() < pivot.getQuantityInStock());
					  while ((r!=0) && (A[--r].getQuantityInStock()> pivot.getUnitPrice()));
				  }
				  else if(Att == "Inventory Value")
				  {
					  while (A[++l].getInventoryValue() < pivot.getInventoryValue());
					  while ((r!=0) && (A[--r].getInventoryValue())> pivot.getInventoryValue());
				  }
				  else if(Att == "Reorder Quantity")
				  {
					  while (A[++l].getReorderQuantity() < pivot.getReorderQuantity());
					  while ((r!=0) && (A[--r].getReorderQuantity())> pivot.getReorderQuantity());
				  }
				  else if(Att == "Reorder Time")
				  {
					  while (A[++l].getReorderTime() < pivot.getReorderTime());
					  while ((r!=0) && (A[--r].getReorderTime())> pivot.getReorderTime());
				  }
				  else if(Att == "Quantity in Reorder")
				  {
					  while (A[++l].getQuantityInReorder() < pivot.getQuantityInReorder());
					  while ((r!=0) && (A[--r].getQuantityInReorder())> pivot.getQuantityInReorder());
				  }
				  else System.out.println(" Invalid attribute. Please enter a valid attribute.");
	
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
	
	//Q1.2
	public void InOrderTraversing(BSTNode<Inventory> I) {
		
		if (I == null) return; // Empty subtree - do nothing
		InOrderTraversing(I.left()); // Process left nodes
		System.out.println(I.element().PrintRecord()); // Process root node
		InOrderTraversing(I.right()); // Process all nodes in right
		
	}
	
	public void inserthelp(String Attribute,BSTNode<Inventory> rt,Inventory e) {
		  if (rt.element() == null) {rt.setElement(e);}
		  else {
			  if(Attribute == "SKU") {
					 
				  if(rt.element().getSKU().compareTo(e.getSKU()) <= 0) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Name") {
					 
				  if(rt.element().getName().compareTo(e.getName()) <= 0) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Description") {
					 
				  if(rt.element().getDescription().compareTo(e.getDescription()) <= 0) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Unit Price") {
					 
				  if(rt.element().getUnitPrice() <= e.getUnitPrice()) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Quantity in stock") {
					 
				  if(rt.element().getQuantityInStock() <= e.getQuantityInStock()) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Inventory Value") {
					 
				  if(rt.element().getInventoryValue() <= e.getInventoryValue()) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  
			  else if(Attribute == "Reorder Quantity") {
				 
				  if(rt.element().getReorderQuantity() <= e.getReorderQuantity()) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
			  }
			  else if(Attribute == "Reorder Time") {
					 
				  if(rt.element().getReorderTime() <= e.getReorderTime()) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else if(Attribute == "Quantity in Reorder") {
					 
				  if(rt.element().getQuantityInReorder() <= e.getQuantityInReorder()) {
					  //go right 
					  if(rt.right() == null)
					  {
						  rt.setRight(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.right(),e);
				  }
				  else 
					  //go left 
					  if(rt.left() == null)
					  {
						  rt.setLeft(new BSTNode<Inventory> (e));
					  }
					  else 
						  inserthelp(Attribute,rt.left(),e);
					  
			  }
			  else System.out.println (" Invalid attribute, please enter a valid attribute."); 
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
