package Question5;


public class Inventory{

	private String SKU;
	private String Description;
	private String BinNum;
	private String Location;
	private String Unit;
	private int Quantity;
	private int ReorderQuantity;
	private double Cost;
	private double InventoryValue; 
	private boolean Reorder; 
	
	Inventory(){
		
		SKU = "";
		Description ="";
		BinNum = "";
		Location = "";
		Unit = "";
		Quantity = 0;
		ReorderQuantity = 0;
		Cost = 0.0;
		InventoryValue = 0.0;
		Reorder = false; 
		
	}
	
	Inventory(String ID, String D, String BN, String Loc, String unit, int q, int RQ, double cost, double IV, boolean R){
		
		SKU = ID;
		Description = D;
		BinNum = BN;
		Location = Loc;
		Unit = unit;
		Quantity = q;
		ReorderQuantity = RQ;
		Cost = cost;
		InventoryValue = IV;
		Reorder = R; 
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
	;
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
	
	public void PrintRecord(Inventory I) {
		System.out.println("The inventory Record is SKU = " + I.SKU + "Description = " + I.Description + "BinNum = " + I.BinNum + "Location = " + I.Location +  "Unit = " + I.Location + "Quantity = " + I.Quantity + "Reorder Quantity = " + I.ReorderQuantity + "Cost = " + I.Cost + " Inventory Value = " + I.InventoryValue +" Reorder = " + I.Reorder);
	}
}
