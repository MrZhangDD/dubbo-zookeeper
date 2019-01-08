package com.demo.dubbo;

import org.springframework.stereotype.Service;
@Service
public class ProviderImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "dubbo" + name;
    }
}
