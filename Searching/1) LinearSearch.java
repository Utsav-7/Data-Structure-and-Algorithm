public class LinearSearch{  // T.C = O(n)
    public static boolean lSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={10,32,43,54,23,65,7,4,2,1};
        int key=605;
        System.out.println(lSearch(arr,key));
    }
}
