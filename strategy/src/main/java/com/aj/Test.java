package com.aj;

import java.math.BigDecimal;

/**
 * @author Gjing
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        PriceContext priceContext = new PriceContext();
        System.out.println(priceContext.getPrice(new BigDecimal(200)));
        System.out.println(priceContext.getPrice(new BigDecimal(11100)));
        System.out.println(priceContext.getPrice(new BigDecimal(30000)));
    }
}
