import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user2 on 11/4/15.
 */
public class StrengthTest {
    @Test
    public void shouldGetTheStrengthValue(){
        int value = 8;
        Strength strength = new Strength(8);
        assertEquals(strength.getValue() , value);
    }
}
