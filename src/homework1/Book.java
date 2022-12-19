package homework1;

public class Book {
    private String fullName;
    private int numberOfPages;
    private int yearOfRelease;
    private String authorName;

    public Book(String authorName, String fullName, int numberOfPages, int yearOfRelease) {
        this.fullName = fullName;
        this.numberOfPages = numberOfPages;
        this.yearOfRelease = yearOfRelease;
        this.authorName = authorName;
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

    public String getAuthorName() {
        return authorName;
    }
        public void setYearOfRelease ( int yearOfRelease){
            this.yearOfRelease = yearOfRelease;
        }
    }


