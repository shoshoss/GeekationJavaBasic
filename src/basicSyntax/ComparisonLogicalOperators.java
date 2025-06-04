package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// 1の実装
		int a = 10;
		int b = 5;
		
		boolean isGreaterA = (a > b);
		
		System.out.println(isGreaterA); // false
		
		// 2の実装
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean isNiceWeather = isSunny && isWarm;
		System.out.println(isNiceWeather);
		
		// 3の実装
		int x = 5;
		int y = 10;
		
		boolean result3 = (x >= 0) && (y % 2 == 0);
		System.out.println(result3);
		
		// 4の実装
		boolean hasPermission = false;
		
		boolean result4 = !hasPermission;
		System.out.println(result4);
		
	}

}
