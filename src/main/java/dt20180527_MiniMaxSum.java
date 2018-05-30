import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class dt20180527_MiniMaxSum {
    @Test
    public void testMiniMaxSum() {
        Assert.assertEquals(miniMaxSum(new int[] {1, 2, 3, 4, 5}), "10 14");
        Assert.assertEquals(miniMaxSum(new int[] {5, 4, 3, 2, 1}), "10 14");
        Assert.assertEquals(miniMaxSum(new int[] {10, 20, 30, 40, 50}), "100 140");
    }

    public String miniMaxSum(int[] inp) {
        int[] combined = new int[inp.length];
        int summedValue = combineAllArrayElem(inp);
        for(int i =0; i<inp.length; i++) {
            combined[i] = summedValue - inp[i];
        }
        Arrays.sort(combined);
        return Integer.toString(combined[0]) + " " + Integer.toString(combined[combined.length - 1]);
    }

    public int combineAllArrayElem(int [] inArr) {
        int result = 0;
        for(int num: inArr) {
            result += num;
        }
        return result;
    }
}
