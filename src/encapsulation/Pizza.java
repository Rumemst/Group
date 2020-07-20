package encapsulation;

public class Pizza {


  public String pizzaName="dominos";
  public String pizzaTopping="onion";
  public int pizzaPrice=20;
  private char pizzaSize='l';
  private String name ="rume";
    public Pizza() {


    }

    public Pizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public Pizza(int pizzaPrice, String pizzaTopping) {
        this.pizzaPrice = pizzaPrice;
        this .pizzaTopping=pizzaTopping;
    }

    public char getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(char pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
