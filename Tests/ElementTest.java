import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 11/4/15.
 */
public class ElementTest {

    @Test
    public void shouldGetTheElementValueFromElement(){
        String value = "hello"
        Element element = new Element(value);
        assertEquals(element.getValue() , value);
    }
}
