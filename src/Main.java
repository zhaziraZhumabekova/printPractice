public class Main {
    public static void main(String[] args) {
//        Printable[] printArray = {new Book(), new Magazine()};
        Book book1 = new Book("Book1");
        Book book2 = new Book("Book2");
        Magazine maga = new Magazine("Magazine1");
        Magazine maga1 = new Magazine("Magazine2");

        Printable[] printArray = {book1, book2, maga, maga1};
        for (Printable pr : printArray){
            pr.print();
    }
            Magazine.printMagazine(printArray);
            Book.printBooks(printArray);
    }

}