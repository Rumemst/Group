package friendes;

public class Array {
//Array is order collection of items.its comes from java collection.
//Java array is an object which contains elements of a similar data type.
 //
   //2 types of Array
   //1.one Dimension
   //2 .two/multy  Dimension



    public static void main(String[] args) {

      int a []  = { 1,2,3,4 };
      int b []=new int [3];
        b[0]=10;
        b[1]=20;
        b[2]=30;

        System.out.println(a.length);
        System.out.println(b.length);

//for (int i=0 ; i<b.length;i++ ){
    //System.out.println(b[i]);}
        for (int i:b) {
            System.out.println(i);
        }



    }



}
