import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class OutputGenarator {
    private Map<String , Map< String , Integer>> resultSet;

    public OutputGenarator(Map<String, Map<String, Integer>> resultSet) {
        this.resultSet = resultSet;
    }

    public List<String> getPrintableValue(){
        List<String> printableValue = new ArrayList<>();
        for(Map.Entry<String , Map<String , Integer>> result: resultSet.entrySet()){
            List<String> pagesWithQuery = new ArrayList<>();
            List<Integer> strengths  = new ArrayList(result.getValue().values());
            Collections.sort(strengths , Collections.reverseOrder());
            for (Integer strength : strengths) {
                String page = getKeyFromValue(result.getValue() , strength , pagesWithQuery);
                if (pagesWithQuery.size()<5){
                    pagesWithQuery.add(page);
                }
            }
            printableValue.add(result.getKey()+": "+String.join(" ",pagesWithQuery));
        }
        return printableValue;
    }

    private String getKeyFromValue(Map<String, Integer> pageWithStrength, int strength, List<String> pagesWithQuery) {
        for (Map.Entry<String , Integer> pageStrengthPair : pageWithStrength.entrySet()) {
            if (pageStrengthPair.getValue().equals(strength) && !pagesWithQuery.contains(pageStrengthPair.getKey()) ) {
                return pageStrengthPair.getKey();
            }
        }
        return null;
    }
}
