package inharitance;

public class GrandFather {

  public String name="bob";
  public String address="barisal";
  private int age =60;

    public GrandFather(String name) {
        this.name = name;
    }

    public GrandFather(String name ,String address) {
        this.name=name;
        this.address=address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
