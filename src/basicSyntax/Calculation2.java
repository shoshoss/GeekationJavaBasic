package basicSyntax;

public class Calculation2 {
	public static void printResult(String type, int result) {
		String typeName = "";
		
		switch (type) {
			case "addUp":
				typeName = "足し算";
				break;
			case "subtract":
				typeName = "引き算";
				break;
			case "multiply":
				typeName = "掛け算";
				break;
			case "divide":
				typeName = "割り算";
				break;
			default:
				System.out.println("計算タイプが不正です。");
				break;
		}
		
		System.out.println(typeName + "の計算結果は" + result + "です。");
	  }
	
	public static int addUp(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1 / num2;
	}
}
