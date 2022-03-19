import java.util.Set;
import java.util.TreeSet;

public class Coll {

    public static void main(String[] args) {

        Set<String> coll = new TreeSet<>();
        coll.add("BMW");
        coll.add("Audi");
        coll.add("Audi");
        coll.add("Porsche");
        coll.add("Volkswagen");
        coll.add("Mercedes");

        for (Object o : coll) {
            System.out.println(o);
        }
    }
}
