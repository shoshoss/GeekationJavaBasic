package objectPractice;

public class Sample {
	private String lastName;
	private String firstName;
	
	Sample(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	// ゲッターはprivateなフィールドの値を取得するためのpublicなメソッドのこと
	// lastNameのゲッター
	public String getLastName() {
		return this.lastName;
	}
	
	// firstNameのゲッター
	public String getFirstName() {
		return this.firstName;
	}
	
	// セッターはprivateなフィールドの値を更新するためのpublicなメソッドのこと
	// firstNameのセッター
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// firstNameのセッター
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
