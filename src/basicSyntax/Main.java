package basicSyntax;

public class Main {

	public static void main(String[] args) {
		// クラス演習
		int num1 = 10;
		int num2 = 5;
		
		int addUpResult = Calculation2.addUp(num1, num2);
		int subtractResult = Calculation2.subtract(num1, num2);
		int multiplyResult = Calculation2.multiply(num1, num2);
		int divideResult = Calculation2.divide(num1, num2);
		
		System.out.println("足し算の計算結果は" + addUpResult + "です。");
		System.out.println("引き算の計算結果は" + subtractResult + "です。");
		System.out.println("掛け算の計算結果は" + multiplyResult + "です。");
		System.out.println("割り算の計算結果は" + divideResult + "です。");
		System.out.println();
		
		// 実装
		GeekIntroduction.greeting(15, 150);
		GeekIntroduction.specialSkill(2,30);
	}
}
