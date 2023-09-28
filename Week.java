import java.util.ArrayList;
import java.util.List;

public class Week {
    //Initialize the list of Day objects.
    private List<Day> days;

    public Week() {
        days = new ArrayList<>(7); // Initialize the list to hold 7 days
    }
    // Method to get the list of days
    public List<Day> getDays() {
        return days;
    }
    //Method to set the list of days
    public void setDays(List<Day> days) {
        this.days = days;
    }
    //Method to add a day to the list of days
    public void addDay(Day day) {
        if (days.size() < 7) {
            days.add(day);
        } else {
            throw new IllegalStateException("A week can only have 7 days.");
        }
    }
    //String display of Week object.
    @Override
    public String toString() {
        return "Week{" +
                "days=" + days +
                '}';
    }
}