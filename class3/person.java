package class3;

public class person {
    String name;
    
    String schoolName = "Bingham University";

    private String password;

    private String matric_no;

    person(){
        System.out.println("objected created");
    }


    //public person();

    // Methods
    
    String getName(){
    return name;
   }

   

    String getPass(){
        return password;
    }

    void setName(String name){
        this.name = name;
    }
    void SetPass(String password){
    this.password = password;
    }
       
    
    
}
