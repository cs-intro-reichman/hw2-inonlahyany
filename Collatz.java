// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seedNumByUser = Integer.parseInt(args[0]), numberOfSteps, currentNumber, numberIsOne;
		String modeOfVerbosity = args[1];
		for (int i = 1; i < seedNumByUser+1; i++) {
			currentNumber = i;
			numberOfSteps = 1;
			numberIsOne = 0;
			while (numberIsOne!=1) {
				if (modeOfVerbosity.equals("v")) {
					System.out.print(" " + currentNumber);
				}
				if (currentNumber % 2 == 0) {
					currentNumber = currentNumber/2;
				} else { 
					currentNumber = currentNumber*3 + 1;
				}
				numberOfSteps++;
				numberIsOne = (currentNumber == 1 ? 1 : numberIsOne);
			}
			if (modeOfVerbosity.equals("v")) {
				System.out.println(" " + currentNumber + " (" + numberOfSteps + ")");
			}
		}
		System.out.println("Every one of the first " + seedNumByUser +" hailstone sequences reached 1.");
	}
}
