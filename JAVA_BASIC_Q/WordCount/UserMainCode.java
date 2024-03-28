public class UserMainCode {
    public static int countWord(String[] arr,int a){
        
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i].length() == a){
                count++;
            } 
        }
        return count;
    }
}
