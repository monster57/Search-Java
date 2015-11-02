import java.util.HashMap;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class Page {
    private String data;

    public Page(String data) {
        this.data = data;
    }

    public Map<String , Integer> getPageDataWithStrength(int maxStrength){
        String[] splitedDataBySpace = data.split(" ");
        Map<String ,Integer> pageDatawihStrength = new HashMap<>();
        for(int i=1;i<splitedDataBySpace.length;i++){
            pageDatawihStrength.put(splitedDataBySpace[i] , maxStrength);
            maxStrength --;
        }
        return pageDatawihStrength;
    }
}
