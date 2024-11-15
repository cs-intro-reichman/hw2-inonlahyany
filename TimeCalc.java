public class TimeCalc {
    public static void main(String[] args) {
		int hoursByUser = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutesByUser = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutes = hoursByUser*60 + minutesByUser + minutesToAdd;
        System.out.println(totalMinutes);
        int hoursToDisplay = totalMinutes / 60;
        int minutesToDisplay = totalMinutes % 60;
        if (hoursToDisplay >= 24) {
            hoursToDisplay=hoursToDisplay % 24;
        } 
        if (hoursToDisplay > 10) {
            if (minutesToDisplay > 10) {
                System.out.println("" + hoursToDisplay + ":" + minutesToDisplay);
            } else {
                System.out.println("" + hoursToDisplay + ":0" + minutesToDisplay);
            }
        } else {
            if (minutesToDisplay > 10) {
                System.out.println("0" + hoursToDisplay + ":" + minutesToDisplay);
            } else {
                System.out.println("0" + hoursToDisplay + ":0" + minutesToDisplay);
            }
        }
    }
}
