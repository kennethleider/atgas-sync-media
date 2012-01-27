/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.atgas.store.neo4j;

import org.atgas.store.Store;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Ken
 */
public class StoreFactoryTest {

    public StoreFactoryTest() {
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
     * Test of create method, of class StoreFactory.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        StoreFactory instance = new StoreFactory();
        Store expResult = null;
        Store result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
