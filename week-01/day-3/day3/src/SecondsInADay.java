public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secondsInADay = 24 * 60 * 60;
        int currentSecondsSinceMidnight = (currentHours * 60 * 60) + (currentMinutes * 60) + currentSeconds;
        int remainingSeconds = secondsInADay - currentSecondsSinceMidnight;

        System.out.println(remainingSeconds);
    }
}

