package com.ma.programming.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;
import java.util.Map;
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
            buffer.append(String.format("%s=%s%n", key, value));
        }
        return buffer.toString();
    }

    @GetMapping("/environment")
    public String getEnvironment() {
        StringBuffer buffer = new StringBuffer();
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
            buffer.append(String.format("%s=%s%n", envName, env.get(envName)));
        }
        return buffer.toString();
    }
}
