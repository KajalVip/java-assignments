public class LeastValueInArray {
    static void main(String[] args) {
        int[] arr={50,10,1,67,3};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is "+min);
    }
}
