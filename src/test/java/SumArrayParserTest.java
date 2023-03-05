import org.example.SumArrayParser;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SumArrayParserTest {
    @Test
    public void findTwoSumsTest() {
        SumArrayParser sumArrayParser = new SumArrayParser();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        Integer[] expected1 = {0, 1};
        Integer[] result1 = sumArrayParser.findTwoSums(nums1, target1);
        assertArrayEquals(expected1, result1);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        Integer[] expected2 = {1, 2};
        Integer[] result2 = sumArrayParser.findTwoSums(nums2, target2);
        assertArrayEquals(expected2, result2);

        int[] nums3 = {3, 3};
        int target3 = 6;
        Integer[] expected3 = {0, 1};
        Integer[] result3 = sumArrayParser.findTwoSums(nums3, target3);
        assertArrayEquals(expected3, result3);

        int[] nums4 = {-3, 4, 3, 90};
        int target4 = 0;
        Integer[] expected4 = {0, 2};
        Integer[] result4 = sumArrayParser.findTwoSums(nums4, target4);
        assertArrayEquals(expected4, result4);

        int[] nums5 = {};
        int target5 = 5;
        Integer[] expected5 = {};
        Integer[] result5 = sumArrayParser.findTwoSums(nums5, target5);
        assertArrayEquals(expected5, result5);
    }
}
