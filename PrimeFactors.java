import java.util.Scanner;
import java.util.ArrayList;

public class PrimeFactors {
	public static void main(String[] args) {
		int n;
		ArrayList<Integer> primeFactors;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number - ");
		n = scanner.nextInt();
		primeFactors = generate(n);
		for(int i = 0; i < primeFactors.size(); i++) {
			if(i == primeFactors.size() - 1) {
				System.out.println(primeFactors.get(i) + ".");
			} else {
				System.out.print(primeFactors.get(i) + ", ");
			}
		}
	}

	public static ArrayList<Integer> generate(int n) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0 && isPrime(i)) {
				ret.add(i);
			}
		}
		return ret;
	}

	private static boolean isPrime(int n) {
		int limit = (int)Math.sqrt(n);
		boolean ret = true;
		for(int i = 2; i <= limit; i++) {
			if(n % i == 0) {
				ret = false;
				break;
			}
		}	
		return ret;
	}
}
