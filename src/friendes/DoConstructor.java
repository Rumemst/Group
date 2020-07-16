package friendes;

public class DoConstructor {
String name;
String address;
int age;
public DoConstructor(){
    System.out.println("this is my default constructor");
}

public DoConstructor(String newname){
  this.name=newname;
    System.out.println(name);


}

    public static void main(String[] args) {
DoConstructor obj = new DoConstructor();
DoConstructor obj1=new DoConstructor("rume");
obj1.name="TASMI";
        System.out.println(obj1.name);
    }
}
