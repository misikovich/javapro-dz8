import org.example.PalindromeParser;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeParserTest {

    @Test
    public void isPalindromeTest(){
        String truePalindrome = "A man, a plan, a canal: Panama";
        String falsePalindrome = "race a car";
        String somethingPalindrome = " ";

        PalindromeParser parser = new PalindromeParser();

        Assert.assertTrue(parser.isPalindrome(truePalindrome));
        Assert.assertFalse(parser.isPalindrome(falsePalindrome));
        Assert.assertTrue(parser.isPalindrome(somethingPalindrome));
    }

    @Test
    public void isPalindromeV2Test(){
        String truePalindrome = "A man, a plan, a canal: Panama";
        String falsePalindrome = "race a car";
        String somethingPalindrome = " ";

        PalindromeParser parser = new PalindromeParser();

        Assert.assertTrue(parser.isPalindromeV2(truePalindrome));
        Assert.assertFalse(parser.isPalindromeV2(falsePalindrome));
        Assert.assertTrue(parser.isPalindromeV2(somethingPalindrome));
    }

    @Test
    public void isPalindromeV3Test(){
        String truePalindrome = "A man, a plan, a canal: Panama";
        String falsePalindrome = "race a car";
        String somethingPalindrome = " ";

        PalindromeParser parser = new PalindromeParser();

        Assert.assertTrue(parser.isPalindromeV3(truePalindrome));
        Assert.assertFalse(parser.isPalindromeV3(falsePalindrome));
        Assert.assertTrue(parser.isPalindromeV3(somethingPalindrome));
    }
}
