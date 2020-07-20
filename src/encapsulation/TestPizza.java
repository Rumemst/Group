package encapsulation;

import org.w3c.dom.ls.LSOutput;

public class TestPizza {
    public static void main(String[] args) {


        Pizza Pizza = new Pizza();
        System.out.println(Pizza.pizzaName);
   Pizza.setPizzaSize('l');
        System.out.println(Pizza.getPizzaSize());

Pizza lemlempizza=new Pizza("pizzahut");
        System.out.println(lemlempizza.pizzaName);
lemlempizza.setName("rume");
        System.out.println("my name is " +lemlempizza.getName());


        lemlempizza.pizzaName="stpizza";
        System.out.println(lemlempizza.pizzaName);

    }


}
