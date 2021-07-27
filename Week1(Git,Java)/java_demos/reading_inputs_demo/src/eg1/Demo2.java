package eg1;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int ar[] = new int[n];

		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}

		System.out.println("Contents of array is ");
		System.out.println(Arrays.toString(ar));

	}

}
