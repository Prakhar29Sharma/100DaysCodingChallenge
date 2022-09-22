public class JavaExceptionExample2 {
    public static void main(String args[]) {
        try {
            int[] arr = {1,2,3};
            arr[5] = 20;
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally!");
        }
    }
}