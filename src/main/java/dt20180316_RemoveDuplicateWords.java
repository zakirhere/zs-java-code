import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dt20180316_RemoveDuplicateWords {

    @Test
    public void testRomanToIntConversion() {
        Assert.assertEquals(removeDuplicateWords("Hi hi hello hello hello"), "Hi hi hello");
    }

    public String removeDuplicateWords(String str) {
        Set<String> newStr = new HashSet<String>();
        String[] strArr = new String[0];

        strArr = str.split(" ");
        for(int i=0; i< strArr.length; i++) {
            newStr.add(strArr[i]);
        }
        return newStr.toString().join("");

    }
}
