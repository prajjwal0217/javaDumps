package ReadySetRecruit;
public class AnalystInfo {
    private String analystId;
    private String analystName;
    private String cyberSecurityType;
    private String jobTitle;
    
    public AnalystInfo() {
    }

    public AnalystInfo(String analystId, String analystName, String cyberSecurityType, String jobTitle) {
        this.analystId = analystId;
        this.analystName = analystName;
        this.cyberSecurityType = cyberSecurityType;
        this.jobTitle = jobTitle;
    }

    public String getAnalystId() {
        return analystId;
    }

    public void setAnalystId(String analystId) {
        this.analystId = analystId;
    }

    public String getAnalystName() {
        return analystName;
    }

    public void setAnalystName(String analystName) {
        this.analystName = analystName;
    }

    public String getCyberSecurityType() {
        return cyberSecurityType;
    }

    public void setCyberSecurityType(String cyberSecurityType) {
        this.cyberSecurityType = cyberSecurityType;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double calculateAnalystSalary(){
        
        if(!(jobTitle.equalsIgnoreCase("SOCAnalyst") || jobTitle.equalsIgnoreCase("NetworkSecurity"))){
            return -1;
        }
        if(cyberSecurityType.equalsIgnoreCase("cloud")){
            return 45000;
        }else  if(cyberSecurityType.equalsIgnoreCase("network")){
            return 65000;
        }else  if(cyberSecurityType.equalsIgnoreCase("application")){
            return 85000;
        }else  if(cyberSecurityType.equalsIgnoreCase("critical")){
            return 95000;
        }else{
            return -1;
        }
    } 
     
}
