import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class ConverterTest {
    

    @Test
    public void shouldGiveASetOfPages(){
        List<String> pageData = new ArrayList<>();
        List<String> queryData = new ArrayList<>();
        pageData.add("P Car Ford");
        pageData.add("P Review Ford");
        queryData.add("Q Ford Car");
        queryData.add("Q Review Car");
        int strength = 8;
        Converter converter = new Converter(pageData , queryData);
        List<Page> actual = converter.convertPageDataToSetOfPage();
        List<Page> expected = new ArrayList<>();
        expected.add(new Page("P Car Ford"));
        expected.add(new Page("P Review Ford"));
        for (int i = 0; i<expected.size(); i++){
            assertEquals(expected.get(i).getPageDataWithStrength(strength) ,actual.get(i).getPageDataWithStrength(strength) );
        }

    }


    @Test
    public void shouldGiveASetOfQueries(){
        List<String> pageData = new ArrayList<>();
        List<String> queryData = new ArrayList<>();
        pageData.add("P Car Ford");
        pageData.add("P Review Ford");
        queryData.add("Q Ford Car");
        queryData.add("Q Review Car");
        int strength = 8;
        Converter converter = new Converter(pageData , queryData);
        List<Query> actual = converter.convertQueryDataToSetOfQuery();
        List<Query> expected = new ArrayList<>();
        expected.add(new Query("Q Ford Car"));
        expected.add(new Query("Q Review Car"));
        for (int i = 0; i<expected.size(); i++){
            assertEquals(expected.get(i).getQueryDataWithStrength(strength) ,actual.get(i).getQueryDataWithStrength(strength) );
        }

    }
}
