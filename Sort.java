public class Sort{

      public static void main(String[] args)
    {
        
        int arr[]={1,2,3,4,10,6};
        int n=arr.length;
    
    for(int i=1;i<n-1;){
        if(arr[i]>arr[i-1]&&arr[i]<arr[i+1]){
           i++;
             
        }
    }
    
            System.out.println("Not sorted");
        
    
    }
}

}