public class Library {
    public class Book{
        public String title="The lul boook";
        public String author="Rohit dev";
        public int yearPublished = 2024;
    }
    public static void main(String args[]){
         Library lib = new Library();
         Book book = lib.new Book();
        System.out.println(book.yearPublished);

    }
}
