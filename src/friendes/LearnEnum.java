package friendes;

public class LearnEnum {

    public static void main(String[] args) {
        System.out.println("my favourate colour is " +Colour.red);
        System.out.println("the priority is " + Priority.low);
        Priority.Priority1();
    }

    public enum Colour{
        red,blue,green;

    }

}
