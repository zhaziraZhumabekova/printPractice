public class Magazine implements Printable{
    String name;
    public static void printMagazine(Printable[] printables){
        for (Printable printable : printables){
            if(printable instanceof Magazine){
                System.out.println(printable);
            }
        }
    }


    public Magazine(String name) {
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
        System.out.println("Magazine name is " + getName());
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
