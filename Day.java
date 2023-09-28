import java.text.SimpleDateFormat;
import java.util.Date;

public class Day {
    //Initialize all day variables and constructor
    private Double maxTempF;
    private Double minTempF;
    private Double avgTempF;
    private Double totalPrecipIn;
    private Double totalSnowCm;
    private Integer dailyWillItRain;
    private Integer dailyChanceOfRain;
    private Integer dailyWillItSnow;
    private Integer dailyChanceOfSnow;
    private String date;
    private String dayOfWeek;



    public Day() {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
    }


    //Get and setters for all variables
    public Double getMaxTempF() {
        return maxTempF;
    }

    public void setMaxTempF(Double maxTempF) {
        this.maxTempF = maxTempF;
    }

    public Double getMinTempF() {
        return minTempF;
    }

    public void setMinTempF(Double minTempF) {
        this.minTempF = minTempF;
    }

    public Double getAvgTempF() {
        return avgTempF;
    }

    public void setAvgTempF(Double avgTempF) {
        this.avgTempF = avgTempF;
    }

    public Double getTotalPrecipIn() {
        return totalPrecipIn;
    }

    public void setTotalPrecipIn(Double totalPrecipIn) {
        this.totalPrecipIn = totalPrecipIn;
    }

    public Double getTotalSnowCm() {
        return totalSnowCm;
    }

    public void setTotalSnowCm(Double totalSnowCm) {
        this.totalSnowCm = totalSnowCm;
    }

    public Integer getDailyWillItRain() {
        return dailyWillItRain;
    }

    public void setDailyWillItRain(Integer dailyWillItRain) {
        this.dailyWillItRain = dailyWillItRain;
    }

    public Integer getDailyChanceOfRain() {
        return dailyChanceOfRain;
    }

    public void setDailyChanceOfRain(Integer dailyChanceOfRain) {
        this.dailyChanceOfRain = dailyChanceOfRain;
    }

    public Integer getDailyWillItSnow() {
        return dailyWillItSnow;
    }

    public void setDailyWillItSnow(Integer dailyWillItSnow) {
        this.dailyWillItSnow = dailyWillItSnow;
    }

    public Integer getDailyChanceOfSnow() {
        return dailyChanceOfSnow;
    }

    public void setDailyChanceOfSnow(Integer dailyChanceOfSnow) {
        this.dailyChanceOfSnow = dailyChanceOfSnow;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        // Set the dayOfWeek when the date is set
        this.dayOfWeek = calculateDayOfWeek(date);
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }
    //Caculates day of the week based off of the date given
    private String calculateDayOfWeek(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date parsedDate = dateFormat.parse(date);
            SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
            return dayFormat.format(parsedDate);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    //String display for if object displayed
    @Override
    public String toString() {
        return "Day{" +
                "maxTempF=" + maxTempF +
                ", minTempF=" + minTempF +
                ", avgTempF=" + avgTempF +
                ", totalPrecipIn=" + totalPrecipIn +
                ", totalSnowCm=" + totalSnowCm +
                ", dailyWillItRain=" + dailyWillItRain +
                ", dailyChanceOfRain=" + dailyChanceOfRain +
                ", dailyWillItSnow=" + dailyWillItSnow +
                ", dailyChanceOfSnow=" + dailyChanceOfSnow +
                ", date=" + date +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}