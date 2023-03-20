package com.example.design.patterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");
        //url.openStream() does all the work behind the scenes
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
