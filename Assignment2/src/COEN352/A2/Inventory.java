// Irakiza Dushime Chris 
// Magy Gerges 

// Inventory class  

package COEN352.A2;


public class Inventory {

	private String SKU;
	private String Name;
	private String Description;
	private Double UnitPrice;
	private Integer QuantityInStock;
	private Double InventoryValue; 
	private Integer ReorderQuantity;
	private Integer ReorderTime;
	private Integer QuantityInReorder;
	private Boolean Discontinued; 
	
	// default constructor
	Inventory()
	{
		
		SKU = "";
		Name = "";
		Description ="";
		UnitPrice = 0.0;
		QuantityInStock = 0;
		InventoryValue = 0.0; 
		ReorderQuantity = 0;
		ReorderTime= 0;
		QuantityInReorder= 0;
		Discontinued = false; 
		
	}
	
	// constructor 
	Inventory(String ID,String N, String Des, Double U, Integer QS, Double InvV, Integer RQ, Integer RT, Integer QR, Boolean D)
	{
		
		SKU = ID;
		Name = N;
		Description = Des;
		UnitPrice = U;
		QuantityInStock = QS;
		InventoryValue = InvV; 
		ReorderQuantity = RQ;
		ReorderTime= RT;
		QuantityInReorder= QR;
		Discontinued = D; 
	}
	
	//GETTERS
	public String getSKU() { return SKU;}
		
	public String getName () { return Name;}
		
	public String getDescription() {return Description;}
	
	public Double getUnitPrice() { return UnitPrice;}
		
	public int getQuantityInStock() { return QuantityInStock;}
	
	public double getInventoryValue() {return InventoryValue;}
		
	public double ReorderQuantity() {return ReorderQuantity;}
		
	public int getReorderTime() {return ReorderTime;}
		
	public int getQuantityInReorder() { return QuantityInReorder;}
		
	public boolean getDiscontinuedStatus() { return Discontinued;}
		
	
	//SETTERS
	
	public void setSKU(String SKU) { this.SKU = SKU; }
	
	public void setBinNum(String Name) { this.Name = Name; }
	
	public void setDescription(String Description) { this.Description = Description; }
	
	public void getUnitPrice(Double PriceUnit) { this.UnitPrice = PriceUnit; }
		
	public void setQuantityInStock(int Q) { this.QuantityInStock = Q; }
	
	public void setInventoryValue(double Inv) { this.InventoryValue = Inv; }
	
	public void setReorderQuantity(int Re) { this.ReorderQuantity = Re; }
	
	public void setReorderTime(int Reorder) { this.ReorderTime = Reorder; }
		
	public void setQuantityInReorder(int Quant) {this.QuantityInReorder = Quant;}
	
	public void setDiscontinuedStatus(boolean disc) {this.Discontinued = disc;}
	
}
