package friendes;
import java.sql.SQLOutput;
import java .util.Hashtable;
public class HashTable {


    public static void main(String[] args) {
        Hashtable<String, String> hash = new Hashtable<String, String>();
        hash.put("rume", "bangladesh");
        hash.put("lemlem", "africa");
        hash.put("tasmi", "dhaka");

        System.out.println(hash.size());
        System.out.println(hash.get("rume"));
        System.out.println(hash.keySet());
        System.out.println(hash.values());
        System.out.println(hash.containsKey("ryan"));

        for(String i:hash.keySet()){
            System.out.println("keys are :"  + i+ "values are : " + hash.keySet());

        }

    }

        }



