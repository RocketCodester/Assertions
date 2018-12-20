//---------------------------------------------------------------
//         Project
//         Assertions.java
//         Checks if animal is underweight.
//---------------------------------------------------------------

public class Assertions {

    public static void main(String args[]) {
        int value = 25;
        assert value >= 20 : " Underweight";
        System.out.println("value is " + value);
    }
}
