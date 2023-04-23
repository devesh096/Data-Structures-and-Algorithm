class Solution {
    public static int minimumNumber(int n, int[] arr) {
        // code here
        int gcd=0;
        for(int i=0;i<n;i++){
            gcd=gcd(gcd,arr[i]);
        }
        return gcd;
    }
    public static int gcd(int a,int b)
    {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}
