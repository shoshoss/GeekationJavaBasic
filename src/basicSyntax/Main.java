package basicSyntax;

public class Main {

	public static void main(String[] args) {
		// 文字列: String
		System.out.println("こんにちは");
		System.out.println("私の名前は");
		System.out.println("Geek君です。");
		
		// 文字列は「+」で連結することができます。
		System.out.println("こんにちは" + "私の名前は" + "Geeek君です。");
		
		// 整数: int
		System.out.println(1);
		System.out.println(-1);
		System.out.println(5+ 1);
		
		// 数値は""で囲むと文字列扱いになります
		System.out.println("5 + 1");
		System.out.println("5" + "1");
		
		// 浮動小数点数: double
		System.out.println(0.25);
		System.out.println(-5.0);
		System.out.println(5.0 - 0.25);
		
		// 真偽値: boolean
		System.out.println(true);
	    System.out.println(false);
	    
	    // 変数の定義
	    String name;
	    int age;
	    
	    // 変数に値を代入
	    name = "Geek君";
	    age =25;
	    
	    // 変数の値を使って任意の処理を行う
	    System.out.println(name);
	    System.out.println(age);
	    
	    // 変数の初期化
	    String name2 = "Geek君";
	    int age2 =25;
	    
	    System.out.println(name2);
	    System.out.println(age2);
	    
	    // 変数の更新
	    name = "生まれ変わったGeek君";
	    age = 1;
	    
	    System.out.println(name);
	    System.out.println(age);
	    
	    // 変数の命名規則, データ型の自動変換
	    // Javaの変数名は「キャメルケース(Camel Case)」というルールで記述
	    age = 25;
	    String firstName = "イケイケ";
	    String middleName = "ギーク";
	    String lastName = "太郎";
	    
	    // String型にint型を連結すると、String型に自動変換
	    System.out.println(firstName + middleName + lastName + "の年齢は" + age + "歳です。");
	}

}
