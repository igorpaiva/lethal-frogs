package com.test.lethal_frogs.math;

public class SimpleMath {
    public Double sum(Double numberOne, Double numberTwo) throws Exception {
        return numberOne + numberTwo;
    }
    
    public Double sub(Double numberOne, Double numberTwo) throws Exception {
        return numberOne - numberTwo;
    }
    
    public Double mul(Double numberOne, Double numberTwo) throws Exception {
        return numberOne * numberTwo;
    }
    
    public Double div(Double numberOne, Double numberTwo) throws Exception {
        return numberOne / numberTwo;
    }
    
    public Double mean(Double numberOne, Double numberTwo) throws Exception {
        return (numberOne + numberTwo)/2;
    }
    
    public Double sqrt(Double number) throws Exception {
        return Math.sqrt(number);
    }
}
