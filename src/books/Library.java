package books;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library {
    Set<Books> kingBooks = new HashSet<>();
    Set<Books> rowlingBooks = new HashSet<>();
    Set<Books> brownBooks = new HashSet<>();
    HashMap<String,Set<Books>> library = new HashMap<>();

     public Set<Books> getListOfKingBooks(){
         kingBooks.add(new Books("The Green Mile    ", 1996, "Stephen King"));
         kingBooks.add(new Books("Bag of Bones      ", 1999,"Stephen King"));
         kingBooks.add(new Books("Black House       ", 2003,"Stephen King"));
         kingBooks.add(new Books("Hearts in Atlantis", 2000,"Stephen King"));
         kingBooks.add(new Books("Riding the Bullet ", 2001,"Stephen King"));
         kingBooks.add(new Books("Skeleton Crew     ", 1999,"Stephen King"));
         kingBooks.add(new Books("Doctor Sleep      ", 2013,"Stephen King"));
         kingBooks.add(new Books("Desperation       ", 1997,"Stephen King"));
         kingBooks.add(new Books("Rest Stop         ", 2004,"Stephen King"));
         kingBooks.add(new Books("Mr. Mercedes      ", 2015,"Stephen King"));
         return kingBooks;
     }

     public Set<Books> getListOfRowlingBooks(){
         rowlingBooks.add(new Books("Harry Potter and the Philosopher's Stone   ", 1997,"Joanne Rowling"));
         rowlingBooks.add(new Books("Harry Potter and the Chamber of Secrets    ", 1998,"Joanne Rowling"));
         rowlingBooks.add(new Books("Harry Potter and the Prisoner of Azkaban   ", 1999,"Joanne Rowling"));
         rowlingBooks.add(new Books("Harry Potter and the Goblet of Fire        ", 2000,"Joanne Rowling"));
         rowlingBooks.add(new Books("Harry Potter and the Order of the Phoenix  ", 2003,"Joanne Rowling"));
         rowlingBooks.add(new Books("Harry Potter and the Half-Blood Prince     ", 2005,"Joanne Rowling"));
         rowlingBooks.add(new Books("Harry Potter and the Deathly Hallows       ", 2007,"Joanne Rowling"));
         rowlingBooks.add(new Books("Fantastic Beasts and Where to Find Them    ", 2001,"Joanne Rowling"));
         rowlingBooks.add(new Books("Fantastic Beasts: The Crimes of Grindelwald", 2018,"Joanne Rowling"));
         rowlingBooks.add(new Books("The Christmas Pig", 2021,"Joanne Rowling   "));
         return rowlingBooks;
     }

     public Set<Books> getListOfBrownBooks(){
         brownBooks.add(new Books("Digital Fortress ", 1998,"Dan Brown"));
         brownBooks.add(new Books("Deception Point  ", 2001,"Dan Brown"));
         brownBooks.add(new Books("Wild Symphony    ", 2000,"Dan Brown"));
         brownBooks.add(new Books("The Da Vinci Code", 2003,"Dan Brown"));
         brownBooks.add(new Books("The Lost Symbol  ", 2009,"Dan Brown"));
         brownBooks.add(new Books("Angels & Demons  ", 2000,"Dan Brown"));
         brownBooks.add(new Books("Inferno          ", 2013,"Dan Brown"));
         brownBooks.add(new Books("Origin           ", 2017, "Dan Brown"));
         return brownBooks;
     }

     public HashMap<String,Set<Books>> createALibrary(){
         library.put("Stephen King", getListOfKingBooks());
         library.put("Joanne Rowling", getListOfRowlingBooks());
         library.put("Dan Brown", getListOfBrownBooks());
         return library;
     }

     public Set<Books> getListOfBooksByAuthor(String author){
         return library.get(author);
     }
}
