package com.aj;

import java.math.BigDecimal;

/**
 * @author Gjing
 * 获取价格
 **/
public interface Price {
    BigDecimal getPrice(BigDecimal price);
}
