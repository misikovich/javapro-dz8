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
}
