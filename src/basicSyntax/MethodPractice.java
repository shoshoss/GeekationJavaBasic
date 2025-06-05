package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		// 1の実装
		int a = 20;
		int b = 15;
		
		int sum1 = addition(a, b);
		int sum2 = subtraction(a, b);
		int sum3 = multiplication(a, b);
		int sum4 = division(a, b);
		
		sumResult(sum1);
		sumResult(sum2);
		sumResult(sum3);
		sumResult(sum4);
	}
	// メソッド1: 二つの値を足し算するメソッド
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	// メソッド2: 二つの値を引き算するメソッド
	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	//メソッド3: 二つの値を掛け算するメソッド
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	// メソッド4: 二つの値を割り算するメソッド
	public static int division(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0で割ることはできません。");
			return 0;
		}
		return num1 / num2;
	}

	// メソッド5: コンソールに出力するためのメソッド
	public static void sumResult(int sum) {
		System.out.println("計算結果は" + sum + "です。");
	}
}
