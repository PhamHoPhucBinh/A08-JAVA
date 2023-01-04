package productID;

import java.util.Random;

public class GenerateId {
    public long GenerateId(){
        int randomId = 0;
        Random rand = new Random();
        for (int j=0;j < 10;j++)
        {
            randomId = (int) rand.nextLong();
        }
        return randomId;
    }
}
