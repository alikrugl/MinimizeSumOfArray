import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;

public class MinimumSum {
    @Test
    public void basicTests()
    {
        assertEquals( 22, Solution.minSum(new int[]{5,4,2,3}));
        assertEquals(342, Solution.minSum(new int[]{12,6,10,26,3,24}));
        assertEquals( 74, Solution.minSum(new int[]{9,2,8,7,5,4,0,6}));
    }
    @Test
    public void randomTests()
    {
        for (int i = 0; i < 100; i++)
        {
            int[] a = new int[(int)(Math.random() * 200) * 2 + 4];
            for (int j = 0; j < a.length; j++) a[j] = (int)(Math.random() * 201) + 1;
            assertEquals(solution(a), Solution.minSum(a));
        }
    }
    private static int solution(int[] passed)
    {
        Arrays.sort(passed);
        int sum = 0;
        for (int i = 0; i < passed.length/2; i++)
            sum += passed[i] * passed[passed.length-1-i];
        return sum;
    }
}