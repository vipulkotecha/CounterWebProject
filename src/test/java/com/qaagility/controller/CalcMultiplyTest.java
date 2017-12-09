package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.controller.*;

public class CalcMultiplyTest
{

    CalcMultiply objCMT = new CalcMultiply();
    Calculator objCalc = new Calculator();
 
    @Before
    public void testSlow()
    {
        System.out.println("Slow");
    }
    @Before
    public void testFast()
    {
        System.out.println("Fast");
    }
    @Before
    public void testFurious()
    {
        System.out.println("Furious");
    }
    
    @Test
        public void testCalc()
        {
            assertEquals ("Result", 15,objCMT.multiply(3,5));
        }
    @Test
        public void testFailCalc()
        {
            assertEquals ("Result", 8, objCMT.multiply(3,5));
        }
    @Test
        public void testCalcAdd()
        {
            assertEquals ("Result", 9, objCalc.add());
        }
}
