package books;

public class Main {
    public static void main(String[] args){

        Library library = new Library();
        System.out.println(library.createALibrary());

        System.out.println("------------------------------------------");
        System.out.println(library.getListOfBooksByAuthor("Joanne Rowling"));
    }
}
