public class MergeSort {
    public static void MergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=(si+ei)/2;
        MergeSort(arr,si,mid);//left part
        MergeSort(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si; //iterator for left part
        int j=mid+1;//iterator for right part
        int k=0; //iterator for temp array
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid)
        {    
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei)
        {    
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(int x=0,y=si;x<temp.length;x++,y++)
        {
            arr[y]=temp[x];
        }
    } 
    public static void main(String[] args)  {
        int ar[]={5,7,4,3,1,2,6};
        MergeSort(ar,0,ar.length-1);
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
  }