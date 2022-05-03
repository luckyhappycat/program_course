public class AppleOverride extends Fruit {
    public void info() {
        System.out.println("Apple, weight: " + weight);
    }

    public static void main(String[] args) {
        var a = new AppleOverride();
        a.weight = 56;
        a.info();
    }
}
