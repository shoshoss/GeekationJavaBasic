package objectPractice;

public class Main {

	public static void main(String[] args) {
		// インスタンスを生成
		// クラス型 変数名 = new クラス名();
		Geekdam geekdam = new Geekdam();

		
		// geekdamインスタンスのインスタンスフィールドに値を設定します。
		geekdam.name = "Geekdam太郎";
		geekdam.color = "red";
		geekdam.height = 175.2;
		
		// geekdamインスタンスのインスタンスフィールドの値を出力します。
		System.out.println(geekdam.name);
		System.out.println(geekdam.color);
		System.out.println(geekdam.height);
		System.out.println();
		
		// インスタンスメソッドを呼び出し
		geekdam.greeting();

	}

}

class Geekdam {
	public void greeting() {
		System.out.println("やほ！ 私は" + this.name + "です。");
		System.out.println();
	}
	
	// インスタンスフィールド(属性)の定義と操作方法
		public String name;
		public String color;
		public double height;
}
