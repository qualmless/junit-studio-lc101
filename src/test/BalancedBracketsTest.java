package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //TODO: Only brackets return true, not other characters
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ljkldafjdsa]"));
    }

    //TODO: return brackets should equal 0
    @Test
    public void areZero() {
        Boolean expectedBrackets = BalancedBrackets.hasBalancedBrackets("[]");
        assertEquals(true, expectedBrackets);
    }


}
