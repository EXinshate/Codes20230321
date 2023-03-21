public class Test3 {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6, 7, 78, 72};
        boolean flag = contains(arr, 72);
        System.out.println(flag);

    }
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
