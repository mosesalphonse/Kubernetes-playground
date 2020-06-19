package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        System.out.println("GreetingService's greeting method invoked");
        return "hello " + name;
    }

}
