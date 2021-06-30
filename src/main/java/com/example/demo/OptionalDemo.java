package com.example.demo;

import javax.swing.text.html.Option;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",null);
        Optional.ofNullable(map.get("a").equals("")).orElse(false);
    }
}
