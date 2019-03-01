import org.junit.Test;

public class MainClassTest extends MainClass{

    //Test 0.1
    @Test

    public void testGetLocalNumber(){
        if (getLocalNumber()== 14){
            System.out.println("Test pass! getLocalNumber return number 14");
        }else if(getLocalNumber()> 14){
            System.out.println("Test fail! getLocalNumber return number "+getLocalNumber()+". This number is biggest then 14.");
        }else System.out.println("Test fail! getLocalNumber return number "+getLocalNumber()+". This number is smaller then 14.");

    }

    //Test 0.2
    @Test

    public void testGetClassNumber(){
        if (getClassNumber() > 45){
            System.out.println("Test pass!");
        }else System.out.println("Test fail! ClassNumber not larger number 45");
    }

    //Test 0.3
    @Test

    public void testGetClassString(){
        if (getClassString().matches("Hello.+?") || getClassString().matches("hello.+?") ){

            System.out.println("The text have the KeyWords. Test Pass!");

        }else System.out.println("The text not have the KeyWords. Test Fail!");
    }


}
