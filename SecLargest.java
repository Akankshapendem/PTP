public class SecLargest
{
    public static void main(String[] args){
        int temp;
        int arr[]={1,3,7,5,8};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1]){
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
            }
        }
          System.out.println("Second largest element :"+arr[n-2]);
    }
}