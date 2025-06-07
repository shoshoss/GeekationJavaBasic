package objectPractice;

public class Apartment extends Property {
	private String interval;
	
	Apartment(String itemName, String itemOwnerName, String itemType, int price, String interval) {
		super(itemName, itemOwnerName, itemType, price);
		this.interval = interval;
	}
	
	public void propertyData() {
		super.propertyData();
		System.out.println("間取り：" + this.interval);
		System.out.println("=============================");
	}

}
