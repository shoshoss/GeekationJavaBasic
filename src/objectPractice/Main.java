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
		
		Geekdam geekdamA = new Geekdam();
		Geekdam geekdamB = new Geekdam();
		Geekdam geekdamC = new Geekdam();
		System.out.println();
	
		
		// 4. 呼び出す時はインスタンスの生成時に値を設定
		// ここでインスタンスフィールドに値を設定するだけ
		Geekdam2 geekdam2A = new Geekdam2("Geekdam一郎", 22);
		Geekdam2 geekdam2B = new Geekdam2("Geekdam仁郎", 20);
		
		System.out.println(geekdam2A.name);
		System.out.println(geekdam2A.age);
		System.out.println(geekdam2B.name);
		System.out.println(geekdam2B.age);
		
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
	Geekdam() {
		System.out.println("これがコンストラクタです。");
	}
}

class Geekdam2 {
	// 1. インスタンスフィールドを定義
	public String name;
	public int age;
	
	// 2. コンストラクタの引数にインスタンスフィールドを渡す
	Geekdam2(String name, int age) {
		// 3. `this.インスタンスフィールド名 = インスタンスフィールド名`の形で設定
		this.name = name;
		this.age = age;		
	}
}
