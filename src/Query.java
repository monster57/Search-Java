import java.util.HashMap;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class Query {
    private String data;
    private ElementContainer elementContainer;
    private StrengthContainer strengthContainer;

    public Query(String data, ElementContainer elementContainer, StrengthContainer strengthContainer) {
        this.data = data;
        this.elementContainer = elementContainer;
        this.strengthContainer = strengthContainer;
    }

    public Map<String , Integer> getQueryDataWithStrength(int maxStrength){
        String[] splitDataBySpace = data.split(" ");
        Map<String , Integer> pageDataWithStrength = new HashMap<>();
        for(int i=1;i<splitDataBySpace.length;i++){
            if(elementContainer.getContainer().contains(splitDataBySpace[i]))
                elementContainer.addElementToContainer(splitDataBySpace[i]);
            if(strengthContainer.getContainer().contains(maxStrength))
                strengthContainer.addStrengthInContainer(maxStrength);
            pageDataWithStrength.put(splitDataBySpace[i] , maxStrength);
            maxStrength --;
        }
        return pageDataWithStrength;
    }

}
