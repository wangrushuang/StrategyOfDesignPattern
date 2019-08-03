//package com.example.demo.Strage2;
//
//import org.springframework.beans.BeansException;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ApplicationContextHelper implements ApplicationContextAware {
//
//    ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//
//
//    public <T> T getBean(Class<T> clazz) {
//        return applicationContext.getBean(clazz);
//    }
//
//    public <T> Map<String, T> getBeansOfType(Class<T> clazz) {
//        return applicationContext.getBeansOfType(clazz);
//    }
//
//
//}
