package co.phoenixlab.ttvradio.util;

import org.junit.*;

import static co.phoenixlab.ttvradio.util.U.*;
import static org.junit.Assert.*;

public class UTest {

    @Test
    public void testIsNullOrTrimmedEmpty() throws Exception {
        String s = "potato";
        assertFalse(isNullOrTrimmedEmpty(s));
    }

    @Test
    public void testIsNullOrTrimmedEmpty_Null() throws Exception {
        String s = null;
        assertTrue(isNullOrTrimmedEmpty(s));
    }

    @Test
    public void testIsNullOrTrimmedEmpty_Empty() throws Exception {
        String s = "";
        assertTrue(isNullOrTrimmedEmpty(s));
    }

    @Test
    public void testIsNullOrTrimmedEmpty_Trimmed() throws Exception {
        //  Fill string with all "whitespace" chars (defined by String.trim() as any code below 0x21)
        char[] chars = new char[0x21];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) i;
        }
        String s = new String(chars);
        assertTrue(isNullOrTrimmedEmpty(s));
    }

}
