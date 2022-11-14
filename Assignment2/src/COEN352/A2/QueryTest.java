package COEN352.A2;
//Q3 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class QueryTest {
	
		private static Warehouse_DB_Linked_List warehouseDb; 
		@BeforeAll
		public static void setUp() {
			warehouseDb = new Warehouse_DB_Linked_List();
			
			// First item 
			Inventory inventory_1 = new Inventory("IN0001","Item 1","Desc 1",51.00,25,1275.00,29,13,50,true); 
			
			// Second item 
			Inventory inventory_2 = new Inventory("IN0002","Item 2","Desc 2",93.00,132,12276.00,231,4,50,true); 
			
			// Third item 
			Inventory inventory_3 = new Inventory("IN0003","Item 3","Desc 3",57.00,151,8607.00,114,11,150,false); 
			
			// Fourth item 
			Inventory inventory_4 = new Inventory("IN0004","Item 4","Desc 4",19.00,186,3534.00,158,6,50,false); 
			
			// Fifth item
			Inventory inventory_5 = new Inventory("IN004","Item 5","Desc 5",75.00,62,4650.00,39,12,50,false); 
			
			// Sixth item 
			Inventory inventory_6 = new Inventory("IN0006","Item 6","Desc 6",11.00,5,55.00,9,13,150,false); 
			
			// Seventh item 
			Inventory inventory_7 = new Inventory("IN0007","Item 7","Desc 7",56.00,58,3428.00,109,7,100,false); 
			
			// Eighth item 
			Inventory inventory_8 = new Inventory("IN0008","Item 8","Desc 8",38.00,101,3838.00,162,3,100,true); 
			
			// ninth item 
			Inventory inventory_9 = new Inventory("IN0009","Item 9","Desc 9",59.00,122,7198.00,82,3,150,false); 
			
			// tenth item 
			Inventory inventory_10 = new Inventory("IN0010","Item 10","Desc 10",50.00,175,8750.00,283,8,150,true); 
		
			// eleventh item 
			Inventory inventory_11 = new Inventory("IN0011","Item 11","Desc 11",59.00,176,10384.00,229,1,100,true); 
		
			// inserting records in the database 
			warehouseDb.InsertRecord(inventory_11);
			warehouseDb.InsertRecord(inventory_10);
			warehouseDb.InsertRecord(inventory_9);
			warehouseDb.InsertRecord(inventory_8);
			warehouseDb.InsertRecord(inventory_7);
			warehouseDb.InsertRecord(inventory_3);
			warehouseDb.InsertRecord(inventory_5);
			warehouseDb.InsertRecord(inventory_4);
			warehouseDb.InsertRecord(inventory_6);
			warehouseDb.InsertRecord(inventory_2);
			warehouseDb.InsertRecord(inventory_1); 
			
		}
		
		@Test 
		public void testSKUValue() {
		
			Inventory TestElement = new Inventory("IN0008","Item 8","Desc 8",38.00,101,3838.00,162,3,100,true);
			
			String returnedInv = warehouseDb.query("SKU", 0.64);
			
			assertEquals(TestElement.PrintRecord(),returnedInv,"SKU values are not in ascending order."); 
		}
		
		@Test 
		
		public void testUnitPriceValue() {
			
			Inventory TestElement2 = new Inventory("IN0001","Item 1","Desc 1",51.00,25,1275.00,29,13,50,false);
			
			String returnedInv2 = warehouseDb.query("Unit Price", 0.37);
			
			assertEquals(TestElement2.PrintRecord(),returnedInv2," Unit Price values are not in ascending order."); 
		}
	
}