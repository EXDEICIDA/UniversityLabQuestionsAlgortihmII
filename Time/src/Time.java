public class Time
{
  /*
  2- Define a Time class with:
	Two attributes: hour and minute.
	One constructor method which receives a string input in 24-hour format
hour:minute such as 14:50
	Get / Set methods
	Display method     (in 24-hour format)
	Convert method that converts a time stamp from 24-hour format to 12-hour format

Write a main method that
-	creates a time object 14:50
-	calls convert() method to produce the following output format:   2:50 p.m.

-	creates another time object 01:40
-	calls convert() method to produce the following output format:   1:40 a.m.

   */

    private int hour;
    private int minute;

    // A consturctor that takes string in HH:MM
    public Time (String time)
    {
        String [] parts = time.split(":");
        this.hour = Integer.parseInt(parts[0]);
        this.minute = Integer.parseInt(parts[1]);
    }

    //setters and getters
    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        if (hour>=0 && (hour<24)){
            this.hour = hour;
        }else
        {
            throw new IllegalArgumentException("Hour must be between 0 and 23.");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && hour < 60) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 60.");
        }
    }

    // Method to display the time in 24-hour format
    public void display() {
        System.out.println(String.format("%02d:%02d", hour, minute));
    }

    // Method to convert and display time in 12-hour format
    public void convert() {
        String amPm = hour < 12 ? "a.m." : "p.m.";
        int displayHour = hour % 12;
        if (displayHour == 0) displayHour = 12; // Handle midnight and noon
        System.out.println(String.format("%d:%02d %s", displayHour, minute, amPm));
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        Time time1 = new Time("14:50");
        time1.convert();  // Expected output: 2:50 p.m.

        Time time2 = new Time("01:40");
        time2.convert();  // Expected output: 1:40 a.m.
    }
}


