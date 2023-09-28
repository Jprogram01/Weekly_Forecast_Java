import java.io.Console;

public class Main {
    public static void main(String[] args) {
      // Allow the console to be used, and then allow the user to enter which city they want data for via the console.
      Console console = System.console();
      String City = console.readLine("Enter the city you want weather data for: ");
      //Create a new WeatherData object, which is where the api request are made.
      WeatherData WeatherData = new WeatherData(City);
      //Create a new DataOrganization object.
      DataOrganization DataOrganization = new DataOrganization();
      //Use the forecastRequest method to get information from the API
      String Forecast = WeatherData.forecastRequest();
      // Use the returnData method parse the JSON data and organize it.
      var ForecastObject = DataOrganization.returnData(Forecast);
      //Create a week object out of the organized JSOn data.
      Week Week = WeekDataSetup.createWeek(ForecastObject); 
      //Make a new WeekDisplay object
      WeekDisplay WeekDisplay = new WeekDisplay(Week);
      //Use the displayAllInfo method to display all the information for the next 7 days.
      WeekDisplay.displayAllInfo();
      }
}
