package LeetCodeProblem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAddittionTest {

    @org.junit.jupiter.api.Test
    void addTheCarry() {
        BinaryAddittion ba=new BinaryAddittion();
        assertEquals(101,ba.addTheCarry(5));
        assertEquals(111,ba.addTheCarry(6));
        assertEquals(1000,ba.addTheCarry(7));
        assertEquals(1001,ba.addTheCarry(8));
        assertEquals(1011,ba.addTheCarry(9));
        assertEquals(1111,ba.addTheCarry(10));
        assertEquals(10000,ba.addTheCarry(11));
    }

    @org.junit.jupiter.api.Test
    void checkTheNumberIsFull() {
        BinaryAddittion ba=new BinaryAddittion();
        assertTrue(ba.checkTheNumberIsFull(0));
    }

    @Test
    void binaryAdd() {
        BinaryAddittion ba=new BinaryAddittion();
        assertEquals("11101110000",ba.binaryAdd("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
    @Test
    public void testString(){
        StringPalindrome sp=new StringPalindrome();
        assertTrue(sp.checkThePalindrome("Ka viv! Ak"));
    }
}