public class Lock{
    private String lockModel;
    private int codeLength;
    private int[] code;
    private String lockState;
    
    public Lock() {
    }

    public Lock(String lockModel, int codeLength, int[] code, String lockState) {
        this.lockModel = lockModel;
        this.codeLength = codeLength;
        this.code = code;
        this.lockState = lockState;
    }

    public String getLockModel() {
        return lockModel;
    }

    public void setLockModel(String lockModel) {
        this.lockModel = lockModel;
    }

    public int getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(int codeLength) {
        this.codeLength = codeLength;
    }

    public int[] getCode() {
        return code;
    }

    public void setCode(int[] code) {
        this.code = code;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String enterCodeToUnlock(int[] codeAttempts){
        int count =0;
        if(lockState.equalsIgnoreCase("Lock")){

        
            if(codeAttempts.length == code.length){
                for(int i =0;i<code.length;i++){
                    if(codeAttempts[i] == code[i]){
                        count++;
                    }
                }
                if(count == code.length){
                    return "Code correct. Lock is now unlocked";
                }else{
                    return "Incorrect Code. Please try again";
                }
            }else{
                return "Incorrect Code. Please try again";
            }
        }else{
            return "Lock is already unlocked.";
        }
    }
}