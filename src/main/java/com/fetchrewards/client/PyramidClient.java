package com.fetchrewards.client;

import org.springframework.web.client.RestTemplate;

public class PyramidClient {

    static final String url = "http://localhost:8081/ispyramid?input=";

    public boolean getResult(String str){
        RestTemplate template = new RestTemplate();
        boolean result = template.getForObject(url+str,Boolean.class);
        return result;
    }

}
