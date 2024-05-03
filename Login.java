public class Login {

    String username = "janeDoe";
    String Password = "password";

    String login(){
        if(username.equals("janeDoe")&& Password.equals("password")){
          return "success";
        }else{
          System.out.println("incorrect");
          }
    
}
