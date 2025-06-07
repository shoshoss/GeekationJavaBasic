package objectPractice;

public class Land extends Property {
	private  double size;
	
	Land(String itemName, String itemOwnerName, String itemType, int price, double size) {
		super(itemName, itemOwnerName, itemType, price);
		this.size = size;
	}
	
	public void propertyData() {
		super.propertyData();
		System.out.println("広さ：" + this.size + "㎡");
		System.out.println("=============================");
	}

}
