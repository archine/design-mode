package com.aj;

import java.math.BigDecimal;

/**
 * @author Gjing
 * 策略上下文
 **/
class PriceContext {

    BigDecimal getPrice(BigDecimal costPrice) throws Exception {
        Price price = PriceFactory.getInstance().getPrice(costPrice);
        return price.getPrice(costPrice);
    }
}
