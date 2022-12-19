package homework1;

public class Main {
    public static void main(String[] args) {
    Book autor1 = new Book("War and piece", 1300, 1867);
    Author autor_1 = new Author("Leo Tolstoy");
    Book autor2 = new Book("Blackberry Wine", 414, 2001);
    Author autor_2 = new Author("Joanne Harris");
    autor2.setYearOfRelease (2002);
        System.out.println("Book 1: " + autor_1.getFullAuthorName() + ", " + autor1.getFullName() + ", " + autor1.getNumberOfPages() + " pages, " + autor1.getYearOfRelease() + " year.");
        System.out.println("Book 2: " + autor_2.getFullAuthorName() + ", " + autor2.getFullName() + ", " + autor2.getNumberOfPages() + " pages, " + autor2.getYearOfRelease() + " year.");
    }
}
