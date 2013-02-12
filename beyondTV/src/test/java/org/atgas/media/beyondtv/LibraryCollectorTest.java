/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.media.beyondtv;

import java.io.FileOutputStream;
import java.io.PrintStream;
import org.atgas.core.Change;
import org.atgas.core.json.JSON;
import org.junit.*;
import org.mockito.Mock;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;

/**
 *
 * @author Ken
 */
public class LibraryCollectorTest {




    /**
     * Test of call method, of class LibraryCollector.
     */
    @Test
    public void testCall() throws Exception {
        BTVSession session = mock(BTVSession.class);
        LibraryCollector instance = new LibraryCollector(session, new PropertyConverter());
        Change result = instance.call();
        PrintStream out = new PrintStream(new FileOutputStream("beyondtv.json"));
        out.println(JSON.format(result));
    }
}
