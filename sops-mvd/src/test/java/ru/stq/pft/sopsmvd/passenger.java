package ru.stq.pft.sopsmvd;

public class passenger {
    private final String docSeries;
    private final String docNum;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String year;
    private final String month;
    private final String day;

    public passenger(String docSeries, String docNum, String lastName, String firstName, String middleName, String year, String month, String day) {
        this.docSeries = docSeries;
        this.docNum = docNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public String getDocNum() {
        return docNum;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}
