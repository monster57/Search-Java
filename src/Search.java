import java.security.PrivateKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by user2 on 10/31/15.
 */
public class Search {
    private List<Page> pageSet;
    private List<Query> querySet;
    private String pageSignature;
    private String querySignature;

    public Search(List<Page> pageSet, List<Query> querySet) {
        this.pageSet = pageSet;
        this.querySet = querySet;
        pageSignature = "P";
        querySignature = "Q";
    }

    public Map<String, Map<String, Integer>> getResultSet(){
        Map<String, Map<String, Integer>> result = new HashMap<>();
        int queryNumber = Constraints.ZERO.getValue();

        for (Query query : querySet) {
            queryNumber++;
            Map<String, Integer> resultWithStrengthSet = getResult(query);
            result.put(querySignature+queryNumber , resultWithStrengthSet);
        }
        return result;
    }

    private Map<String, Integer> getResult(Query query) {
        Map<String , Integer> queryDataWithStrength = query.getQueryDataWithStrength(Constraints.STRENGTH.getValue());
        Map<String, Integer> resultWithStrengthSet = new HashMap();
        int pageNumber = Constraints.ZERO.getValue();
        for (Page page : pageSet) {
            Integer totalStrength = Constraints.ZERO.getValue();
            pageNumber++;
            Map<String , Integer> pageDataWithStrength = page.getPageDataWithStrength(Constraints.STRENGTH.getValue());
            for(Map.Entry<String , Integer> dataStrengthPair:pageDataWithStrength.entrySet()){
                if (queryDataWithStrength.containsKey(dataStrengthPair.getKey())){
                    totalStrength = totalStrength+(dataStrengthPair.getValue()*queryDataWithStrength.get(dataStrengthPair.getKey()));
                }
            }
            if(totalStrength!=Constraints.ZERO.getValue())
                resultWithStrengthSet.put(pageSignature+pageNumber , totalStrength);
        }
        return resultWithStrengthSet;
    }
}
