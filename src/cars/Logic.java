package cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static cars.People.listOfNames;
import static java.time.temporal.ChronoUnit.DAYS;

public class Logic {

    static List <Person> personList = new ArrayList<>();


    public static String getRandomName() {
        return getRandomItem(listOfNames);
    }
    public static String getRandomItem(String[] list ){
        Random random = new Random();
        int rand = random.nextInt(list.length);
        return list[rand];
    }

    /*
I use range from 1965 to 2015,
so diff - 50;
    */

    public static int getRandomYearOfBirth(){
        return ((int)(Math.random() * (50)) + 1965);
    }

    public static LocalDate getRandomDateOfTheLastFine(){
        int year = (int) ((Math.random() *2) + 2020);
        int month = (int) ((Math.random() * 11) + 1);
        int day = (int)(Math.random() * (27)) + 1;
        return LocalDate.of(year, month, day);
    }

    public static boolean getIfHasDriversLicense(){
        int i = (int)(Math.random() * 4) + 1;
        //for (Person)
        return i < 4;
    }

    public static Person createRandomPerson(){
        int randomYearOfBirth = getRandomYearOfBirth();
        boolean hasDriversLicense;
        if (randomYearOfBirth < 2006){
            hasDriversLicense = getIfHasDriversLicense();
        }
        else hasDriversLicense = false;
        LocalDate randomDateOfTheLastFine;

        if (hasDriversLicense){
            randomDateOfTheLastFine = getRandomDateOfTheLastFine();
        }
        else randomDateOfTheLastFine = null;

        return new Person(getRandomName(),randomYearOfBirth,hasDriversLicense,randomDateOfTheLastFine);
    }
/*
int num - number of people we want to create
 */
    public static void createAListOfPersons(int num){
        for(int i = 0; i < num; i++){
            personList.add(createRandomPerson());
        }
    }

    public static List <Person> getListOfApprovedPeople(List <Person> personList) {
        List<Person> listOfApprovedPeople = new ArrayList<>();
       for (Person person: personList){
           LocalDate startDate = person.getDateOfTheLastFine();
           LocalDate endDate = LocalDate.now();

           if (startDate!=null){
               long days = DAYS.between(startDate,endDate);

               if (days > 365){
                   listOfApprovedPeople.add(person);
               }
           }
       }
        return listOfApprovedPeople;
    }
}
