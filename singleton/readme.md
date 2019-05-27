# 单例模式
保证实体在项目中存在只有一份 

####**好处:**
>线程安全、调用效率高，但不能延时加载，并且可以天然的防止反射和反序列化漏洞！
 
 
 常见四种实现方式的比较：
 * 饿汉式实现：
 >饿汉式单例模式代码中，static变量会在类装载时初始化，此时也不会涉及多个线程对象访问该对象的问题。虚拟机保证只会装载一次该类，肯定不会发生并发访问的问题。
 因此，可以省略synchronized关键字。问题：如果只是加载本类，而不是调用getInstance（），甚至永远没有调用，则会造成资源浪费！
 * 懒汉式(单例对象延时加载）：    
 > 要点：lazy load！  延时加载，懒加载！真正用的时候才加载！
   问题：资源利用率高了。但是，每次调用getInstance（）方法都要同步，并发效率低。
 * 静态内部类实现方式（也是一种懒加载方式）：
 > 要点：外部类没有static属性，则不会像饿汉式那样立即加载对象。
   只有真正调用getInstance（），才会加载静态内部类。加载类时是线程安全的。instance是static final类型，保证了内存中只有这样一个实例存在，
   而且只能被赋值一次，从而保证了线程安全性兼备了并发高效调用和延迟加载的优势！
 * 枚举式(推荐)：     
 > 线程安全、调用效率高，但不能延时加载，并且可以天然的防止反射和反序列化漏洞！
 
 ```
 1. 饿汉式
 
 线程安全，调用效率高 ，但是不能延迟加载
 
 2. 懒汉式
 
 线程安全，调用效率不高，能延迟加载
 
 3. 双重检测锁式
 
 由于JVM底层内部模型原因，偶尔会出问题。不建议使用
 
 4. 静态内部类式
 
 线程安全，资源利用率高，可以延时加载
 
 5. 枚举单例
 
 线程安全，调用效率高，但是不能延迟加载
 
 ```
#### 如何选择？
 1. 单例对象占用资源少，不需要延时加载：
 枚举式 好于 饿汉式
 
2. 单例对象占用资源大，需要延时加载：
 静态内部类式 好于 懒汉式