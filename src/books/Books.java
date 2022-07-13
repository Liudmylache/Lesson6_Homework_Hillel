package books;

public class Books {
    public final String name;
    public final int yearOfPublishing;
    public final String author;

    public Books(String name, int yearOfPublishing, String author) {
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", author='" + author + '\'' +
                '}';
    }
}
