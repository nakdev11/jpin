package kadai201211.ex08;

public class SalesResult {

	public static void main(String[] args) {

		if (args.length != 4) {
			System.out.println("** 実行方法 **");
			System.out.println("java SalesResult <日付> <東京の売上> <大阪の売上> <名古屋の売上>");
			return;
		}

		String formatDate = args[0];

		int[] records = new int[3];
		records[0] = Integer.parseInt(args[1]);
		records[1] = Integer.parseInt(args[2]);
		records[2] = Integer.parseInt(args[3]);

		int total = 0;
		for (int i = 0; i < records.length; i++) {
			System.out.println("[" + i + "] total => " + total);
			total += records[i];
		}

		double average = getAverage(total, records.length);

		System.out.println("*** " + formatDate + " ***");
		System.out.println("合計： " + total);
		System.out.println("平均： " + average);
		System.out.println("最高： " + getMaxValue(records[0], records[1], records[2]));
		System.out.println("最小： " + getMinValue(records[0], records[1], records[2]));

	}

	static double getAverage(int total, double divisor) {
		return total / divisor;
	}

	static int getMaxValue(int tempo1, int tempo2, int tempo3) {
		if (tempo1 <= tempo2) {
			if (tempo2 <= tempo3) {
				return tempo3;
			} else {
				return tempo2;
			}
		} else {
			if (tempo1 >= tempo3) {
				return tempo1;
			} else {
				return tempo3;
			}
		}
	}

	static int getMinValue(int tempo1, int tempo2, int tempo3) {
		if (tempo1 <= tempo2) {
			if (tempo1 <= tempo3) {
				return tempo1;
			} else {
				return tempo3;
			}
		} else {
			if (tempo2 <= tempo3) {
				return tempo2;
			} else {
				return tempo3;
			}
		}
	}
}
