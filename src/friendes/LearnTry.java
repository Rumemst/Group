package friendes;

public class LearnTry {

    public static void main(String[] args) throws ArithmeticException{
     doDivision();



    }

    public static void doDivision(){
        try {
            int a = 10;
            int b = 0;
            int div = a / b;
            System.out.println(div);
         }
        catch (Exception e){
            System.out.println("error");
        }




    }



}
