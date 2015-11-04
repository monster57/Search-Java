import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class ConverterTest {
    private  List<String> pageData;
    private List<String> queryData;
    private int strength;
    private Converter converter;
    private ElementContainer elementContainer;
    private StrengthContainer strengthContainer;

    @Before
    public void setUp() throws Exception{
        pageData = new ArrayList<>();
        queryData = new ArrayList<>();
        pageData.add("P Car Ford");
        pageData.add("P Review Ford");
        queryData.add("Q Ford Car");
        queryData.add("Q Review Car");
        strength = 8;
        elementContainer = new ElementContainer();
        strengthContainer = new StrengthContainer();
        converter = new Converter(pageData , queryData ,elementContainer , strengthContainer);
    }

    @Test
    public void shouldGiveASetOfPages(){

        List<Page> actual = converter.convertPageDataToSetOfPage();
        List<Page> expected = new ArrayList<>();
        expected.add(new Page("P Car Ford" , elementContainer , strengthContainer));
        expected.add(new Page("P Review Ford" , elementContainer , strengthContainer));
        for (int i = 0; i<expected.size(); i++){
            assertEquals(expected.get(i).getPageDataWithStrength(strength) ,actual.get(i).getPageDataWithStrength(strength) );
        }

    }


    @Test
    public void shouldGiveASetOfQueries(){
        List<Query> actual = converter.convertQueryDataToSetOfQuery();
        List<Query> expected = new ArrayList<>();
        expected.add(new Query("Q Ford Car" , elementContainer , strengthContainer));
        expected.add(new Query("Q Review Car" , elementContainer , strengthContainer));
        for (int i = 0; i<expected.size(); i++){
            assertEquals(expected.get(i).getQueryDataWithStrength(strength) ,actual.get(i).getQueryDataWithStrength(strength) );
        }

    }
}
