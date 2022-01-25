package com.kaushal.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ShapeManager {

    private Triangle triangle;

    //constructor based DI
    @Autowired
   public ShapeManager(Triangle triangle){
       this.triangle = triangle;
   }

   public String callTriangle(){
        return triangle.getValue();
   }

}
