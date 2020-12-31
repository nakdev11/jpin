package kadai1211.ex07;

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

	}

	static double getAverage(int total, double divisor) {
		return total / divisor;
	}
}
