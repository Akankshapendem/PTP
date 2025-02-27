class Divisor{
    public static int sumOfDivisors(int n) {
        // code here
        int sum=0;
        
        for(int i=1;i<=n;i++){
            int sumDiv=0;
            for(int j=i;j<=i;j++){
                if(i%j==0){
                sumDiv+=j;
            }
        }
        
         sum+=sumDiv;
        }
    
    
    return sum;
}
}  
