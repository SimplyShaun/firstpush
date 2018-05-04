import java.util.Scanner;

public class substringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);

		// 1st attempt
		for (int i = 0; i < s.length() - k; i++) {
			if (s.substring(i + 1, i + k + 1).compareTo(smallest) < 0) {
				smallest = s.substring(i + 1, i + k + 1);
			}
			if (s.substring(i + 1, i + k + 1).compareTo(largest) > 0) {
				largest = s.substring(i + 1, i + k + 1);
			}

		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));

	}

}
