package homework1;

public class Main {
    public static void main(String[] args) {
        Author.Book author1 = new Author.Book("Leo Tolstoy", "War and piece",1300,1867);
    Author.Book author2 = new Author.Book("Joanne Harris", "Blackberry Wine", 414, 2001);
    author2.setYearOfRelease (2002);
        System.out.println("Book 1: " + author1.getFullAuthorName() + ", " + author1.getFullName() + ", " + author1.getNumberOfPages() + " pages, " + author1.getYearOfRelease() + " year.");
        System.out.println("Book 2: " + author2.getFullAuthorName() + ", " + author2.getFullName() + ", " + author2.getNumberOfPages() + " pages, " + author2.getYearOfRelease() + " year.");
    }
}
