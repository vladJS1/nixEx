package com;

import com.autoconfig.component.HelloService;

public class CustomHelloService implements HelloService {
    @Override
    public void hello() {
        System.out.println("Another text");
    }
}
