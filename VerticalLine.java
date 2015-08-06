import java.util.Scanner;

public class VerticalLine {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of \'n\' - ");
		n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}	
}
