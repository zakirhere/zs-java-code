import org.testng.Assert;
import org.testng.annotations.Test;

public class dt20180318_ReverseString {

    @Test
    public void testReverseString() {
        Assert.assertEquals(reverseStringOnlyWords("reversed is string this"), "this string is reversed");
        Assert.assertEquals(reverseWords("looc gnirts eulav"), "cool string value");
    }

    // Reverse the words
    private String reverseStringOnlyWords(String inputString) {
        String[] allWords = inputString.split(" ");
        String res = "";
        for (int i = allWords.length - 1; i >=0; i--) {
            res += allWords[i] + " ";
        }
        return res.trim();
    }

    // Reverse each characters in the word only
    private String reverseWords(String inputString) {
        String[] allWords = inputString.split(" ");
        String res = "";
        for (String word: allWords) {
            char[] allLetters = word.toCharArray();
            String reversedWord = "";
            int j = 0;
            for(int i=allLetters.length - 1; i >=0; i--) {
                reversedWord += allLetters[i];
            }
            res += reversedWord + " ";
        }
        return res.trim();
    }
}
