public class AlarmClock {
    private String clockTime; // Format: "HH:MM"
    private String alarmTime; // Format: "HH:MM"

    // Constructor
    public AlarmClock(String clockTime, String alarmTime) {
        this.clockTime = clockTime;
        this.alarmTime = alarmTime;
    }

    // Method to set the clock time
    public void setClockTime(String time) {
        this.clockTime = time;
    }

    // Method to set the alarm time
    public void setAlarmTime(String time) {
        this.alarmTime = time;
    }

    // Method to simulate ticking forward by one minute
    public void tick() {
        String[] parts = clockTime.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        minute++;
        if (minute >= 60) {
            minute = 0;
            hour++;
            if (hour >= 24) {
                hour = 0;
            }
        }

        // Format with leading zeros
        clockTime = String.format("%02d:%02d", hour, minute);

        // Check if it's time to alarm
        if (clockTime.equals(alarmTime)) {
            soundAlarm();
        }
    }

    // Method to sound the alarm
    public void soundAlarm() {
        System.out.println("Beep! Beep! Beep! Time is " + clockTime);
    }

    // Method to get current time
    public String getClockTime() {
        return clockTime;
    }

    // Method to get alarm time
    public String getAlarmTime() {
        return alarmTime;
    }
}
