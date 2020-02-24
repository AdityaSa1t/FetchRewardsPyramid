package com.fetchrewards.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class PyramidService {

    Map<Character,Integer> pyrMap =  new HashMap<Character,Integer>();
    List<Integer> valResult;
    Boolean result;

    @GetMapping("/ispyramid")
    public boolean isPyramid(@RequestParam(value="input") String s) {

        int index = 0;

        //A list to hold arithmetic progression of 1 to N, where N = number of characters.
        List<Integer> arthProg = new ArrayList<Integer>();

        //Clearing hashmap so that each time an API call is made, it acts only on the given input.
        pyrMap.clear();

        //Converting to lowercase to maintain consistency in character count.
        s=s.toLowerCase();

        //Check if input is empty. If empty, return false. Else, find the characters and their frequency.
        if(!s.isEmpty()){
            for (int i=0;i<s.length();i++){
                if(pyrMap.containsKey(s.charAt(i))){
                    pyrMap.put(s.charAt(i),pyrMap.get(s.charAt(i))+1);
                } else {
                    pyrMap.put(s.charAt(i),1);
                    index++;
                    arthProg.add(index);
                }
            }
        } else {
            return false;
        }

        //Get all the values from the hashmap into a list and sort them to get a sorted character frequency list.
        valResult = new ArrayList<Integer>(pyrMap.values());
        Collections.sort(valResult);

        //If arithmetic progression is found in the character frequency list of the given string, then return true.
        if(arthProg.equals(valResult)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
