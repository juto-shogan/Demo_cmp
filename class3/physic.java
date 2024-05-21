package class3;

public class physic {

    float calculateVelocity(float distance, int time){
        return distance/time;
    
    }
    
    float calculateVelocity1(float initialVelocity, float acceleration, int time){
        return initialVelocity + (acceleration*time);
    }
}
