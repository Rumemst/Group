package friendes;

import java.util.HashMap;

public class DoHashmap {



    //HashMap store items in (key and value pair
    //  One object is used as a key (index) to another object (value)
    // It can store different types: String keys and Integer values, or the same type, like: String keys and String values

    public static void main(String[] args) {

        HashMap <String, String>city = new HashMap<String, String> ();

        city.put("England","London");
        city.put("Usa","Washington dc");
        city.put("Eritrea","Mekelle");
        city.put("Bangladesh","Dhaka");


               System.out.println(city);
       // System.out.println(city.get("England"));
       // System.out.println(city.size());
       // System.out.println(city.remove("England"));
       // System.out.println(city);
        System.out.println(city.containsValue("Dhaka"));
        System.out.println(city.containsKey("England"));

        for (String i:city.keySet()) {
            System.out.println(i);
        }
        System.out.println(city.keySet());

        for (String i:city.keySet()) {
            System.out.println("Keys are: " + i +" "+ "Values are: " + city.get(i));
        }

    }


}
