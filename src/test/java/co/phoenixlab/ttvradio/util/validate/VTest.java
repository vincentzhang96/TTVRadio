package co.phoenixlab.ttvradio.util.validate;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@SuppressWarnings("unchecked")
public class VTest {

    @Test
    public void testValidateOkRTE() throws Exception {
        Validatable<RuntimeException> val = (Validatable<RuntimeException>)mock(Validatable.class);
        Validatable<RuntimeException> ret = V.validate(val);
        verify(val).validate();
        verify(ret).validate();
        assertEquals(val, ret);
    }

    @Test
    public void testValidateOkE() throws Exception {
        Validatable<Exception> val = (Validatable<Exception>)mock(Validatable.class);
        Validatable<Exception> ret = V.validate(val);
        verify(val).validate();
        verify(ret).validate();
        assertEquals(val, ret);
    }

    @Test(expected = Exception.class)
    public void testValidateFail() throws Exception {
        Validatable<Exception> val = (Validatable<Exception>)mock(Validatable.class);
        doThrow(Exception.class).when(val).validate();
        V.validate(val);
    }

    @Test(expected = IOException.class)
    public void testValidateFail2() throws Exception {
        Validatable<IOException> val = (Validatable<IOException>)mock(Validatable.class);
        doThrow(IOException.class).when(val).validate();
        V.validate(val);
    }
}
