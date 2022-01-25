package subtraction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculationManager {
    private Subtraction subtraction;

    //Constructor based Dependency Injection
    @Autowired
    public CalculationManager(Subtraction subtraction){
        this.subtraction = subtraction;
    }

    public int callCalculation(){
        return subtraction.subtract(20,7,3);
    }
}
