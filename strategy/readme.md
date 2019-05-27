# 策略模式
如果都使用if-else的话，就会使用代码变的臃肿，而且难以复用。
那我们就可以根据不同的情况，将不同的方式封装成不同的策略，将策略与它的使用对象分离开来。
* Price：策略
* Member: 会员
* ordinary: 普通
* superMember: 超级会员
**以上都实现Price策略类，各自自行实现其中的方法**
* PriceContext: 策略上下文，使用时直接使用此类
* PriceFactory: 策略工厂，生成具体的策略
> 实例：
```
public static void main(String[] args) throws Exception {
     PriceContext priceContext = new PriceContext();
     System.out.println(priceContext.getPrice(new BigDecimal(200)));
     System.out.println(priceContext.getPrice(new BigDecimal(11100)));
     System.out.println(priceContext.getPrice(new BigDecimal(30000)));
 }
```