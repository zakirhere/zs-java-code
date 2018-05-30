import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Numeros the Artist had two lists that were permutations of one another. He was very proud. Unfortunately, while transporting them from one exhibition to another, some numbers were lost out of the first list. Can you find the missing numbers?


public class dt20180527_FindMissingNumber {
    @Test
    public void testMiniMaxSum() {
        Assert.assertEquals(missingNumbers(new int[] {1, 2, 3, 4, 5}, new int[] {2, 3, 4, 5}), new int[] {1});
        Assert.assertEquals(missingNumbers(new int[] {1, 2, 3, 4, 5}, new int[] {3, 4, 5}), new int[] {1, 2});
        Assert.assertEquals(missingNumbers(new int[] {1, 2, 3, 4}, new int[] {3, 4, 5}), new int[] {1, 2, 5});
        Assert.assertEquals(missingNumbers(new int[] {1, 2}, new int[] {3, 4, 5}), new int[] {1, 2, 3, 4, 5});
        Assert.assertEquals(missingNumbers(new int[] {203, 204, 205, 206, 207, 208, 203, 204, 205, 206},
                new int[] {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204}), new int[] {204, 205, 206});
    }

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        List<Integer> arrList = convertIntArrToList(arr);
        List<Integer> brrList = convertIntArrToList(brr);

        List<Integer> resArr = new ArrayList<>();
        for(int num : arrList) {
            if(brrList.contains(num)) {
                brrList.remove(Integer.valueOf(num));
            } else {
                resArr.add(num);
            }
        }
        resArr.addAll(brrList);
        Collections.sort(resArr);
        return convertListToIntArr(resArr);
    }

    static int[] convertListToIntArr(List<Integer> inp) {
        int[] intList = new int[inp.size()];
        for (int i =0; i<inp.size(); i++)
        {
            intList[i] = inp.get(i);
        }
        return intList;
    }

    static List<Integer> convertIntArrToList(int[] inp) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i : inp)
        {
            intList.add(i);
        }
        return intList;
    }
}
