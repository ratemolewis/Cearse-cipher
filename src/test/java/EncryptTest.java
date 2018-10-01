import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Test
    public void encrypt() {
        Encrypt obj = new Encrypt();
        obj.encrypt("boy",1);
        assertEquals("cpz","boy");
    }
}