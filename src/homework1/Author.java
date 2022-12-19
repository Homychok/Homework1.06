package homework1;
public class Author {
    public static class Book {
        private String fullAuthorName;
        private String fullName;
        private int numberOfPages;
        private int yearOfRelease;

        public Book(String fullAuthorName, String fullName, int numberOfPages, int yearOfRelease) {
            this.fullName = fullName;
            this.numberOfPages = numberOfPages;
            this.yearOfRelease = yearOfRelease;
            this.fullAuthorName = fullAuthorName;
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

        public String getFullAuthorName() {
            return fullAuthorName;
        }
    }
}

