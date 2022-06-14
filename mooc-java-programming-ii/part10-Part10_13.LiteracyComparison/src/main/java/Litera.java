
import java.util.Comparator;

public class Litera {

    private String country;
    private int year;
    private String sexType;
    private double percent;

    public Litera(String country, int year, String sexType, double percent) {
        this.country = country;
        this.year = year;
        this.sexType = sexType;

        this.percent = percent;
    }


    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public String toString() {
        return this.country + " (" + this.year + "), " + this.sexType + ", " + this.percent;
    }

}
