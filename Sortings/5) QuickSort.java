public class QuickSort {
    public static void quickSort(int arr[],int si,int ei)
    {
        if(si>=ei)
            return;
        int piIdx=partition(arr,si,ei);//pivet index
        quickSort(arr,si,piIdx-1);//left
        quickSort(arr,piIdx,ei);//right
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivet=arr[ei];//last element
        int i=si-1;//make place for elemet smaller than pivet
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivet)
            {
                i++;
                int temp=arr[j]; //swap
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivet;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args)  {
        int ar[]={4,5,3,2,1,6,6};
        quickSort(ar,0,ar.length-1);
        for(int i=0;i<ar.length;i++)
        {
          System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
  }
