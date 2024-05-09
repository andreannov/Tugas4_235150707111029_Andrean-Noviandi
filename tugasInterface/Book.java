package Interface.tugasInterface;

public abstract class Book implements BookOperation {
    
    private String Title;
    private String Author;
    private int Year;
    private Boolean Borrowed;

    public Book (String Title, String Author, int Year){
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    // Constructor Judul
    public void setTitle(String Title){
        this.Title = Title;
    }
    public String getTItle(){
        return Title;
    }

    // Constructor Author
    public void setAuthor(String Author){
        this.Author = Author;
    }
    public String getAuthor(){
        return Author;
    }

    // Constructor Tahun
    public void setYear(int Year){
        this.Year = Year;
    }
    public int getYear(){
        return Year;
    }

     // Constructor Status
    public void setBorrowed(Boolean Borrowed){
        this.Borrowed = Borrowed;
    }
    public Boolean isBorrowed(){
        return Borrowed;
    }
    
    public void displayInfo(){
        System.out.println("Title : " + getTItle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Year : " + getYear());
        System.out.println("Borrowed : " + isBorrowed());
    }

}
