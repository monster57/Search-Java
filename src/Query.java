import java.util.HashMap;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class Query {
    private String data;

    public Query(String data) {
        this.data = data;
    }

    public Map<String , Integer> getQueryDataWithStrength(int maxStrength){
        String[] splitDataBySpace = data.split(" ");
        Map<String , Integer> pageDataWithStrength = new HashMap<>();
        for(int i=1;i<splitDataBySpace.length;i++){
            pageDataWithStrength.put(splitDataBySpace[i] , maxStrength);
            maxStrength --;
        }
        return pageDataWithStrength;
    }

}
