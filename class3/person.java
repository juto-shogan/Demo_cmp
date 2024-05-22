package class3;

public class person{
    String name;
    String schoolName;

    public person() {
        System.out.println("person object created");
    }


    class Student extends person {
        private String matricNumber;
        private String password;
      
        public Student(String name, String schoolName, String matricNumber, String password) {
          //super(name, schoolName);
          this.matricNumber = matricNumber;
          this.password = password;
        }

        public String getPass() {
            return password;
        }

        public String getMatric() {
            return matricNumber;
        }


        public String getName() {
        return name;
        }


        public void setMatric(String matricNumber) {
            this.matricNumber = matricNumber;
        }
        
        public void setName(String name) {
            this.name = name;
        }

        public void setPass(String password) {
            this.password = password;
        }


    class Staff extends person {
        private int staffNumber;
        private String password;
      
        public Staff(String name, String schoolName, int staffNumber, String password) {
          //super(name, schoolName);
          this.staffNumber = staffNumber;
          this.password = password;
        }

        public String getName(){
        return name;
        }

        public String getPass(){
            return password;
        }
      
        public int getStaffNumber(){  
          return staffNumber;
        }
      }
    } 

}
