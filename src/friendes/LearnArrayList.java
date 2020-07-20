package friendes;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {


    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("Yeasmin");
        arr.add("Lem lem");
        arr.add("tasmi");
        arr.add("piash");
        arr.add(10);
        arr.add(12.00);
        arr.add(12.00);
        arr.add('m');
        System.out.println(arr);

//        for (String i:arr) {
//            System.out.println(i);
//        }

        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }


}
