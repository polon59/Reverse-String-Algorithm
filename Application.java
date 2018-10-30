/**
 * Application
 */
import java.lang.StringBuilder;

public class Application {

    public String reverseString(String str){
        String [] characters = str.split("");
        String[] reversed = new String[characters.length];
        int frontIndex = 0;

        for (int backIndex = characters.length-1; backIndex >=0; backIndex--) {
            if (Character.isLetter(str.charAt(backIndex))) {
                reversed[frontIndex] = characters[backIndex];
            }else{
                reversed[backIndex] = characters[backIndex];
            }
            frontIndex ++;
            System.out.println(frontIndex);

        }

        String reversedString = "";

        for (String character : reversed) {
            reversedString += character;
        }

        return reversedString;

    }
}