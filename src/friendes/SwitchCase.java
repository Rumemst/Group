package friendes;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SwitchCase {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("my food menue is");
       int foodscrial = obj .nextInt();
        System.out.println("my food name is " + foodscrial);

for (int a=10;a<5;a++){
    System.out.println("my food is");
}

       // int foodscrial;
      String foodName;

        switch (foodscrial){
            case 1:
                foodName="pizza";
                break;
                case 2:
                    foodName="pasta";
                    break;
            case 3:
                foodName="bread";
                break;

            default:
                foodName="invalid food name ";
                break;


        }

        System.out.println("my food item is " + foodName);

    }
}
