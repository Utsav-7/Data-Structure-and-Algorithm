public class SelectionSort {
    public static void sorting(int arr[])
    {
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.length-1;i++)
        {
          min=i;
          for(int j=i+1;j<arr.length;j++)
            {
              if(arr[min]>arr[j])
              {
                min=j;
              }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args)  {
        int a[]={4,5,8,9,5,1};
        sorting(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}