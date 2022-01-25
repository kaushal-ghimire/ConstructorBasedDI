package com.kaushal.springbootstarter;

import org.springframework.stereotype.Component;

@Component
public class Triangle {
    public String getValue(){
        return"Triangle Created.";
    }

    public int area(int length, int breadth){
        return length * breadth;
    }

    public void fillColor(String color){
        System.out.println(color +" "+ "applied on shape");
    }
}
