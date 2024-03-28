package FeeInsights;
import java.util.regex.*;

public class Transaction {
    private String mobileNumber;
    private String bankName;
    private String ifscCode;
    private String platform;
    private double amount;
    
    public Transaction() {
    }

    public Transaction(String mobileNumber, String bankName, String ifscCode, String platform, double amount) {
        this.mobileNumber = mobileNumber;
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.platform = platform;
        this.amount = amount;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public double calculatePlatformFee(){
        Pattern p = Pattern.compile("^[A-Z]{4}[A-Z0-9]{7}$");
        Matcher m = p.matcher(ifscCode);
        double fee =0;
        if(!m.matches()){
            return -1;
        }
        
        if(platform.equalsIgnoreCase("Gpay")){
            if(amount>0 && amount<=10000){
                    fee = (amount*2)/100;
            }else if( amount >10000 && amount <=50000){
                fee = (amount*5)/100;
            }else if(amount >50000 && amount <=100000){
                fee = (amount*8)/100;
            }else{
                return -1;
            }
        }else if(platform.equalsIgnoreCase("PayTM")){
                if(amount>0 && amount<=10000){
                        fee = (amount*1)/100;
                }else if( amount >10000 && amount <=50000){
                        fee = (amount*3)/100;
                }else if(amount >50000 && amount <=100000){
                        fee = (amount*6)/100;
                }else{
                        return -1;
                }
        }else if(platform.equalsIgnoreCase("PhonePe")){
                if(amount>0 && amount<=10000){
                    fee = (amount*3)/100;
                }else if( amount >10000 && amount <=50000){
                    fee = (amount*4)/100;
                }else if(amount >50000 && amount <=100000){
                    fee = (amount*7)/100;
                }else{
                    return -1;
                }
        }else{
            return -1;
        }
        return fee;
    }
    
}
