package class3;

import class3.person.Student.Staff;

public class start {
    public static void main (String [] args){

        //cmp202 CMP202 = new CMP202()
        //CMP202.printUserDetails();

        person person = new person();


        //person Student = new Student("Bingham", "somto", "654321", "BHU/22/04/09/0027");
        //person Staff  = new Staff("Bingham", "abu", "654321", 667);
        //Student student = new Student("Bingham", "somto", "654321", "BHU/22/04/09/0027");
        //Staff staff = new Staff("Bingham", "abu", "654321", 667);



        //Student student = new Student("Bingham", "somto", "BHU/22/04/09/0027", "1232234");

        Staff staff = new Staff("Bingham", "abu", 667, "654321");


        //System.out.println("Student Name: " + Student.getName());
        //System.out.println("Student Matriculation Number: " + Student.getMatric());

        System.out.println("Staff Name: " + staff.getName());
        System.out.println("Staff Number: " + staff.getStaffNumber());
    }



        
        physic physic = new physic();
        
        //float result = physic.calculateVelocity1(initialVelocity, acceleration, time); 
        //System.out.println(result);

        //Calling the physics method
        //System.out.println( physic.calculateVelocity1(2.20303, 2.22345323, 50));
        //System.out.println(physic.calculateVelocity(5.0303,50));

        // calling the person instance and methods


        //person person = new person();
        //person.name = "John";
        //System.out.println(person.getName());
        
        //Person person = new Person();
        //person.setName("David smith");
        //System.out.println(person.getName());

        //person.setPass("somto");
        //System.out.println(person.getPass());



        //person.password = "Password";
    
    
}
