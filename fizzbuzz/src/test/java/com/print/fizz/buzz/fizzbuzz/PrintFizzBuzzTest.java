package com.print.fizz.buzz.fizzbuzz;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for PrintFizzBuzz.
 */
public class PrintFizzBuzzTest extends TestCase {

	 /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrintFizzBuzzTest( String testName )
    {
        super( testName );
        new FizzBuzz(10).checkFizzBuzz();
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( PrintFizzBuzzTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
