package Models;

import org.springframework.beans.factory.annotation.Value;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countriesList;


    public Student() {
        addCountries();
    }

    private void addCountries() {
        countriesList = new LinkedHashMap<>();
        countriesList.put("RO", "Romania");
        countriesList.put("DK", "Denmark");
        countriesList.put("FR", "France");
        countriesList.put("US", "United States");
        countriesList.put("IT", "Italy");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = countriesList.get(country);
    }

    public LinkedHashMap<String, String> getCountriesList() {
        return countriesList;
    }
}
