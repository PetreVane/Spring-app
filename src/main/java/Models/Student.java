package Models;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    // country
    private String country;
    private LinkedHashMap<String, String> countriesList;
    // programming language
    private String preferredLanguage;
    private List<String> languageList;
    // operating systems
    private List<String> preferredOperatingSystem;
    private List<String> listOfOperatingSystems;



    public Student() {
        addCountries();
        addLanguagesToList();
        addOpToList();
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
        languageList.add("PHP");
    }

    private void addOpToList() {
        listOfOperatingSystems = new ArrayList<>();
        listOfOperatingSystems.add("Linux");
        listOfOperatingSystems.add("Microsoft");
        listOfOperatingSystems.add("MacOS");
    }

    public List<String> getPreferredOperatingSystem() {
        return preferredOperatingSystem;
    }

    public List<String> getListOfOperatingSystems() {
        return listOfOperatingSystems;
    }

    public void setPreferredOperatingSystem(List<String> preferredOperatingSystem) {
        this.preferredOperatingSystem = preferredOperatingSystem;
    }

    public String getPrefferedLanguage() {
        return preferredLanguage;
    }

    public void setPrefferedLanguage(String preferredLanguage) {
        int selectedLanguage = languageList.indexOf(preferredLanguage);
        this.preferredLanguage = languageList.get(selectedLanguage);
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
