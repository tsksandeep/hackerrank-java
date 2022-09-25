public class _30_generics {
    static void varargsMethod(Object... v) {
        for (Object x : v) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        varargsMethod(1, 2, 3, "Hello", "World");
    }
}
