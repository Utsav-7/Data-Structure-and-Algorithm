public class BinarySearch {
    public static boolean bSearch(int arr[],int start,int end,int key){
        if (end >= start) {
            int mid = start + (end - start) / 2;
            // If the element is present at the middle itself
            if (arr[mid] == key)
                return true;
 
            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > key)
                return bSearch(arr, start, mid - 1, key);
            else     // Else the element can only be present in right subarray                        
                return bSearch(arr, mid + 1, end, key);
        }
        // We reach here when element is not present
        // in array
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,21,43,3,4,67,2,1,56,98,6};
        int key=1;
        System.out.println(bSearch(arr,0,arr.length,key));
    }
}
