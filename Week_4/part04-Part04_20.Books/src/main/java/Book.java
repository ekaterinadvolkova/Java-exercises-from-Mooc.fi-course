
public class Book {
    private final String title;
    private final int pages;
    private final int yearPublication;
    
    public Book (String title, int pages, int yearPublication) {
        this.title = title;
        this.pages=pages;
        this.yearPublication = yearPublication;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public int getYear() {
        return yearPublication;
    }
    
    
    @Override
    public String toString() {
        return title +", " + pages+ " pages, " +yearPublication;
    }
    
    
}
