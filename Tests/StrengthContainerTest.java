import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by user2 on 11/4/15.
 */
public class StrengthContainerTest {

    @Test
    public void shouldAddStrengthToContainerWhenStrengthIsNotPresentInContainer(){
        StrengthContainer strengthContainer = new StrengthContainer();
        int strength = 8;
        strengthContainer.addStrengthInContainer(strength);
        assertTrue(strengthContainer.getContainer().contains(strength));
    }
}
