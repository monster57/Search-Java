import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class SearchTest {

    @Test
    public void shouldGiveAResultSetForGivenInput(){
        List<Page> pages = new ArrayList<>();
        List<Query> queries = new ArrayList<>();
        StrengthContainer strengthContainer = new StrengthContainer();
        ElementContainer elementContainer = new ElementContainer();
        pages.add(new Page("P Car Ford" , elementContainer , strengthContainer));
        pages.add(new Page("P Review Car Ford" , elementContainer , strengthContainer) );
        pages.add(new Page("P Review Ford", elementContainer , strengthContainer));
        queries.add(new Query("Q Ford"));
        Search search = new Search(pages , queries);
        Map<String , Map<String ,Integer>> expected = new HashMap<>();
        Map <String , Integer> result = new HashMap<>();
        result.put("P1" , 56);
        result.put("P3" , 56);
        result.put("P2" , 48);
        expected.put("Q1" , result);

        assertEquals(expected , search.getResultSet());
    }

}
