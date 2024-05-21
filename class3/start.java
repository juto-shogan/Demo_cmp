package class3;

public class start {
    public static void main (String [] args){

        //cmp202 CMP202 = new CMP202()
        //CMP202.printUserDetails();

        //person student = new person("Bingham", "somto", "654321", "BHU/22/04/09/0027");

        //person staff  = new person("Bingham", "abu", "654321", 667);


        physic physic = new physic();

        float initialVelocity;
        float acceleration;
        int time;
        initialVelocity = 2;
        acceleration = 3;
        time = 2;
        
        
        String result = physic.calculateVelocity1(initialVelocity, acceleration, time); 
        System.out.println(result);



        person person = new person();
        person.name = "John";
        System.out.println(person.getName());
        
        //Person person = new Person();
        person.setName("David smith");
        System.out.println(person.getName());

        person.SetPass("somto");
        System.out.println(person.getPass());



        //person.password = "Password";
    }
    
}
