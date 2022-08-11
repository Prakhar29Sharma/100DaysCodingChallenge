public class char_input {
    public static void main(String[] args) throws java.io.IOException {
            for (int i = 0; i < 3; i++) {
                char ch;
                System.out.println("press any key on keyboard");
                ch = (char) System.in.read();
                System.out.println("key pressed : " + ch);
            }
    }
}