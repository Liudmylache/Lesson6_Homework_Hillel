package cats;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static cats.DataBase.*;
public class Logic {

    static List <Cats> catList = new ArrayList<>();

    public static String getRandomName() {
        return getRandomItem(listOfNames);
    }

    public static String getRandomAddress() {
        return getRandomItem(listOfAddresses);
    }

    public static String getRandomOwnerName() {
        return getRandomItem(listOfOwnerNames);
    }

   public static String getRandomItem(String[] list ){
       Random random = new Random();
       int rand = random.nextInt(list.length);
       String newItem = list[rand];
       return newItem;
   }

/*
I use Id range from 700000 to 799999,
so diff - 99999;
 */
   public static String getRandomPassportId(){
       int diff = 99999;
       Random random = new Random();
       int i = random.nextInt(diff + 1);
       i += 700000;
       return "KM" + i;
   }

   public static Cats createRandomCat(){
       Cats cat = new Cats(getRandomName(),getRandomAddress(),getRandomOwnerName(),getRandomPassportId());
       return cat;
   }

   public static List<Cats> createAListOfCats(){
           for(int i = 0; i < 10; i++){
               catList.add(createRandomCat());
           } return catList;
       }
   public static List<Cats> changeAddress(String newAddress){
       for (Cats cats: catList){
           if (!cats.getAddress().equals(newAddress)){
               cats.setAddress(newAddress);
           } continue;
       }
       return catList;
   }
}
