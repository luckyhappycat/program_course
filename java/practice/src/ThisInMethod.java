public class ThisInMethod {
    public void jump() {
        System.out.println("jump");
    }
    public void run() {
        this.jump();
        System.out.println("run");
    }
    public static void main(String[] args) {
        // 错误
        // run();
        // 正确
        ThisInMethod d = new ThisInMethod();
        d.run();
    }
}
