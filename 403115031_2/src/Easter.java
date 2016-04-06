
public class Easter {
	static String calculateEaster(int year) {

		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		int k = year / 100;
		int p = (13 + 8 * k) / 25;// Math.floor(), -2
		int q = k / 4;// Math.floor()
		int M = (15 - p + k - q) % 30;
		int N = (4 + k - q) % 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;

		if (d + e < 10) {
			int month = 3;
			int day = d + e + 22;
			
			//或許把return放在最後比較簡單喔!
			return "In " + year + ", Easter Sunday is: month = " + month + " and day = " + day;
		}

		else {
			int month = 4;
			int day = d + e - 9;

			if (d == 29 && e == 6) {
				day = 19;

				return "In " + year + ", Easter Sunday is: month = " + month + " and day = " + day;
			}

			if (d == 28 && e == 6 && (11 * M + 11) % 30 < 19) {
				day = 18;

				return "In " + year + ", Easter Sunday is: month = " + month + " and day = " + day;
			}
			return "In " + year + ", Easter Sunday is: month = " + month + " and day = " + day;
		}
		
		//return "In " + year + ", Easter Sunday is: month = " + month + " and day = " + day;
	}

}
