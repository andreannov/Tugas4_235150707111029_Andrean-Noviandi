package Interface.tugasInterface;

public class TextBook extends Book {

    private String Subject;

    public TextBook(String Title, String Author, int Year, String Subject){
    super(Title, Author, Year);
    this.Subject = Subject;
    }

// Peminjaman buku
@Override
public void borrowBook(){
    if (isBorrowed()){
        System.out.println("TextBook : " + getTItle() + " is already borrowed");
    } else {
        setBorrowed(true);
        System.out.println("TextBook : " + getTItle() + " borrowed successfully");
    }
}

// Pengembalian buku
@Override
public void returnBook(){
    if (isBorrowed()) {
        setBorrowed(false);
        System.out.println("TextBook : " + getTItle() + " Returned successfully");            
    } else {
        System.out.println("TextBook : " + getTItle() + " is not borrowed");
    }
}

// Tampilan
@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Subject : " + Subject);
}
}
