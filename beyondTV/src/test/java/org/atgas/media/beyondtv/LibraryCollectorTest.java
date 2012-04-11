/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.beyondtv;

import java.io.FileOutputStream;
import java.io.PrintStream;
import org.atgas.store.Change;
import org.atgas.store.JSON;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ken
 */
public class LibraryCollectorTest {

    public LibraryCollectorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of call method, of class LibraryCollector.
     */
    @Test
    public void testCall() throws Exception {
        BTVSession session = BTVSession.connect("4a57cb5f-2031-4c01-9a08-9194559d111a-7fb9fcba", "administrator", "pword");
        LibraryCollector instance = new LibraryCollector(session);
        Change result = instance.call();
        PrintStream out = new PrintStream(new FileOutputStream("beyondtv.json"));
        out.println(JSON.format(result));
    }
}
