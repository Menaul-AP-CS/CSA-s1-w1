public class Main {
    public static void main(String[] args) {
        // Create a new alarm clock starting at 07:58 with alarm at 08:00
        AlarmClock myClock = new AlarmClock("07:58", "08:00");

        // Tick a few times and watch the alarm go off
        for (int i = 0; i < 5; i++) {
            System.out.println("Current time: " + myClock.getClockTime());
            myClock.tick();
        }
    }
}
