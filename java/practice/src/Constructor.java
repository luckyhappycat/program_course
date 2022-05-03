public class Constructor {
    public String name;
    public int size;

    public Constructor(String name) {
        this.name = name;
    }

    public Constructor(String name, int size) {
        this(name);
        this.size = size;
    }
}
