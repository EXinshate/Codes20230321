public class Test2 {
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 6, 7, 22};
        int max = getmax(arr);
        System.out.println(max);
    }
    public static int getmax(int[] arr){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
