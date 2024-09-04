public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }

        //kaam
        int mid = si + (ei-si)/2;//(si+ei)/2
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part 
        merge(arr, si, mid, ei);//merge 
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i = si;//iterator from left part
        int j = mid+1;//iterator from right part
        int k = 0;//iterator from temp arr

        //to merge two arrays into a temporary array
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //right part
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //to copy the temp  to original array
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,5,9,7,1,0,2,4,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}