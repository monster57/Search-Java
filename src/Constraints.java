/**
 * Created by user2 on 10/31/15.
 */
public enum  Constraints {
    ZERO (0) , STRENGTH (8);

    private final int value;
    private Constraints(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
