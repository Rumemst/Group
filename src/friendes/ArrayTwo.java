package friendes;

public class ArrayTwo {


    public static void main(String[] args) {
    int a [][]=new int[2][3];
    a [0][0]=10;
    a[0][1]=20;
    a[0][2]=30;

        a [1][0]=10;
        a[1][1]=20;
        a[1][2]=30;

        System.out.println(a.length);
        System.out.println(a[0].length);
        for(int row=0;row<a.length;row++){
            for (int colum=0;colum<a[0].length;colum++){
                System.out.println(a[row][colum]);
            }
        }
    }




}
