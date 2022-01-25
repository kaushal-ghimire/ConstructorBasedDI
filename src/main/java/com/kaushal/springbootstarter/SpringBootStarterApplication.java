package com.kaushal.springbootstarter;


import com.kaushal.springbootstarter.addition.Addition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import student.Student;
import subtraction.CalculationManager;

@SpringBootApplication(scanBasePackages = {"com.kaushal","subtraction","student"})
public class SpringBootStarterApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBootStarterApplication.class, args);
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootStarterApplication.class, args);
        Triangle triangle = applicationContext.getBean(Triangle.class);
        System.out.println(triangle.getValue());
        System.out.println("Area of triangle: "+triangle.area(10,24));
        triangle.fillColor("GREEN");

        ShapeManager shapeManager = applicationContext.getBean(ShapeManager.class);
        System.out.println(shapeManager.callTriangle());

        Addition addition = applicationContext.getBean(Addition.class);
        System.out.println("Sum is: "+addition.add(5,7));

            CalculationManager calculationManager = applicationContext.getBean(CalculationManager.class,args);
            System.out.println("Value after Subtraction: "+calculationManager.callCalculation());

            Student student = (Student) applicationContext.getBean("student");
            student.setId(1);
            student.setName("Kaushal Ghimire");
            student.setFaculty("Bsc.CSIT");
            System.out.println(student.getId());
            System.out.println(student.getName());
            System.out.println(student.getFaculty());
	}

}
