package friendes;

public class Construction {
     String name;
     String address;
     int age;
  //  public Construction(){

   // }
    public Construction(String newname){
        String name=newname;
        System.out.println("me name is " + name);
    }
    public Construction(String newname,String newaddress){
      String name = newname;
      String address= newaddress;
        System.out.println("my name is "+ name+"me address is " + address);


    }

    public static void main(String[] args) {
        Construction obj = new Construction("lemlem");
        Construction obj1=new Construction("lemlem","kentucky");

    }
}
