import java.util.ArrayList;
import java.util.List;

/**
 * Created by user2 on 11/2/15.
 */
public class StrengthContainer {
    private List<Integer> container;

    public StrengthContainer() {
        container = new ArrayList<>();
    }

    public List<Integer> getContainer(){
        return container;
    }

    public boolean isInserted(int strength){
        if(container.contains(strength))
            container.add(strength);
        return true;
    }

    public boolean isPresentInContainer(String data){
        return container.contains(data);
    }

    public void addStrengthInContainer(int strength){
        container.add(strength);
    }
}
