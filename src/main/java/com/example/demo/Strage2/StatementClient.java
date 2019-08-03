//package com.example.demo.Strage2;
//
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//@Component
//public class StatementClient<T> implements InitializingBean {
//    @Autowired
//    private ApplicationContextHelper applicationContextHelper;
//
//
//    private Map<String, StatementHandle> TypeAndStatementHandle = new ConcurrentHashMap<>();
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//
//        Map<String, StatementHandle> statementHandles = applicationContextHelper.getBeansOfType(StatementHandle.class);
//        for (Map.Entry<String, StatementHandle> StatementHandle : statementHandles.entrySet()) {
//            TypeAndStatementHandle
//                    .put(StatementHandle.getValue().getType().getConfigCode(), StatementHandle.getValue());
//        }
//
//    }
//
//    public void doHandler(String tag,T t) {
//        TypeAndStatementHandle.get(tag).process(t);
//    }
//
