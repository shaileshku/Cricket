package application.everestengineering.utils;

import java.util.List;
import java.util.Random;

public class CricUtility<T> {
    public  T getRandomItem(List<T> list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }


}
