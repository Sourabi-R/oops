class Food{
    void eat(){
        System.out.println("she is eating");
    }

    public void setName(String pizza) {
    }

    public String getName() {
        return "";
    }
}
class Briyani extends Food{
    void taste(){
        System.out.println("she is tasting the briyani");
    }
}
public class main {
    public static void main(String[] args) {
        Briyani food = new Briyani();
        food.eat();
        food.taste();
    }
}
