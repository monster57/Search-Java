import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 10/31/15.
 */
public class SeparatorTest {

    @Test
    public void shouldReturnAListOfPages(){
        String data = "P car\r\nP Ford\r\nQ Ford";
        Separator separator = new Separator(data);
        List<String> expected = new ArrayList<String>();
        expected.add("P car");
        expected.add("P Ford");
        assertEquals(expected , separator.fetchSignatureData('p'));
    }

    @Test
    public void shouldReturnABlankArrayIfNoPageIsInList(){
        String data = "Q car\r\nQ Ford\r\nQ Ford";
        Separator separator = new Separator(data);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected , separator.fetchSignatureData('p'));
    }

    @Test
    public void shouldReturnAListOfQueries(){
        String data = "P car\r\nP Ford\r\nQ Ford";
        Separator separator = new Separator(data);
        List<String> expected = new ArrayList<String>();
        expected.add("Q Ford");
        assertEquals(expected , separator.fetchSignatureData('q'));
    }

    @Test
    public void shouldReturnABlankArrayIfNoQueryIsInList(){
        String data = "P car\r\nP Ford\r\nP Ford";
        Separator separator = new Separator(data);
        List<String> expected = new ArrayList<String>();
        assertEquals(expected , separator.fetchSignatureData('q'));
    }


}
