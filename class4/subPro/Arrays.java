package class4.subPro;

public class Arrays{
    public static void main(String[] args) {

        int [] numbersArray = new int[10];
        numbersArray[0] = 12;
        numbersArray[1] = 11;
        numbersArray[2] = 54;
        numbersArray[3] = 7;
        numbersArray[4] = 1;

        //loop

        for (int i=10; i < numbersArray.length; i--){
            System.out.println(numbersArray[i]);
        
        if(numbersArray[i] == 54){
            System.out.println("found" +numbersArray[i]);
            break;
        }

    }

}
}

