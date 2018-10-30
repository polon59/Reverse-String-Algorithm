import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Application {

    public String reverseString(String str){

        Character[] splittedString = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        
        List<Character> specCharList = new ArrayList<>();
        List<Character> normCharList = new ArrayList<>();
        List<Character> normCharListRev = new ArrayList<>();
        List<Character> readyOrder = new ArrayList<>();

        
        for (Character character : splittedString){
            if (Character.isLetter(character)) {
                normCharList.add(character);
            }
            else{
                specCharList.add(character);
            }
        }

        for (int i = normCharList.size()-1; i >= 0; i-- ) {
            normCharListRev.add(normCharList.get(i));
        }

        int normIndex = 0;
        int specIndex = 0;

        for (int i = 0; i < splittedString.length; i++){
            if (Character.isLetter(splittedString[i])){
                readyOrder.add(normCharListRev.get(normIndex));
                normIndex++;
            }
            else{
                readyOrder.add(specCharList.get(specIndex));
                specIndex++;
            }
        }

        for (Character c : readyOrder) {
            System.out.println(c);
        }


        
        











        String readyString = "";


        return readyString;

    }
}