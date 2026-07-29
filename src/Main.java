public class Main {
    public static void main(String[] args) {
        Company comp = new Company(10);

        comp.insert("John", 30, 50000.0);
        comp.insert("Alice", 25, 60000.0);
        comp.insert("Bob", 35, 55000.0);

        comp.display();
        System.out.println();

        comp.search("Alice");
        System.out.println();

        comp.remove("John");
        System.out.println();

        comp.display();
    }
}
