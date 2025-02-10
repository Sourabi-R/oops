abstract class Cartoon{
    abstract void character();
    void showType() {
        System.out.println("Cartoon show");
    }
}
class Shinchan extends Cartoon{
    void character(){
        System.out.println("shinchan and masow is the main character");;
    }
}
class Pokemon extends Cartoon{
    void character(){
        System.out.println("pikachu is the main charcter");
    }
}
public class Abstraction{
    public static void main(String[] args){
        Cartoon c = new Shinchan();
        Cartoon c1 = new Pokemon();
        c.showType();
        c.character();
        c1.showType();
        c1.character();
    }
}