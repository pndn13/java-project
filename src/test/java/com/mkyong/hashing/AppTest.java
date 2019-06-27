package com.mkyong.hashing;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	public void testEvenOdd()
{
	App ob =new App();
	String result = ob.checkEvenOdd(10);
	String expected = "Even";
	assertEquals(result,expected);
}
	public void testEvenOdd1()
{
	App ob =new App();
	String result = ob.checkEvenOdd(9);
	String expected = "Odd";
	assertEquals(result,expected);
}
}
