package com.example.demo.Strategy1;

import java.lang.annotation.*;
//自定义注解的使用：https://blog.csdn.net/sw5131899/article/details/54947192
@Target(ElementType.TYPE)  //作用在类上,接口，枚举上
@Retention(RetentionPolicy.RUNTIME) //// 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Documented  //说明该注解将被包含在javadoc中
@Inherited  //子类可以继承此注解
public @interface HandlerOrderType {
    /**
     * 策略类型
     * @return
     */
    int value();
}