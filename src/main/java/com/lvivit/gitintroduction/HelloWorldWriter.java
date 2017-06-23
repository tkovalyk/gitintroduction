package com.lvivit.gitintroduction;

import org.springframework.stereotype.Component;

/**
 * Created by houston on 6/2/17.
 */
@Component
public class HelloWorldWriter {

    public HelloWorldWriter() {
        System.out.println("Hello World!");
        for(People people : People.values()) {
            System.out.println("Hello BFI -111111!");
        }
    }
}
