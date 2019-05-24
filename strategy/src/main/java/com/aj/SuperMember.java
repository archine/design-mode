package com.aj;

import java.math.BigDecimal;

/**
 * @author Gjing
 * 超级会员,4折
 **/
@PriceRegion(min = 20000)
public class SuperMember implements Price{
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.4+""));
    }

}
