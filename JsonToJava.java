import java.util.Map;

public class JsonToJava {
    private Map<String, Object> location;
    private Map<String, Object> current;
    private Map<String, Object> forecast;

    // Getters and setters for location, current, and forecast

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public Map<String, Object> getCurrent() {
        return current;
    }

    public void setCurrent(Map<String, Object> current) {
        this.current = current;
    }

    public Map<String, Object> getForecast() {
        return forecast;
    }

    public void setForecast(Map<String, Object> forecast) {
        this.forecast = forecast;
    }
}

