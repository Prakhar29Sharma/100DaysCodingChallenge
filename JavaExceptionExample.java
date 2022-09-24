public class JavaExceptionExample {
    public static void main(String args[]) {
        try {
            int div;
            div = 100/0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}