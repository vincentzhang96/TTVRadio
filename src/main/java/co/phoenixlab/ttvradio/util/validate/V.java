package co.phoenixlab.ttvradio.util.validate;

public class V {

    private V() {
    }

    /**
     * Performs {@link Validatable#validate() validation} on a {@link Validatable} object, throwing the
     * Validatable-defined Throwable if validation fails.
     * @param r The {@code Validatable} to perform validation on
     * @param <T> The type of the Throwable thrown by the implementation of the Validatable
     * @param <R> The type of the Validatable object
     * @return The provided object
     * @throws T If validation fails
     */
    public static <T extends Throwable, R extends Validatable<T>> R validate(R r)
            throws T {
        r.validate();
        return r;
    }

}
