//Import necessary classes
import java.math.BigInteger;

public class TestBigInteger {

    public static void main(String[] args) {

        //Create new instances of class BigInteger from package java.math
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        //Adds i1 to i2 with dot operator
        System.out.println(i1.add(i2));

        //Using dot operator and multiply the numbers
        System.out.println(i1.multiply(i2));

    }

}