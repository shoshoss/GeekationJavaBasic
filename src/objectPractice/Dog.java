package objectPractice;

public class Dog extends Animal {
	private String job;

	Dog(String name, String breeds, double weight, String job) {
		super(name, breeds, weight);
		this.job = job;
	}
	
	// オーバーライド
	// DogクラスでAnimalクラスのgreetingメソッドを上書きします。
	// 1. スーパークラスと同じシグネチャ（メソッド名、引数の型および順序）のメソッドを追加する
	public void greeting() {
		super.greeting();
		// 2. jobフィールドを使って、出力処理を追加する
		System.out.println("仕事は" + this.job + "をしています。");
	}
}
