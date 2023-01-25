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

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void absenceOfBracketsAreConsideredBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void outOfOrderBracketsAreNotBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void firstBracketCannotBeClose() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }
    @Test
    public void lastBracketCannotBeOpen() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]["));
    }

    @Test
    public void LCBadExample1IsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void LCBadExample2IsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void testThisConfusingOne() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[]]]"));
    }

    @Test
    public void testThisOtherOne() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[This] [[is [a]] balanced] string]"));
    }

    @Test
    public void testAnotherOne() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This] [[is [an]] unbalanced] string]"));
    }

}


