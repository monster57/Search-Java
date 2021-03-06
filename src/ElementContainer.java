import java.util.ArrayList;
import java.util.List;

/**
 * Created by user2 on 11/2/15.
 */
public class ElementContainer {
    private List<String> container;

    public ElementContainer() {
        container = new ArrayList<>();
    }

    public List<String> getContainer(){
        return container;
    }

    public boolean isInserted(String data){
        if(!container.contains(data))
            container.add(data);

        return  true;
    }

    public void addElementToContainer(String element){
        container.add(element);
    }

    public boolean isPresentInContainer(String data){
        return container.contains(data);
    }

    public String getElementByValue(String value){
        for (String element : container) {
            if(element == value)
                return element;
        }
        return null;
    }
}
