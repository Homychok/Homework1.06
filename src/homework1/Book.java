package homework1;

public class Book {
    private final String fullName;
    private final int numberOfPages;
    private int yearOfRelease;
    public Book (String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
    }
    public String getFullName() {
        return fullName;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
