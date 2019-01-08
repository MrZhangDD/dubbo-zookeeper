package com.demo.dubbo;

public class ProviderImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "dubbo" + name;
    }
}
