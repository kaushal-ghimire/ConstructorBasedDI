package subtraction;

import org.springframework.stereotype.Service;

@Service
public class Subtraction {

    public int subtract(int a, int b, int c){
        return a - b - c;
    }
}
