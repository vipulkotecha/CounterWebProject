package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcMultiplyTest
{

    public void testSlow()
    {
        System.out.println("Slow");
    }
    
    public void testFast()
    {
        System.out.println("Fast");
    }
    
    
    public void testFurious()
    {
        System.out.println("Furious");
    }
    
    @Test
        public void testCalc()
        {
            assertEquals ("Result", 9,9);
        }
    @Test
        public void testFailCalc()
        {
            assertEquals ("Result", 9,10);
        }

}
