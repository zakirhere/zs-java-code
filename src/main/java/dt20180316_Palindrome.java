import org.testng.Assert;
import org.testng.annotations.Test;

public class dt20180316_Palindrome {

    @Test
    public void testRomanToIntConversion() {
        Assert.assertEquals(isPalindrome("abba"), "YES");
        Assert.assertEquals(isPalindrome("abbaa"), "NO");
        Assert.assertEquals(isPalindrome("a1a"), "YES");
        Assert.assertEquals(isPalindrome("aba"), "YES");
        Assert.assertEquals(isPalindrome(null), "NO");
        Assert.assertEquals(isPalindrome("a"), "NO");
        Assert.assertEquals(isPalindrome("121"), "YES");
    }

    public String isPalindrome(String str) {
        if(str == null || str.length() == 1) return "NO";
        char[] chars = str.toCharArray();
        int strLen = chars.length;
        for (int i=0; i<strLen/2; i++) {
            if(chars[i] != chars[strLen - 1 - i]) {
                return "NO";
            }
        }
        return "YES";
    }

}
