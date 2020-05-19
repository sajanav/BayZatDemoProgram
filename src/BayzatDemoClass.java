import java.util.InputMismatchException;
import java.util.Scanner;

public class BayzatDemoClass {
	 public static void main(String[] args) {
		    try {
		        System.out.println("Input Number of Balls in a Bag: ");
		        Scanner scanner = new Scanner(System.in);
		        int balls = scanner.nextInt();
		        System.out.println("Total Number of ways to remove balls from the Bag: " + calculate(balls));
		    } catch (InputMismatchException e) {
		        throw new InputMismatchException("Only Numbers are accepted for Input of Balls in a Bag");
		    }
		}

		private static int calculate(int balls) {
		    switch (balls) {
		        case 0:
		            return 0;
		        case 1:
		            return 1;
		        case 2:
		            return 2;
		        default:
		            return calculate(balls - 1) + calculate(balls - 2);
		    }
		}

}
