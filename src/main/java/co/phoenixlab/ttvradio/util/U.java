package co.phoenixlab.ttvradio.util;

/**
 * General utilities
 */
public class U {

    private U() {}

    public static boolean isNullOrTrimmedEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

}
