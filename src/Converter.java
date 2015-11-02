import java.util.ArrayList;
import java.util.List;

/**
 * Created by user2 on 10/31/15.
 */
public class Converter {
    private List<String> pageData;
    private List<String> queryData;

    public Converter(List<String> pageData, List<String> queryData) {
        this.pageData = pageData;
        this.queryData = queryData;
    }

    public List<Page> convertPageDataToSetOfPage(){
        List<Page> pageSet = new ArrayList<>();
        for (String data : pageData) {
            pageSet.add(new Page(data));
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
