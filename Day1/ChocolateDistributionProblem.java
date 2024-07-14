package Day1;

import java.util.*;
public class ChocolateDistributionProblem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans=Long.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            ans=Math.min(a.get(i+(int)m-1)-a.get(i),ans);
        }
        return ans;
    }
}