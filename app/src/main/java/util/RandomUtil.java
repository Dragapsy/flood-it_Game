package util;

import java.util.Random;

public class RandomUtil {

    private RandomUtil(){}

    public static <T> T randomElement(T[] elements, Random random){
        T element= elements[random.nextInt(elements.length)];
        return element;
    }











}
