import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> collectionOfSharpies = new ArrayList<>();

    String countUsable(){
       int usableSharpieCounter = 0;
        for (Sharpie sharpie : collectionOfSharpies) {
            if(sharpie.ink > 0){
                usableSharpieCounter++;
            }
        }
        return "You have " + usableSharpieCounter + " usable sharpies";
    }

    void removeTrash(){
        for (int i = 0; i < collectionOfSharpies.size()-1; i++) {
            if(collectionOfSharpies.get(i).ink <= 0) {
                collectionOfSharpies.remove(i);
            }
        }
    }
}
