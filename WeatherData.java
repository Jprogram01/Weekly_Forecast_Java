import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.net.http.HttpResponse.BodyHandlers;


public class WeatherData {
    //Initialize city string
    private String city;
    public WeatherData (String city) {
        this.city = city;
        
    }
    //Make a API GET request to the weatherapi API. Make a request for then next 7 days. Catch possible errors and return response
    public String forecastRequest () {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(new URI(String.format("http://api.weatherapi.com/v1/forecast.json?key=92c7218d414f4071a6170521232109&q=%s%s%s", city, "&days=7", "&aqi=no")))
            .GET()
            .build();
            
            HttpResponse<String> response;
            try {
                response = client.send(request, BodyHandlers.ofString());
                return (response.body());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    //Make a API GET request to the weatherapi API. Only make a request for the current day. Catch possible errors and return response.
    public String currentRequest () {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(new URI(String.format("http://api.weatherapi.com/v1/current.json?key=92c7218d414f4071a6170521232109&q=%s,%s", city, "&aqi=no")))
            .GET()
            .build();
            
            HttpResponse<String> response;
            try {
                response = client.send(request, BodyHandlers.ofString());
                return (response.body());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }                
    
}
