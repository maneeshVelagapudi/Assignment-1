import java.util.Scanner;

public class Sample {
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
	public static void main(String[] args) {
		int n = 0, k = 0;
		
		while(n <= 2 || n >= 12) {
			System.out.print("Enter integer n such that 2<n<12:");
			n = STDIN_SCANNER.nextInt();
		}
		while(k <= 10) {
			System.out.print("Enter upper limit k for x and y (k > 10): ");
			k = STDIN_SCANNER.nextInt();
		}
		int value = Integer.MAX_VALUE;
		double relativValue = Integer.MAX_VALUE;
		for(int x = 10; x <= k; x++) {
			for(int y = 10; y <= k; y++) {
				long lhs = (int)(Math.pow(x, n) + Math.pow(y, n));
				if(lhs < 0) {
					System.out.print("ERROR!! Choose lower values of n and k");
					return;
				}
				int z = (int)Math.pow(lhs, 1.0 / n);
				int diff = (int)(lhs - Math.pow(z, n));
				if(Math.pow(z + 1, n) - lhs < diff) {
					diff = (int)(Math.pow(z + 1, n) - lhs);
					z++;
				}
				double relDiff = 100. * diff / lhs;
				if(relDiff < relativValue) {
					value = diff;
					relativValue = relDiff;
					System.out.printf("x = %d, y = %d, z = %d, value = %d, relative value = %.6f%%\n", x, y, z, diff, relDiff);
				}
			}
		}
	}

	
}