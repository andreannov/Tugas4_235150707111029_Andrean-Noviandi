package Interface.tugasInterface;

public class Magazine extends Book {
    private String Category;

    public Magazine(String Title, String Author, int Year, String Category){
        super(Title, Author, Year);
        this.Category = Category;
        }

    // Peminjaman buku
    @Override
    public void borrowBook(){
        if (isBorrowed()){
            System.out.println("Magazine : " + getTItle() + " is already borrowed");
        } else {
            setBorrowed(true);
            System.out.println("Magazine : " + getTItle() + " borrowed successfully");
        }
    }

    // Pengembalian buku
    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine : " + getTItle() + " Returned successfully");            
        } else {
            System.out.println("Magazine : " + getTItle() + " is not borrowed");
        }
    }

    // Tampilan
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Catgerory : " + Category);
    }

}

