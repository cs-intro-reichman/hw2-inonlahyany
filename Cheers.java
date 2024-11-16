// Prints a crowd cheering output.

public class Cheers {
        public static void main(String[] args) {
            String inputOfCheer = args[0];
            int timesToCheer = Integer.parseInt(args[1]);
            String lettersToMatch = "AaEeFfHhIiLlMmNnOoRrSsXx";
	    for (int i = 0; i < inputOfCheer.length(); i++) {
                char inputInUpperCase = inputOfCheer.charAt(i);
                Character.toUpperCase(inputInUpperCase);
                if (lettersToMatch.indexOf(inputOfCheer.charAt(i))>=0) {
                    System.out.println("Give me an " + inputInUpperCase + ": " + inputInUpperCase + "!");
                } else {
                    System.out.println("Give me a  " + inputInUpperCase + ": " + inputInUpperCase + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < timesToCheer; i++) {
                System.out.println("" + inputOfCheer.toUpperCase() + "!!!");
            }
        }
}
