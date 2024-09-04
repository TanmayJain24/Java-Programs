public class QuickSort {
    public static void quickSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //last element
        int pIDx = partition(arr, si, ei);
        quickSort(arr, si, pIDx-1);//left part
        quickSort(arr, pIDx+1, ei);//right part
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1; //to make place for elements less than pivot
        for(int j=si; j<ei; j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];// dont write pivot = arr[i]
        arr[i] = temp;
        return i;
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5,1,7,4};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
