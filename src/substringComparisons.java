import java.util.Scanner;

public class substringComparisons {
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		// 1st attempt
		for (int i = 0; i < s.length() - k; i++) {
			if (s.substring(i, i + k).compareTo(s.substring(i + 1, i + k + 1)) < 0) {
				System.out.println(i + " " + s.substring(i, i + k) + " " + s.substring(i + 1, i + k + 1));
				smallest = s.substring(i, i + k);
				System.out.println(i + ": s " + smallest);
			} else {
				System.out.println(i + " " + s.substring(i, i + k) + " " + s.substring(i + 1, i + k + 1));
				largest = s.substring(i, i + k);
				System.out.println(i + ": l " + largest);
			}
		}
		
		System.out.println();

		// 2nd attempt
		String temp = s.substring(0, k);
		for (int i = 0; i < s.length() - k; i++) {
			if (temp.compareTo(s.substring(i + 1, i + k + 1)) < 0) {
				System.out.println(i + " " + temp + " " + s.substring(i + 1, i + k + 1));
				smallest = temp;
				System.out.println(i + ": s " + smallest);
			} else {
				System.out.println(i + " " + temp + " " + s.substring(i + 1, i + k + 1));
				largest = temp;
				System.out.println(i + ": l " + largest);
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
