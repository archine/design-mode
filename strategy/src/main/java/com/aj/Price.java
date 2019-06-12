package com.aj;

import java.math.BigDecimal;
/**
 * @author Gjing
 * 获取价格
 **/
public interface Price {
    BigDecimal getPrice(BigDecimal price);
}

/**
 * @author Gjing
 * 会员,六折
 **/
@PriceRegion(min = 10000,max = 20000)
class Member implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.6 + ""));
    }
}

/**
 * @author Gjing
 * 普通客户
 **/
@PriceRegion(max = 10000)
class Ordinary implements Price {
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price;
    }
}

/**
 * @author Gjing
 * 超级会员,4折
 **/
@PriceRegion(min = 20000)
class SuperMember implements Price{
    @Override
    public BigDecimal getPrice(BigDecimal price) {
        return price.multiply(new BigDecimal(0.4+""));
    }
}