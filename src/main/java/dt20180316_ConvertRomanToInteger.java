import org.testng.Assert;
import org.testng.annotations.Test;

public class dt20180316_ConvertRomanToInteger {

    @Test
    public void testRomanToIntConversion() {
        Assert.assertEquals(romanToInt("I"), 1);
        Assert.assertEquals(romanToInt("II"), 2);
        Assert.assertEquals(romanToInt("V"), 5);
        Assert.assertEquals(romanToInt("IV"), 4);
        Assert.assertEquals(romanToInt("VII"), 7);
        Assert.assertEquals(romanToInt("IX"), 9);
        Assert.assertEquals(romanToInt("XIII"), 13);
        Assert.assertEquals(romanToInt("XIV"), 14);
        Assert.assertEquals(romanToInt("LXIV"), 64);
        Assert.assertEquals(romanToInt("CL"), 150);
        Assert.assertEquals(romanToInt("MCMIV"), 1904);
    }

    public static int romanToInt(String romanValue) {
        char[] chars = romanValue.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            int mappedDigit = romanMapper(chars[i]);
            if ((i + 1 < chars.length) && mappedDigit < romanMapper(chars[i + 1])) {
                res -= mappedDigit;
            } else {
                res += mappedDigit;
            }

        }
        return res;
    }

    public static int romanMapper(char romanLetter) {
        switch (romanLetter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
