public class StaticAccessNoStatic {
    public void info() {
        System.out.println("info");
    }
    public static void main(String[] args) {
        // 错误
        //info();
        // 正确
        new StaticAccessNoStatic().info();
        // or
        StaticAccessNoStatic m = new StaticAccessNoStatic();
        m.info();
    }
}