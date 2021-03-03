package Models;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String prefferedLanguage;
    private LinkedHashMap<String, String> countriesList;
    private List<String> languageList;



    public Student() {
        addCountries();
        addLanguagesToList();
    }

    private void addCountries() {
        countriesList = new LinkedHashMap<>();
        countriesList.put("RO", "Romania");
        countriesList.put("DK", "Denmark");
        countriesList.put("FR", "France");
        countriesList.put("US", "United States");
        countriesList.put("IT", "Italy");
    }

    private void addLanguagesToList() {
        languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("C#");
        languageList.add("Swift");
        languageList.add("Python");
    }


    public String getPrefferedLanguage() {
        return prefferedLanguage;
    }

    public void setPrefferedLanguage(String prefferedLanguage) {
        int selectedLanguage = languageList.indexOf(prefferedLanguage);
        this.prefferedLanguage = languageList.get(selectedLanguage);
    }

    public List<String> getLanguageList() {
        return languageList;
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
