import java.util.Scanner;

public class DiamondName {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of \'n\' - ");
		n = scanner.nextInt();
		int asteriskCount = 1;
		for(int i = n; i >= 1; i--) {			
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			if(i == 1) {
				System.out.print("Riju");
			}
			else {
				for(int j = 1; j <= asteriskCount; j++) {
					System.out.print("*");
				}
			}			
			asteriskCount += 2;
			System.out.println();
		}
		asteriskCount -= 4;
		for(int i = 1; i <= n - 1; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= asteriskCount; j++) {
				System.out.print("*");
			}
			asteriskCount -= 2;
			System.out.println();
		}
	}
}
