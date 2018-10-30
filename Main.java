/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Application application = new Application();
        String reversedString = application.reverseString(args[0]);
        System.out.println(reversedString);
    }
}