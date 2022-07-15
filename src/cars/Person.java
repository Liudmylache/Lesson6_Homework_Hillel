package cars;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final int yearOfBirth;
    private final boolean hasDriversLicense;
    private final LocalDate dateOfTheLastFine;

    public Person(String name, int yearOfBirth, boolean hasDriversLicense, LocalDate dateOfTheLastFine) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.hasDriversLicense = hasDriversLicense;
        this.dateOfTheLastFine = dateOfTheLastFine;
    }

    public LocalDate getDateOfTheLastFine() {
        return dateOfTheLastFine;
    }

    public String printIfHasID(){
        if (hasDriversLicense){
            return " Has a drivers license. ";
        } return " Doesn't have a drivers license. ";
    }

    public String printIfNoFine(){
        if (dateOfTheLastFine == null){
            return "So there are no penalties";
        } return "Date of the last fine: " + dateOfTheLastFine;
    }

    @Override
    public String toString() {
        return "Person {" +
                "Name: " + name + '\'' +
                ", Year of birth: " + yearOfBirth +
                printIfHasID()  + printIfNoFine() + '\n' +
                '}';
    }
}
