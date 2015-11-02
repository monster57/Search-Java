import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class OutputGenaratorTest {
    @Test
    public void shouldGiveAListOfPrintableOutputForGivenInput(){
        Map<String , Map<String ,Integer>> resultSetForQuery = new HashMap<>();
        Map<String , Integer> result = new HashMap<>();
        result.put("P1" , 56);
        result.put("P3" , 56);
        result.put("P2" , 48);
        resultSetForQuery.put("Q1", result);
        OutputGenarator outputGenarator = new OutputGenarator(resultSetForQuery);
        List<String> expected = new ArrayList<>();
        expected.add("Q1: P1 P3 P2");
        assertEquals(expected , outputGenarator.getPrintableValue());
    }

}
