package homework07;

public class TimeDescription {

    private int second;
    private int minutes;
    private int hours;

    public TimeDescription(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.second = seconds;
    }

    public TimeDescription(int seconds) {
        this.second = seconds;
    }

    int getAllSeconds() {
        return second + (minutes * 60) + (hours * 3600);
    }

    public String getHoursMinutesSeconds() {

        int totalSeconds = getAllSeconds();

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) % 60;
        second = totalSeconds % 60;

        return "Hours: " + hours +
                "\nMinutes: " + minutes +
                "\nSeconds: " + second;
    }

    public int compareTo(TimeDescription o) {

        return Integer.compare(this.getAllSeconds(), o.getAllSeconds());
    }

}
