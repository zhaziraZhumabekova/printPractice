public class Book implements Printable{
    String name;

    public static void printBooks(Printable[] printables){
        for (Printable printable : printables){
            if(printable instanceof Book){
                System.out.println(printable);
            }
        }
    }
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Book name is " + getName());
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
