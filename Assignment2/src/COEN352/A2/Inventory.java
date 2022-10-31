

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
	
	Inventory(){
		
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
	
	Inventory(String ID,String N, String Des, Double U, Integer QS, Double InvV, Integer RQ, Integer RT, Integer QR, Boolean D){
		
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
	public String getSKU() {
		return SKU;
	}
	
	public String getDescription () {
		return Description;
	}
	
	public String getBinNUM() {
		return BinNum;
	}
	
	public String getLocation() {
		return Location;
	}
	
	public String getUnit() {
		return Unit;
	}
	
	public int getQuantity() {
		return Quantity;
	}
	public int getReorderQuantity() {
		return ReorderQuantity;
	}
	
	public double getCost() {
		return Cost;
	}
	
	public double getInventoryValue() {
		return InventoryValue;
	}
	public boolean getReorder() {
		return Reorder;
	}
	
	//SETTERS
	
	public void setSKU(String sku) {
		this.SKU = sku;
	}
	
	public void setDescription(String Description) {
		this.Description = Description;
	}
	
	public void setBinNum(String BinNum) {
		this.BinNum = BinNum;
	}
	
	public void setLocation(String Loc) {
		this.Location = Loc;
	}
	
	public void setUnit(String unit) {
		this.Unit = unit;
	}
	
	public void setQuantity(int q) {
		this.Quantity = q;
	}
	
	public void setReorderQuantity(int ReorderQ) {
		this.ReorderQuantity = ReorderQ;
	}
	
	public void setCost(double cost) {this.Cost = cost;}
	public void setInvVal(double IV) {this.InventoryValue = IV;}
	public void setReorder(boolean R) {this.Reorder = R;}
	
	public void PrintRecord() {
		System.out.println("The inventory Record is: \n " 
							+ "SKU = " + this.SKU + "\n"  
							+ " Description = " + this.Description + "\n" 
							+ " BinNum = " + this.BinNum + "\n" 
							+ " Location = " + this.Location + "\n" 
							+  " Unit = " + this.Location + "\n" 
							+ " Quantity = " + this.Quantity + "\n" 
							+ " Reorder Quantity = " + this.ReorderQuantity + "\n" 
							+ " Cost = " + this.Cost + "\n" 
							+ " Inventory Value = " + this.InventoryValue + "\n" 
							+" Reorder = " + this.Reorder);
	}
}
