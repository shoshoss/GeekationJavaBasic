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
		Geekdam2 geekdam2B = new Geekdam2("Geekdam仁郎", 20, 175.2);
		
		System.out.println(geekdam2A.name);
		System.out.println(geekdam2A.age);
		System.out.println(geekdam2A.height); // 一方のコンストラクタにしか設定されていないフィールドには初期値が入ります。
		System.out.println(geekdam2B.name);
		System.out.println(geekdam2B.age);
		System.out.println(geekdam2B.height);
		System.out.println();
		
		Sample sample = new Sample("Geek", "太郎");
		
		// 下記のようにゲッターを呼び出してあげることで値の取得が可能になります。
		System.out.println(sample.getLastName());
		System.out.println(sample.getFirstName());
		
		// 下記のようにセッターを使って値を更新することが可能になります。
		sample.setLastName("Geekation");
		sample.setFirstName("二郎");
		
		// フィールドの値が更新されていることを確認しましょう。
		System.out.println(sample.getLastName());
		System.out.println(sample.getFirstName());
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
	public double height;
	
	// 2. コンストラクタの引数にインスタンスフィールドを渡す
	Geekdam2(String name, int age) {
		// 3. `this.インスタンスフィールド名 = インスタンスフィールド名`の形で設定
		this.name = name;
		this.age = age;		
	}
	
	// オーバーロードしたコンストラクタ
	// 同名のメソッドでも 「引数の個数」や「引数のデータ型」が異なれば定義できるという手法
	Geekdam2(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
}
