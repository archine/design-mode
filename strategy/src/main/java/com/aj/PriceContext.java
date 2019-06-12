package com.aj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Gjing
 * 价格上下文
 **/
class PriceContext {

    BigDecimal getPrice(BigDecimal costPrice) throws Exception {
        Price price = PriceFactory.getInstance().getPrice(costPrice);
        return price.getPrice(costPrice);
    }
}
/**
 * @author Gjing
 * 策略工厂
 **/
class PriceFactory {

    private static final PriceFactory FACTORY = new PriceFactory();
    /**
     * 策略类集合
     */
    private List<Class<? extends Price>> priceList = new ArrayList<>();


    private PriceFactory() {
        //这边是可以改造成自动获取文件路径的哈
        priceList.add(Member.class);
        priceList.add(Ordinary.class);
        priceList.add(SuperMember.class);
    }

    /**
     * 获取对应金额的策略类
     * @param price 金额
     * @return Price
     * @throws Exception classNotFound
     */
    Price getPrice(BigDecimal price) throws Exception{
        for (Class<? extends Price> clazz : priceList) {
            PriceRegion priceRegion = clazz.getAnnotation(PriceRegion.class);
            if (price.compareTo(new BigDecimal(priceRegion.max())) < 0 && price.compareTo(new BigDecimal(priceRegion.min())) > 0) {
                return clazz.newInstance();
            }
        }
        return null;
    }
    
    static PriceFactory getInstance() {
        return FACTORY;
    }
}
