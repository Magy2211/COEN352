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
			
			Inventory TestElement2 = new Inventory("IN0005","Item 5","Desc 5",75.00,62,4650.00,39,12,50,false);
			
			String returnedInv2 = warehouseDb.query("UnitPrice", 0.37);
			
			assertEquals(TestElement2.PrintRecord(),returnedInv2," values are not in ascending order."); 
		}
	
}