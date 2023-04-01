public class BubbleSort {
    public static void sorting(int arr[]){
      int count=0;
      for(int i=0;i<arr.length-2;i++)
        {
          count=0;
          for(int j=0;j<arr.length-i-1;j++)
            {
               if(arr[j]>arr[j+1])
               {
                 int temp=arr[j+1];
                 arr[j+1]=arr[j];
                 arr[j]=temp;   
                 count++;
               }
            }
          if(count==0)
            break;
        }
    }
    public static void main(String[] args)  {
        int a[]={5,4,8,0,8,1,2,3};
        sorting(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    } 
}