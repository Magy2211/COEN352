// Irakiza Dushime Chris 
// Magy Gerges 
// Assignment 1 Q5 Part 2) implementing the warehouse class to execute the inventory functions 


package COEN352.A2;

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
				
				inventory_1.setSKU("SP7875"); 
				inventory_1.setDescription("Item 1");
				inventory_1.setBinNum("T345");
				inventory_1.setLocation("Row 2, Slot 1");
				inventory_1.setUnit("Each");
				inventory_1.setQuantity(20);
				inventory_1.setReorderQuantity(10);
				inventory_1.setCost(30.00);
				inventory_1.setInvVal(600.00);
				inventory_1.setReorder(false);
				
				// Second item 
				
				Inventory inventory_2 = new Inventory(); 
				
				inventory_2.setSKU("TR87680"); 
				inventory_2.setDescription("Item 2");
				inventory_2.setBinNum("T345");
				inventory_2.setLocation("Row 2, Slot 1");
				inventory_2.setUnit("Each");
				inventory_2.setQuantity(30);
				inventory_2.setReorderQuantity(15);
				inventory_2.setCost(40.00);
				inventory_2.setInvVal(1200.00);
				inventory_2.setReorder(false);
				
				// Third item 
				
				Inventory inventory_3 = new Inventory(); 
				
				inventory_3.setSKU("MK676554"); 
				inventory_3.setDescription("Item 3");
				inventory_3.setBinNum("T5789");
				inventory_3.setLocation("Row 1, Slot 1");
				inventory_3.setUnit("Each");
				inventory_3.setQuantity(10);
				inventory_3.setReorderQuantity(5);
				inventory_3.setCost(5.00);
				inventory_3.setInvVal(50.00);
				inventory_3.setReorder(false);
				
				// Fourth item 
				
				Inventory inventory_4 = new Inventory(); 
				
				inventory_4.setSKU("YE98767"); 
				inventory_4.setDescription("Item 4");
				inventory_4.setBinNum("T9876");
				inventory_4.setLocation("Row 3, Slot 2");
				inventory_4.setUnit("Box(10 ct)");
				inventory_4.setQuantity(40);
				inventory_4.setReorderQuantity(10);
				inventory_4.setCost(15.00);
				inventory_4.setInvVal(600.00);
				inventory_4.setReorder(false);
				
				// Fifth item 
				
				Inventory inventory_5 = new Inventory(); 
				
				inventory_5.setSKU("XR23423"); 
				inventory_5.setDescription("Item 5");
				inventory_5.setBinNum("T098");
				inventory_5.setLocation("Row 3, Slot 1");
				inventory_5.setUnit("Each");
				inventory_5.setQuantity(12);
				inventory_5.setReorderQuantity(10);
				inventory_5.setCost(26.00);
				inventory_5.setInvVal(312.00);
				inventory_5.setReorder(false);
				
				
				// Sixth item 
				
				Inventory inventory_6 = new Inventory(); 
				
				inventory_6.setSKU("PW98762"); 
				inventory_6.setDescription("Item 6");
				inventory_6.setBinNum("T345");
				inventory_6.setLocation("Row 2, Slot 1");
				inventory_6.setUnit("Each");
				inventory_6.setQuantity(7);
				inventory_6.setReorderQuantity(10);
				inventory_6.setCost(50.00);
				inventory_6.setInvVal(350.00);
				inventory_6.setReorder(true);
				
				// Seventh item 
				
				Inventory inventory_7 = new Inventory(); 
				
				inventory_7.setSKU("BM87684"); 
				inventory_7.setDescription("Item 7");
				inventory_7.setBinNum("T349");
				inventory_7.setLocation("Row 1, Slot 2");
				inventory_7.setUnit("Each");
				inventory_7.setQuantity(10);
				inventory_7.setReorderQuantity(5);
				inventory_7.setCost(10.00);
				inventory_7.setInvVal(100.00);
				inventory_7.setReorder(false);
				
				// Eighth item 
				
				Inventory inventory_8 = new Inventory(); 
				
				inventory_8.setSKU("BH67655"); 
				inventory_8.setDescription("Item 8");
				inventory_8.setBinNum("T5789");
				inventory_8.setLocation("Row 1, Slot 1");
				inventory_8.setUnit("Each");
				inventory_8.setQuantity(19);
				inventory_8.setReorderQuantity(10);
				inventory_8.setCost(3.00);
				inventory_8.setInvVal(57.00);
				inventory_8.setReorder(false);
				
				// ninth item 
				
				Inventory inventory_9 = new Inventory(); 
				
				inventory_9.setSKU("WT98768"); 
				inventory_9.setDescription("Item 9");
				inventory_9.setBinNum("T9875");
				inventory_9.setLocation("Row 2, Slot 2");
				inventory_9.setUnit("Package (5 ct)");
				inventory_9.setQuantity(20);
				inventory_9.setReorderQuantity(30);
				inventory_9.setCost(14.00);
				inventory_9.setInvVal(280.00);
				inventory_9.setReorder(true);
				
				// tenth item 
				
				Inventory inventory_10 = new Inventory(); 
				
				inventory_10.setSKU("TS3495"); 
				inventory_10.setDescription("Item 10");
				inventory_10.setBinNum("T349");
				inventory_10.setLocation("Row 1, Slot 2");
				inventory_10.setUnit("Each");
				inventory_10.setQuantity(15);
				inventory_10.setReorderQuantity(8);
				inventory_10.setCost(60.00);
				inventory_10.setInvVal(900.00);
				inventory_10.setReorder(false);
				
				// eleventh item 
				
				Inventory inventory_11 = new Inventory(); 
				
				inventory_11.setSKU("WDG123"); 
				inventory_11.setDescription("Item 11");
				inventory_11.setBinNum("T349");
				inventory_11.setLocation("Row 1, Slot 2");
				inventory_11.setUnit("Each");
				inventory_11.setQuantity(25);
				inventory_11.setReorderQuantity(15);
				inventory_11.setCost(8.00);
				inventory_11.setInvVal(200.00);
				inventory_11.setReorder(false);
				
				// Testing the insert function 
				System.out.println("Inserting new values: ...");
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
					
				System.out.println("Results: ");
				// Verifying the total number and value of the added items in the database 
				warehouseDb.TotalInventoryQuantity();
				warehouseDb.TotalInventoryValue() ;
				System.out.println("-------------------------------------------------------------------------- ");
				
				
				// Testing if the insert function functions 
				System.out.println("Inserting a new entry... ");
				warehouseDb.InsertRecord(inventory_10);
				
				System.out.println("Results: ");
				// verifying if the totals have changed with the new input 
				warehouseDb.TotalInventoryQuantity();
				warehouseDb.TotalInventoryValue() ;
				System.out.println("-------------------------------------------------------------------------- ");
				
				System.out.println("Finding a record... ");
				warehouseDb.findRecord("TR87680");
				System.out.println("-------------------------------------------------------------------------- ");
				
				// Testing the find function 
				System.out.println("Removing one entry... ");
				// Testing the remove record and verifying if the totals have reduced 
				warehouseDb.RemoveRecord("TR87680");
				warehouseDb.TotalInventoryQuantity();
				warehouseDb.TotalInventoryValue() ;
				System.out.println("-------------------------------------------------------------------------- ");
				
				// Testing the clear database function and verifying if the warehouse is clean 
				System.out.println("Clearing the Database .....  ");
				warehouseDb.clearDatabase();
				warehouseDb.findRecord("TR87680");
				warehouseDb.TotalInventoryQuantity();
				warehouseDb.TotalInventoryValue() ; 
				System.out.println("-------------------------------------------------------------------------- ");
			
	}
	// creating the database Variables 
	private double inventoryTotalValue = 0; // will help in calculating total cost of the inventory
	private double inventory_number_of_entries = 0; // will help in calculating total value of the inventory
	
	private Linked_List_Dictionary<String,Inventory> warehouse;
	
	
	// constructor 
	 Warehouse_DB_Linked_List()
	{
		warehouse = new Linked_List_Dictionary<String, Inventory>();                             
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
			System.out.println("Item " + k + " Has been removed.");
		}
		else System.out.println("Item " + k + " Is non existant or has already been removed.");
	}
	
	// Clearing the database 
	
	public void clearDatabase() 
	{
	    warehouse.clear();
	    inventory_number_of_entries = 0;
	    inventoryTotalValue = 0;
	    
	}
	
	// finding the total number of inventories 
	
	public void TotalInventoryQuantity() 
	{
		System.out.println("There are " + inventory_number_of_entries + " inventories in this database.");
		
	}

	// prints out the total inventory value 
	
	public void TotalInventoryValue() 
	{
		System.out.print("The total value of the inventories is: ");
		System.out.println(inventoryTotalValue); 
	}
	
	// finding the record in the inventory 
	
	public void findRecord (String SKU) 
	{
		
	    if(warehouse.find(SKU)!= null)
	    {
	    	System.out.println("Record has been found and corresponds to: ");
	    	warehouse.find(SKU).PrintRecord();
	    }
	    else System.out.println("The record was not found in the inventory.");
	    
	}
	
}
