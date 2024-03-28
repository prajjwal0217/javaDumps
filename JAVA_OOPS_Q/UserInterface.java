public class UserInterface {
    public static Lock extractDetails(String lockDetails){
        String info[] = lockDetails.split(":");
        int lastIndex = info.length;
        int size = Integer.parseInt(info[1]);
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(info[i+2]);
        }
        Lock obj = new Lock(info[0],size,arr,info[lastIndex-1]);
        return obj;
    }
}
