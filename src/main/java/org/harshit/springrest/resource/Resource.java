package org.harshit.springrest.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/spring")
public class Resource {

    @GetMapping("hello")
    public String test(){
        return  "Hello Harshit";
    }

}
