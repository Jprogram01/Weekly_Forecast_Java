import java.util.List;

public class WeekDisplay {
    //Initialize Week object
    private Week week;

    public WeekDisplay(Week week) {
        this.week = week;
    }
    //Method to display max temp
    public void displayMaxTemp(List<Day> week) {
        for (Day day : week) {
            System.out.println("Max Temp for " + day.getDayOfWeek() + ": " + day.getMaxTempF() + "°F");
        }
    }
    //Method to display min temp
    public void displayMinTemp(List<Day> week) {
        for (Day day : week) {
            System.out.println("Min Temp for " + day.getDayOfWeek() + ": " + day.getMinTempF() + "°F");
        }
    }
    //Method to display avg temp
    public void displayAvgTemp(List<Day> week) {
        for (Day day : week) {
            System.out.println("Avg Temp for " + day.getDayOfWeek() + ": " + day.getAvgTempF() + "°F");
        }
    }
    //Method to total precip
    public void displayTotalPrecip(List<Day> week) {
        for (Day day : week) {
            System.out.println("Total Precip for " + day.getDayOfWeek() + ": " + day.getTotalPrecipIn() + " inches");
        }
    }
    //Method to display total snow
    public void displayTotalSnow(List<Day> week) {
        for (Day day : week) {
            System.out.println("Total Snow for " + day.getDayOfWeek() + ": " + day.getTotalSnowCm() + " cm");
        }
    }
    //Method to display rain boolean
    public void displayWillItRain(List<Day> week) {
        for (Day day : week) {
            String willItRain = day.getDailyWillItRain() == 1 ? "Yes" : "No";
            System.out.println("Will It Rain for " + day.getDayOfWeek() + ": " + willItRain);
        }
    }
    //Method to display chance of rain
    public void displayChanceOfRain(List<Day> week) {
        for (Day day : week) {
            System.out.println("Chance of Rain for " + day.getDayOfWeek() + ": " + day.getDailyChanceOfRain() + "%");
        }
    }
    //Method to display Snow boolean
    public void displayWillItSnow(List<Day> week) {
        for (Day day : week) {
            String willItSnow = day.getDailyWillItSnow() == 1 ? "Yes" : "No";
            System.out.println("Will It Snow for " + day.getDayOfWeek() + ": " + willItSnow);
        }
    }
    //Method to display Chance of snow
    public void displayChanceOfSnow(List<Day> week) {
        for (Day day : week) {
            System.out.println("Chance of Snow for " + day.getDayOfWeek() + ": " + day.getDailyChanceOfSnow() + "%");
        }
    }
    //Method to display all infor for each day of the week
    public void displayAllInfo() {
        List<Day> days = week.getDays();
        for (Day day : days) {
            System.out.println("Day: " + day.getDayOfWeek());
            System.out.println("Max Temp: " + day.getMaxTempF() + "°F");
            System.out.println("Min Temp: " + day.getMinTempF() + "°F");
            System.out.println("Avg Temp: " + day.getAvgTempF() + "°F");
            if (day.getMaxTempF() >= 90) {
                System.out.println("Drink lot's of water! It'll be warm today");
            }
            else if (day.getMaxTempF() >= 70) {
                System.out.println("It's a nice day today!");
            }
            else if (day.getMaxTempF() >= 50) {
                System.out.println("A little bit more chilly, put on something warmer!");
            }
            else if (day.getMaxTempF() <= 32) {
                System.out.println("It's below freezing! Watch out for snow and intense cold.");
            }
            System.out.println("Total Precip: " + day.getTotalPrecipIn() + " inches");
            System.out.println("Total Snow: " + day.getTotalSnowCm() + " cm");
            String willItRain = day.getDailyWillItRain() == 1 ? "Yes" : "No";
            System.out.println("Will It Rain: " + willItRain);
            if (willItRain == "Yes") {
                System.out.println("Watch out, it'll be raining today! Expect " + day.getTotalPrecipIn() + "inches of rain" );
            }
            System.out.println("Chance of Rain: " + day.getDailyChanceOfRain() + "%");
            String willItSnow = day.getDailyWillItSnow() == 1 ? "Yes" : "No";
            System.out.println("Will It Snow: " + willItSnow);
            if (willItSnow == "Yes") {
                System.out.println("Watch out, it'll be snowing today! Expect " + day.getTotalSnowCm() + "cm's of snow" );
            }
            System.out.println("Chance of Snow: " + day.getDailyChanceOfSnow() + "%");
            System.out.println();
        }
    }
}
