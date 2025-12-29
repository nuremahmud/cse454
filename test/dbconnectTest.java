import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class dbconnectTest {
    
    public dbconnectTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of connectDb method, of class dbconnect.
     */
    @Test
    public void testConnectDb() {
        Connection result = dbconnect.connectDb();
    assertNotNull(result);
        
    }
    
}
