package Interface.tugasInterface;

public class Novel extends Book {
    private String Genre;

    public Novel(String Title, String Author, int Year, String Genre){
        super(Title, Author, Year);
        this.Genre = Genre;
        }

    // Peminjaman buku
    @Override
    public void borrowBook(){
        if (isBorrowed()){
            System.out.println("Novel : " + getTItle() + " is already borrowed");
        } else {
            setBorrowed(true);
            System.out.println("Novel : " + getTItle() + " borrowed successfully");
        }
    }

    // Pengembalian buku
    @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel : " + getTItle() + " Returned successfully");            
        } else {
            System.out.println("Novel : " + getTItle() + " is not borrowed");
        }
    }

    // Tampilan
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Genre : " + Genre);
    }

}
