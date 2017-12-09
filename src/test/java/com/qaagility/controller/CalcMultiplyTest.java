package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagitlity.controller.*;

public class CalcMultiplyTest
{

    CalcMultiplyTest objCMT = new CalcMultiplyTest();
    Calculator objCalc = new Calculator();
    @Begin
    public void testSlow()
    {
        System.out.println("Slow");
    }
    
    public void testFast()
    {
        System.out.println("Fast");
    }
    
    @Begin
    public void testFurious()
    {
        System.out.println("Furious");
    }
    
    @Test
        public void testCalc()
        {
            assertEquals ("Result", objCMT.multiply(3,5),15);
        }
    @Test
        public void testFailCalc()
        {
            assertEquals ("Result", objCMT.multiply(3,5),8);
        }
    @Test
        public void testCalcAdd()
        {
            assertEquals ("Result", objCalc.add(),9);
        }
}
