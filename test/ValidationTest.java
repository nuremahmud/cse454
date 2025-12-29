import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidationTest {

    @Test
    public void testValidEmail() {
        String email = "test@example.com";
        assertTrue(email.contains("@"));
    }

    @Test
    public void testInvalidEmail() {
        String email = "testexample.com";
        assertFalse(email.contains("@"));
    }

    @Test
    public void testEmptyName() {
        String name = "";
        assertTrue(name.isEmpty());
    }

    @Test
    public void testPhoneLength() {
        String phone = "01712345678";
        assertEquals(11, phone.length());
    }

    @Test
    public void testSkillNotNull() {
        String skill = "Java";
        assertNotNull(skill);
    }
}