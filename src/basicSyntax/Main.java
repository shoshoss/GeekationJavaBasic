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
		
	}

}
