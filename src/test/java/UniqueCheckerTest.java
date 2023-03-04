import org.example.UniqueChecker;
import org.junit.Assert;
import org.junit.Test;


public class UniqueCheckerTest {

    @Test
    public void hasDuplicatesTest() {
        int[] numSetTrue = {1,2,3,2};
        int[] numSetFalse = {1,2,3,4};

        UniqueChecker checker = new UniqueChecker();
        Assert.assertTrue(checker.hasDuplicates(numSetTrue));
        Assert.assertFalse(checker.hasDuplicates(numSetFalse));
    }
}
