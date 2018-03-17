import org.testng.Assert;
import org.testng.annotations.Test;

public class dt20180316_CamelCase {

    @Test
    public void testRomanToIntConversion() {
        Assert.assertEquals(camelcase("myNameIsZakir"), 4);
        Assert.assertEquals(camelcase("m"), 1);
        Assert.assertEquals(camelcase("mAB"), 3);
    }

    static int camelcase(String s) {
        int res = 0;
        if(s.length() > 0) res++;
        for (char c : s.toCharArray()) {
            if(Character.toUpperCase(c) == c) {
                res++;
            }
        }
        return res;
    }
}
