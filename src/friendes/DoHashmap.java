package friendes;

import java.util.HashMap;

import java.util.Iterator;


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
        System.out.println(city.remove("England"));
        System.out.println(city);
        //System.out.println(city.containsValue("Dhaka"));
        //System.out.println(city.containsKey("England"));

//        for (String i:city.keySet()) {
//            System.out.println(i);
//        }
//        System.out.println(city.keySet());
//
//        for (String i:city.keySet()) {
//            System.out.println("Keys are: " + i +" "+ "Values are: " + city.get(i));
//        }
//
//        HashMap<String, Integer> stName= new HashMap<String, Integer>();
//        stName.put("Yeasmin", 19);
//        stName.put("Tasmi", 20);
//        stName.put("lemlem", 21);
//
//        System.out.println(stName);
//        System.out.println(stName.containsKey("Yeasmin"));
//        System.out.println(stName.size());
//
//        System.out.println(stName.replace("Tasmi", 30));
//        System.out.println(stName);
//       ////System.out.println(stName.remove("Yeasmin"));
//
//        for (String i:stName.keySet()) {
//            System.out.println("keys are "+ i + " values are: "+ stName.get(i));
//        }




    }


}
