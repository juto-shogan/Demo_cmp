public class HelloWorld {
    String username = "janeDoe";
    String Password = "password";
    //String login = System.out.println("login please")
    
    String login(){
      if(username.equals("janeDoe")&& Password.equals("password")){
        return "success";
      }else{
        System.out.println("incorrect");
      }
    }
    public static void main(String[] args) {

      User jane = new User();
      System.out.println(jane.login());



       // inheritance, encapsulaton& polymorphism
        // interfaces & method overriding
        // data structures array, stack & queues
        // generics; lists, sets, maps
        // java swing library --------> file water
        // exception handling
       // streams API
      
    }
  }

