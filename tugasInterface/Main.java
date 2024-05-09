package Interface.tugasInterface;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("BOBO", "Adi Subrata", 1968, "Kids");
        Novel novel = new Novel("Harry Potter dan Batu Bertuah", "J. K. Rowling", 1997, "Fantasy");
        TextBook textbook = new TextBook("MENGENAL TEKNOLOGI INFORMASI", "Dr. Eng Ir. I Made Wartana, MT", 2021, "Technology & Engineering");

        System.out.println("---- Book Information ----");
        System.out.println();
        magazine.displayInfo();
        novel.displayInfo();
        textbook.displayInfo();
        System.out.println();
        
        System.out.println("---- Borrowing and Returning Book ----");
        System.out.println();
        magazine.borrowBook();
        novel.returnBook();
        textbook.borrowBook();
        System.out.println();
    }
}

