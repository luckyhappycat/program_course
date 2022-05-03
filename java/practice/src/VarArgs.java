public class VarArgs {
    public static void test(int a, String... books) {
        for (var tmp : books) {
            System.out.println(tmp);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(1, "hello", "world");
    }
}
