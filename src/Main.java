public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 33, 44, 55};
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ ", ");
        }
    }
}