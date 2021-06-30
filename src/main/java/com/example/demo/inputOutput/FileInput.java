package com.example.demo.inputOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class FileInput {

    static HashSet set = new HashSet();
    public static Set getFile(String url) throws Exception {
        InputStreamReader is = new InputStreamReader(new FileInputStream(url), StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(is);
        String line = "";
        while((line = br.readLine())!=null){

            set.add(line);
        }
        br.close();
        is.close();
        return set;
    }

    public static void main(String[] args) {
        try {
            Set file = getFile("C:\\Users\\胖虎\\Desktop\\mq部署.txt");
            file.forEach(item -> System.out.println(item));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
