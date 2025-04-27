package com.logica;

public class Calculadora {

    public Integer soma(Integer valor01, Integer valor02){

        Integer total = valor01 + valor02;
        return total;
    }
    
    public Integer subtracao(Integer valor01, Integer valor02) {
    	Integer total =0;
    	
    	if (valor01 > valor02) {
    		total = valor01 - valor02;
    	}
    	else if(valor01 < valor02) {
    		total = valor02 - valor01;
    	}
    	else
    		total = 0;
    	
    	return total;
    }
    
    public Integer mult(Integer valor01, Integer valor02) {
    	Integer total =0;
    	total = valor01 * valor02;
    	 return total;
    }
}
