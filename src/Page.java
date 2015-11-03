import java.util.HashMap;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class Page {
    private String data;
    private ElementContainer elementContainer;
    private StrengthContainer strengthContainer;

    public Page(String data , ElementContainer elementContainer , StrengthContainer strengthContainer) {
        this.data = data;
        this.elementContainer = elementContainer;
        this.strengthContainer = strengthContainer;
    }

    public Map<String , Integer> getPageDataWithStrength(int maxStrength){
        String[] splitedDataBySpace = data.split(" ");
        Map<String ,Integer> pageDataWihStrength = new HashMap<>();
        for(int i=1;i<splitedDataBySpace.length;i++){
            if(!strengthContainer.getContainer().contains(maxStrength))
                strengthContainer.addStrengthInContainer(maxStrength);
            if(!elementContainer.getContainer().contains(splitedDataBySpace[i]))
                elementContainer.addElementToContainer(splitedDataBySpace[i]);
            pageDataWihStrength.put(splitedDataBySpace[i], maxStrength);
            maxStrength --;
        }
        return pageDataWihStrength;
    }
}
