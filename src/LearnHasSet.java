import java.util.HashSet;
import java.util.Iterator;

public class LearnHasSet {
    public static void main(String[] args) {
        HashSet<String> h= new HashSet<String>();
        h.add("Rume");
        h.add("Piash");
        //h.add("Piash");
        h.add("Arman");

        System.out.println(h);

        System.out.println(h.size());
       // System.out.println(h.remove("Rume"));
       // System.out.println(h);
        //h.clear();
        //System.out.println(h);
      //  System.out.println(h.isEmpty());

        Iterator<String> it=h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
