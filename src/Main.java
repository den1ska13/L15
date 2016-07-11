public class Main {

    public static void main(String[] args) {
        Bd b = new Bd();
        b.add("car1");
        b.add("car45");
        b.add("car3");
        b.add("car21");
        b.add("car100");

        b.delete("car100");

        b.apdate("car3","car15");

        b.print();
        b.sort();
    }
}
