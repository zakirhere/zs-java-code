import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class dt20180528_FindMissingNumbers {
    @Test
    public void testMiniMaxSum() {
        Assert.assertEquals(findMissingNumberInSeries(new int[] {1, 2, 4, 5}), 3);
        Assert.assertEquals(findMissingNumberInSeries(new int[] {3, 4, 6, 7}), 5);
        Assert.assertEquals(findMissingNumberInSeries(new int[] {3, 4, 5, 6, 7}), 0);
        Assert.assertEquals(findMissingNumberInSeries(new int[] {}), 0);
//        Assert.assertEquals(missingNumber(new int[] {1, 2}), 0);
//        Assert.assertEquals(missingNumber(new int[] {1, 2, 3, 4, 5, 6, 8}), 7);
//        Assert.assertEquals(missingNumber(new int[] {3, 4, 5, 6, 8}), 7);
//        Assert.assertEquals(missingNumbers(new int[] {3, 4, 5, 6, 8}), "7");
//        Assert.assertEquals(missingNumbers(new int[] {1, 3, 4, 5, 6, 8}), "2 7");
    }

    static int findMissingNumberInSeries(int[] numberSeries) {
        if(numberSeries.length > 2) {
            int missingNum = numberSeries[0];
            for (int i = 0; i < numberSeries.length - 1; i++) {
                if (missingNum != numberSeries[i]) {
                    return missingNum;
                }
                missingNum++;
            }
        }
        return 0;
    }

    public int missingNumber(int[] numberSeries) {
        int len = numberSeries.length;
        int j = 0;
        for(int i = numberSeries[0]; i<numberSeries[len - 1]; i++) {
            if(i != numberSeries[j]) {
                return i;
            }
            j++;
        }
        return 0;
    }

    public String missingNumbers(int[] numberSeries) {
        int len = numberSeries.length;
        int j = 0;
        String res = "";
        for(int i = numberSeries[0]; i<numberSeries[len - 1]; i++) {
            if(i != numberSeries[j]) {
                res += res + i + " ";
                i++;
            }
            j++;
        }
        return res.trim();
    }


}
