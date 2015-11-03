import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class QueryTest {

    @Test
    public void shouldGiveTheDataOfQueryWithPriority(){
        Map< String , Integer> expected = new HashMap<>();
        String data = "Q ford car";
        Query query = new Query(data);
        expected.put("ford" , 3);
        expected.put( "car" , 2);
        assertEquals(expected , query.getQueryDataWithStrength(3) );
    }
}
