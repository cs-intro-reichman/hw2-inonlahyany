// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numbeOfTerms = Integer.parseInt(args[0]);
		double ourPI = 0;
		double oddNumberInTurn = 1;
		for (int i = 0; i < numbeOfTerms; i ++) {
			if ( i % 2 == 1 ) {
				ourPI -= (1/oddNumberInTurn);
			} else {
				ourPI += (1/oddNumberInTurn);
			}
			oddNumberInTurn += 2;
		}
		ourPI = (ourPI * 4);
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + ourPI);
	}
}
















