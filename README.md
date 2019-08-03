# StrategyOfDesignPattern
springboot项目用策略模式改造if else多个判断
整体思路:
    1.自定义注解，在具体的每个策略类上使用自定义注解指定好类型
    2.实现接口ApplicationContextAware，项目启动后，该类利用applicationContext获取容器中所有有自定义注解的类
    3.读取获取的所有类的自定义注解的值，注解值作为key，类作为value放在map中
    4.客户端用时，根据传入的type值，相当于自定义注解的值，然后拿到类，然后从applicationContest.getBean(类)，然后调用对象方法即可了
  
  这样把所有的if else判断都消除了，代码看着非常简洁
