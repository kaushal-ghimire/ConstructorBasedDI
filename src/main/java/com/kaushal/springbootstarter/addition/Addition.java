package com.kaushal.springbootstarter.addition;

import org.springframework.stereotype.Service;

@Service
public class Addition {

    public int add(int x, int y){
        return x + y;
    }
}
