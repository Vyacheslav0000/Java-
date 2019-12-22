import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        System.out.println("New array:");
        Mas<?> m = new Mas<Object>(new Cat(), new Dog());
        m.info();

        System.out.println("\nExchange array items:");
        m.masElementsExchange();
        m.info();

        System.out.println("\nArrayList:");
        ArrayList<?> list = m.arrayToArrayList();
        for (Object o : list) System.out.println(o.getClass().getName());
    }
}