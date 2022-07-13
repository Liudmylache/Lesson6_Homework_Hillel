package cats;

import static cats.Logic.*;

public class Main {
    public static void main(String[] args){

        System.out.println(createAListOfCats());
        changeAddress("Odessa");
        System.out.println(catList);
    }
}