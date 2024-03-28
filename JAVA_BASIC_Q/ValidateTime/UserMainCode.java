package ValidateTime;
public class UserMainCode {
    public static int validateTime(String str){
        String s = str.replaceAll(" ",":");
        
        String hours = s.split(":")[0];
        
        String min = s.split(":")[1];
        
        String f = s.split(":")[2];
        

        if(hours.length() == 2){
            
            int value = Integer.parseInt(hours);
            if(value >=1 && value<=12){
                
                if(min.length() == 2){
                    
                    int mvalue = Integer.parseInt(min);
                    if(mvalue>= 1 && mvalue <=59){
                        
                        if(f.equalsIgnoreCase("am") || f.equalsIgnoreCase("pm")){
                            return 1;
                        }else{
                            return -1;
                        }
                    }else{
                        return -1;
                    }
                }else{
                    return -1;
                }
            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
        

}
