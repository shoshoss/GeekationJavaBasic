package basicSyntax;

public class GeekIntroduction {
	// 挨拶メソッド
	public static void greeting(int age, double height) {
		System.out.println("こんにちは! 私はGeek君でごわす。");
		System.out.println("年は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}
	
	// 特技メソッド
	public static void specialSkill(int num1, int num2) {
		if (num1 < 1 || num2 < 1) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}
		if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}
		if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}

		for (int num = num1; num <= num2; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + "は3の倍数かつ5の倍数です。");
			} else if (num % 3 == 0) {
				System.out.println(num + "は3の倍数です。");
			} else if (num % 5 == 0) {
				System.out.println(num + "は5の倍数です。");
			} else {
				System.out.println(num);
			}
		}
	}
}
