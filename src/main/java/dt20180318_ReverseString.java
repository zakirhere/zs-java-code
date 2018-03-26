import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

public class dt20180318_ReverseString {

    @Test
    public void testReverseString() {
        Assert.assertEquals(reverseWords("heya!"), "ayeh!");
        Assert.assertEquals(reverseWords("heya! how"), "ayeh! woh");
        Assert.assertEquals(reverseWords("heya! h@w"), "ayeh! w@h");
        Assert.assertEquals(reverseWords("l@vish"), "h@sivl");
        Assert.assertEquals(reverseWords("heya! h@wa"), "ayeh! a@wh");
        Assert.assertEquals(reverseStringOnlyWords("reversed is string this"), "this string is reversed");
        Assert.assertEquals(reverseWords("looc gnirts eulav"), "cool string value");
        Assert.assertEquals(reverseWords("hey, you there"), "yeh, uoy ereht");
    }

    // Reverse the words
    private String reverseStringOnlyWords(String inputString) {
        String[] allWords = inputString.split(" ");
        String res = "";
        for (int i = allWords.length - 1; i >= 0; i--) {
            res += allWords[i] + " ";
        }
        return res.trim();
    }

    // Reverse each characters in the word only
    private String reverseWords(String inputString) {
        String[] allWords = inputString.split(" ");
        String res = "";
        for (String word : allWords) {
            char[] allLetters = word.toCharArray();
            int strLen = allLetters.length;
            int j = strLen - 1;
            for (int i = strLen - 1; i >= strLen / 2; i--) {
                Pattern r = Pattern.compile("\\w");
                String ch1 = Character.toString(allLetters[i]);
                String ch2 = Character.toString(allLetters[j - i]);
                if (r.matcher(ch1).matches() && r.matcher(ch2).matches()) {
                    char temp = allLetters[j - i];
                    allLetters[j - i] = allLetters[i];
                    allLetters[i] = temp;
                } else if(!r.matcher(ch2).matches()) {
                    i++;
                    j++;
                }
                else {
                    j--;
                }
            }
            res += (new String(allLetters)) + " ";
        }
        return res.trim();
    }
}
