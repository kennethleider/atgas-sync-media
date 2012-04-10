/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.beyondtv;

import java.util.Collection;
import org.junit.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 *
 * @author ken
 */
@ContextConfiguration(locations="file:src/test/test-context.xml")
public class IngestLibraryTest extends AbstractJUnit4SpringContextTests {

    /**
     * Test of call method, of class IngestLibrary.
     */
    @Test
    public void testCall() throws Exception {
        System.out.println("call");
        LibraryCollector instance = applicationContext.getBean(LibraryCollector.class);
        Collection expResult = null;
        Collection result = instance.call();
        Assert.assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        Assert.fail("The test case is a prototype.");
    }
}
