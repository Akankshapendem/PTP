class LcmAndGcd2 { // Worst complexity
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int gcdValue=gcd(a,b);
        int lcm=Math.abs(a*b)/gcdValue;
        return new int[]{lcm,gcdValue};
    }
    public static int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}