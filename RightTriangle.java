import java.util.Scanner;

public class RightTriangle {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of \'n\' - ");
		n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
