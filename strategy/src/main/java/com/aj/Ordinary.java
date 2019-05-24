package com.aj;

import java.math.BigDecimal;

/**
 * @author Gjing
 * 普通客户
 **/
@PriceRegion(max = 10000)
public class Ordinary implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price;
    }
}
