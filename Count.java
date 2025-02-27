class Count {
    static int evenlyDivides(int n) { 
        int c=0;
        int q=n;
        while(q>0) 
        {
           
            int rem=q%10;
            if(rem!=0 &&n%rem==0)
            {
                c++;
            }
            q=q/10;
            
        }
        return c;
        
        
    }
    
}