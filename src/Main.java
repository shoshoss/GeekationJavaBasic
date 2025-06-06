
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello Geekation");
		
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
		
		// 四則演算と計算処理
		// 基本的な四則演算
		// 加算（足し算）
		int a = 5;
		int b = 3;
		int sum = a + b;
		
		System.out.println(sum);
		
		// 減算（引き算）
		int x = 10;
		int y = 4;
		int difference = x - y;
		
		System.out.println(difference);
		
		// 乗算（掛け算）
		int p = 7;
		int q = 2;
		int product = p * q;
		
		System.out.println(product);
		
		// 除算（割り算）
		int dividend = 20;
		int divisor = 5;
		int quotient = dividend / divisor;
		
		System.out.println(quotient);
		
		// 剰余算(割り算の余り)
		dividend = 17;
		divisor = 5;
		int remainder = dividend % divisor;
		
		System.out.println(remainder);
		
		// 自己代入
		// これまで
		a = 5;
		b = 20;
		int c = 5;
		int d = 20;
		int e = 10;
		
		a = a + 5;
		b = b - 10;
		c = c * 2;
		d = d / 2;
		e = e % 3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 省略した書き方
		a = 5;
		b = 20;
		c = 5;
		d = 20;
		e = 10;
		
		a += 5;
		b -= 10;
		c *= 2; 
		d /= 2;
		e %= 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 対象変数から「1を足す」or「1を引く」場合に限り、さらに省略して書くことができる
		a = 9;
		b = 11;
		
		a++;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		// 小数を使った計算
		double c2 = 2.5;
		double d2 = 1.6;
		double e2 = 3.1;
		double f2 = 1.3;
		
		double doubleSum = c2 + d2;
		double doubleDifference = e2 - f2;
		
		System.out.println(doubleSum);
		System.out.println(doubleDifference);
		
		// データ型が異なる値同士の計算
		int intNumber = 3;
		double doubleNumber = 1.5;
		
		System.out.println(intNumber * doubleNumber);
		
		// キャスト(拡大変換と縮小変換)
		double x2 = 5.0;
		int y2 = 10;
		
		System.out.println(x2 + y2);
		System.out.println((int)x2 + y2);
		
		int x3 =5;
		String y3 = "10";
		
		int intY3 = Integer.parseInt(y3);
		
		System.out.println(x3 + intY3);
		
		// 5-比較演算子と論理演算子
		// 1. 比較演算
		// 等しいかどうか(==)
		int x4 = 5;
		int y4 = 10;
		int z4 = 5;
		
		boolean isEqualA = (x4 == y4);
		boolean isEqualB = (x4 == z4);
		
		System.out.println(isEqualA);
		System.out.println(isEqualB);
		System.out.println();
		
		// 等しくないかどうか(!=)
		boolean isNotEqualA = (x4 != y4);
		boolean isNotEqualB = (x4 != z4);
		
		System.out.println(isNotEqualA);
		System.out.println(isNotEqualB);
		System.out.println();
		
		// 大なり(>)
		boolean isGreaterA = (x4 > y4);
		boolean isGreaterB = (y4 > x4);
		boolean isGreaterC = (x4 > z4);
		
		System.out.println(isGreaterA); // false
		System.out.println(isGreaterB); // true
		System.out.println(isGreaterC); // false
		System.out.println();
		
		// 小なり(<)
		boolean isLessA = (x4 < y4);
		boolean isLessB = (y4 < x4);
		boolean isLessC = (x4 < z4);
		
		System.out.println(isLessA); // true
		System.out.println(isLessB); // false
		System.out.println(isLessC); // false
		System.out.println();
		
		// 大なりまたは等しい(>=)
		boolean isGreaterOrEqualA = (x4 >= y4);
		boolean isGreaterOrEqualB = (y4 >= x4);
		boolean isGreaterOrEqualC = (x4 >= z4);
		
		System.out.println(isGreaterOrEqualA); // false
		System.out.println(isGreaterOrEqualB); // true
		System.out.println(isGreaterOrEqualC); // true
		System.out.println();
		
		// 小なりまたは等しい(<=)
		boolean isLessOrEqualA = (x4 <= y4);
		boolean isLessOrEqualB = (y4 <= x4);
		boolean isLessOrEqualC = (x4 <= z4);
		
		System.out.println(isLessOrEqualA); // true
		System.out.println(isLessOrEqualB); // false
		System.out.println(isLessOrEqualC); // true
		System.out.println();
		
		// 2. 論理演算子
		// 論理積(&&)
		boolean andResultA = (x4 < 6 && y4 > 9);
		boolean andResultB = (x4 < 6 && y4 < 10);
		
		System.out.println(andResultA); // true
		System.out.println(andResultB); // false
		System.out.println();
		
		// 論理和(||)
		boolean orResultA = (x < 6 || y < 10);
		boolean orResultB = (x < 5 || y < 10);
		
		System.out.println(orResultA); // true
		System.out.println(orResultB); // false
		System.out.println();
		
		// 論理否定(!)
		boolean notResult = !(x == y);
		
		System.out.println(notResult); // true
		System.out.println();
		
		// 6-条件分岐
		// 1. if文
		// ifの使い方
		int number =20;
		
		System.out.println("更新前");
		if (number >= 15) {
			System.out.println("15以上です。");
		}
		
		number = 14;
		
		System.out.println("更新後");
		if (number >= 15) {
			System.out.println("15以上です。");
		}
		
		System.out.println("完了");
		System.out.println();
		
		// elseの使い方
		if (number >= 15) {
			System.out.println("15以上です。");
		} else {
			System.out.println("15未満です。");
		}
		System.out.println("完了");
		System.out.println();
		
		// else ifの使い方
		number = 10;
		if (number >= 20) {
			System.out.println("20以上です。");
		} else if (number >= 15) {
			System.out.println("15以上、10未満です。");
		} else if (number >= 10) {
			System.out.println("10以上、15未満です。");
		} else {
			System.out.println("10未満です。");
		}
		System.out.println("完了");
		System.out.println();
		
		// 2. switch文
		// switch文を使う場合は、caseやdefaultのブロックに必ずbreakを記述すること
		int dayOfWeek = 2; // 火曜日
		
		switch (dayOfWeek) {
		case 1:
			System.out.println("月曜日");
			break;
		case 2:
			System.out.println("火曜日");
			break;
		case 3:
			System.out.println("水曜日");
			break;
		default:
			System.out.println("その他の曜日");
			break;
		}
		
		System.out.println("完了");
		System.out.println();
		
		// 繰り返し処理
		// 1. 繰り返し処理について
		// 繰り返し処理は、同じコードを何度も繰り返し実行するための方法
		// 主要繰り返し処理構造：while文、for文、拡張for文
		
		// 2. while文
		int num = 1;
		
		while(num <= 10) {
			System.out.println(num);
			
			num++;
		}
		System.out.println();
		
		// 3. for文
		for (int num2 = 1; num2 <=10; num2++) {
			System.out.println(num2);
		}
		System.out.println();
		
		// 4. 配列(Array)
		// 配列の宣言と初期化
		// 整数型の配列を宣言して初期化
		// 長さが5の整数型の配列を作成します。格納されている要素の値は全て0です。
		int[] numbers = new int[5];
		
		// 文字列型の配列を宣言して初期化
		String[] fruits = {"りんご", "バナナ", "オレンジ"};
		
		// 配列の要素を操作する
		// 配列の要素へのアクセス
		int[] numbers2 = {10, 20, 30, 40, 50};
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[2]);
		System.out.println();
		
		// 要素を上書きする
		// 異なるデータ型の値を代入するとエラーになる
		System.out.println(fruits[1]); // バナナ
		
		fruits[1] = "ぶどう";
		
		System.out.println(fruits[1]);
		System.out.println();
		
		// 配列の長さを確認する
		System.out.println(fruits.length);
		System.out.println();
		
		// 要素を追加&削除する
		// 配列は固定サイズなので、要素の追加や削除が難しい
		// 配列の代わりに、固定サイズではないArrayListというものがある
		
		// 5. 拡張for文
		// 拡張for文は、配列などのデータ構造の要素を順番に取り出すためのシンプルな方法
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		System.out.println();
		
		// 6. 繰り返し処理のbreakとcontinue
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int number3: numbers3) {
			if (number3 % 3 == 0) {
				System.out.println("アホになって" + number3 + "と言う");
				// break;
				continue;
			}
			
			System.out.println("普通に" + number3 + "と言う");
		}
		
		System.out.println();
		// 8-メソッド
		// 6,7. メソッドの定義と呼び出される流れ, メソッドの再利用
		hello();
		hello();
		hello();
		System.out.println();
		
		// 8. 引数
		String[] countryCodes = {"JP", "US", "UK"};
		
		int number2 = 1;
		for (String code: countryCodes) {
			hello2(code, number2);
			
			number2++;
		}
		System.out.println();
		
		// 9. 戻り値
		int result = sumNumbers(3, 4);
		
		System.out.println(result);
		System.out.println();
		
		// if文の条件にbooleanの戻り値を返すメソッド
		int targetNum = 2;
		
		if (isEven(targetNum)) {
			System.out.println("偶数です");
		} else {
			System.out.println("奇数です");
		}
		System.out.println();
		
		// 10. オーバーロードについて
		System.out.println(sumNumbers2(1, 2));
		System.out.println(sumNumbers2(1, 2, 3));
		System.out.println(sumNumbers2(2.3, 4.3));
		
	}
	
	public static void hello() {
		System.out.println("Hello Geekation");
	}
	
	public static void hello2(String code, int num) {
		System.out.println("No." + num + ": Hello " + code);
	}
	
	public static int sumNumbers(int num1, int num2) {
		int sum = num1 + num2;
		
		return sum;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static int sumNumbers2(int num1, int num2) {
		int sum = num1 + num2;
		
		return sum;
	}
	
	// 引数の個数が異なる場合
	public static int sumNumbers2(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		
		return sum;
	}
	
	// 引数のデータ型が異なる場合
	public static int sumNumbers2(double num1, double num2) {
		double sum = num1 + num2;
		
		return (int)sum;
	}
}
