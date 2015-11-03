import java.util.ArrayList;
import java.util.List;

/**
 * Created by user2 on 10/31/15.
 */
public class Converter {
    private List<String> pageData;
    private List<String> queryData;
    private ElementContainer elementContainer;
    private  StrengthContainer strengthContainer;

    public Converter(List<String> pageData, List<String> queryData , ElementContainer elementContainer , StrengthContainer strengthContainer) {
        this.pageData = pageData;
        this.queryData = queryData;
        this.elementContainer = elementContainer;
        this.strengthContainer = strengthContainer;
    }

    public List<Page> convertPageDataToSetOfPage(){
        List<Page> pageSet = new ArrayList<>();
        for (String data : pageData) {
            pageSet.add(new Page(data , elementContainer , strengthContainer));
        }
        return pageSet;
    }

    public List<Query> convertQueryDataToSetOfQuery(){
        List<Query> querySet = new ArrayList<>();
        for (String data : queryData) {
            querySet.add(new Query(data));
        }
        return querySet;
    }
}
