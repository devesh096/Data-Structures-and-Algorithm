//User function Template for Java

class Solution{
    long gcd(long n, long m){
        if(m == 0)
            return n;
        return gcd(m, n%m);
    }

    List<Long> minimumSquares(long L, long B)
    {
        long x = gcd(L, B);
        List<Long> ans = new ArrayList<>();
        ans.add((L*B)/(x*x));
        ans.add(x);
        return ans;
    }
}
