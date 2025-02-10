
class Foody{
    void eat() {
        System.out.println("she is eating");
    }
}
class biryani extends Foody {
    void taste() {
        System.out.println("she is tasting");
    }
}
class Hyderabadi extends biryani {
    void Flavor() {
        System.out.println("hyderabadi always has my heart");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Hyderabadi hyderabadiBiryani = new Hyderabadi();
        hyderabadiBiryani.eat();
        hyderabadiBiryani.taste();
        hyderabadiBiryani.Flavor();
    }
}
