package objectPractice;

public class Property {
	private String itemName;
	private  String itemOwnerName;
	private  String itemType;
	private  int price;
	
	Property(String itemName, String itemOwnerName, String itemType, int price) {
		this.itemName = itemName;
		this.itemOwnerName = itemOwnerName;
		this.itemType = itemType;
		this.price = price;
	}
	
	public void propertyData() {
		System.out.println("=============================");
		System.out.println("物件名：" + this.itemName);
		System.out.println("物件所有者名" + this.itemOwnerName);
		System.out.println("物件種別" + this.itemType);
		System.out.println("物件価格" + this.price + "円");
	}
	
	// ゲッター
	public String getItemName() {
		return this.itemName;
	}
	
	public String itemOwnerName () {
		return this.itemOwnerName;
	}
	
	public String itemType() {
		return this.itemType;
	}
	
	public int price() {
		return this.price;
	}
	
	// セッター
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public void detItemOwnerName(String itemOwnerName) {
		this.itemOwnerName = itemOwnerName;
	}
	
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
