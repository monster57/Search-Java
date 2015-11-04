import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by user2 on 11/4/15.
 */
public class ElementContainerTest {
    private ElementContainer elementContainer;
    private String element;
    @Before
    public void setUp() throws Exception{
        elementContainer = new ElementContainer();
        element = "hello";
        elementContainer.addElementToContainer(element);

    }

    @Test
    public void shouldAddElementToContainerWhenElementIsNotPresentInContainer(){
        assertTrue(elementContainer.getContainer().contains(element));
    }

    @Test
    public void shouldGetElementFromContainerWhenValueIsGiven(){
        assertEquals(elementContainer.getElementByValue(element) , element);
    }

}
