import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			final int MAX_SIZE = 100;

			int n = sc.nextInt();
			if (n <= 0 || n > MAX_SIZE) {
				System.out.println("Enter size between 1 and " + MAX_SIZE + ".");
				return;
			}

			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int largest = arr[0];
			for (int i = 1; i < n; i++) {
				if (arr[i] > largest) {
					largest = arr[i];
				}
			}

			System.out.println(largest);
		}
	}
}
