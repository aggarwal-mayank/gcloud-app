package com.ma.programming.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.Properties;

@RestController
public class SystemController {

    @GetMapping("/properties")
    public String getProperties() {
        StringBuffer buffer = new StringBuffer();
        Properties p = System.getProperties();
        Enumeration keys = p.keys();
        while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)p.get(key);
            System.out.println(key + ": " + value);
            buffer.append(key + ": " + value+"\t");
        }
        return buffer.toString();
    }
}
