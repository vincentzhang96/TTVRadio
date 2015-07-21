package co.phoenixlab.ttvradio.util.validate;

/**
 * Represents an object whose fields may be {@link #validate() validated}.
 * @param <T> The type of exception to be thrown when validation fails
 * @see V#validate(Validatable)
 */
public interface Validatable<T extends Throwable> {

    /**
     * Performs validation on this object by means of self-introspection. If at least one of the object's fields are
     * determined to be invalid, an exception of type T is thrown.
     * @throws T If validation failed
     */
    void validate() throws T;

}
