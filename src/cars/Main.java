package cars;

import static cars.Logic.*;

public class Main {
    public static void main(String[] args){
        createAListOfPersons(20);
        System.out.println(personList);
        System.out.println(getListOfApprovedPeople(personList));
    }
}
