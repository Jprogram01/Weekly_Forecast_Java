import java.util.List;
import java.util.Map;

public class WeekDataSetup {
    public static Week createWeek(JsonToJava jsonData) {
        Week week = new Week();
        //Create map object out of Json data
        Map<String, Object> forecastMap = jsonData.getForecast();
        List<Map<String, Object>> forecastList = (List<Map<String, Object>>) forecastMap.get("forecastday");
        //For each tiem in map, create a new day, and set all required variables.
        for (Map<String, Object> forecastDay : forecastList) {
            Day day = new Day();

            // Extract day-specific data from the forecastDay Map
            Map<String, Object> dayData = (Map<String, Object>) forecastDay.get("day");

            day.setMaxTempF((Double) dayData.get("maxtemp_f"));
            day.setMinTempF((Double) dayData.get("mintemp_f"));
            day.setAvgTempF((Double) dayData.get("avgtemp_f"));
            day.setTotalPrecipIn((Double) dayData.get("totalprecip_in"));
            day.setTotalSnowCm((Double) dayData.get("totalsnow_cm"));
            day.setDailyWillItRain((Integer) dayData.get("daily_will_it_rain"));
            day.setDailyChanceOfRain((Integer) dayData.get("daily_chance_of_rain"));
            day.setDailyWillItSnow((Integer) dayData.get("daily_will_it_snow"));
            day.setDailyChanceOfSnow((Integer) dayData.get("daily_chance_of_snow"));
            day.setDate((String) forecastDay.get("date"));

            // Add the day to the week
            week.addDay(day);
        }
        //return completed week
        return week;
    }
}