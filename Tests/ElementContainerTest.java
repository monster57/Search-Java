import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by user2 on 11/4/15.
 */
public class ElementContainerTest {

    @Test
    public void shouldAddElementToContainerWhenElementIsNotPresentInContainer(){
        ElementContainer elementContainer = new ElementContainer();
        String element = "hello";

        elementContainer.addElementToContainer(element);
        assertTrue(elementContainer.getContainer().contains(element));
    }

}
