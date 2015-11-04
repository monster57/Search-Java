import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by user2 on 11/4/15.
 */
public class StrengthContainerTest {
    private StrengthContainer strengthContainer;
    private int strength;

    @Before
    public void setUp() throws Exception{
        strength = 8;
        strengthContainer= new StrengthContainer();
        strengthContainer.addStrengthInContainer(strength);
    }

    @Test
    public void shouldAddStrengthToContainerWhenStrengthIsNotPresentInContainer(){
        assertTrue(strengthContainer.getContainer().contains(strength));
    }


    @Test
    public void shouldGetStrengthFromCOntainerWHenValueIsGiven(){
        assertEquals(strengthContainer.getStrengthByValue(strength) , strength);
    }
}
