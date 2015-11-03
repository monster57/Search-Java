import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class PageTest {

    @Test
    public void shouldGiveTheDataWithPriority(){
        Map<String , Integer> expected = new HashMap<>();
        ElementContainer elementContainer = new ElementContainer();
        StrengthContainer strengthContainer = new StrengthContainer();
        String data = "P ford car";
        Page page = new Page(data , elementContainer , strengthContainer);
        expected.put( "ford" , 3);
        expected.put( "car" , 2);
        assertEquals(expected , page.getPageDataWithStrength(3) );
    }


}
