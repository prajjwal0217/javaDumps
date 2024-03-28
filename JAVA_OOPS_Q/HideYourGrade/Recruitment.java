package HideYourGrade;
import java.util.Date;

public class Recruitment{
    private String recruitmentId;
    private String companyName;
    private String jobTitle;
    private Date dateOfPost;
    
    public Recruitment() {
    }

    public Recruitment(String recruitmentId, String companyName, String jobTitle, Date dateOfPost) {
        this.recruitmentId = recruitmentId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.dateOfPost = dateOfPost;
    }

    public String getRecruitmentId() {
        return recruitmentId;
    }

    public void setRecruitmentId(String recruitmentId) {
        this.recruitmentId = recruitmentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(Date dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    public double calculatePackageReceived(){
        double salary =0;
        if(companyName.equalsIgnoreCase("Sandisc")){
            if(jobTitle.equalsIgnoreCase("JuniorSoftwareDeveloper")){
                    salary = 21000+1200;
            }else if(jobTitle.equalsIgnoreCase("SoftwareDeveloper")){
                salary = 27000+1450;
            }else if(jobTitle.equalsIgnoreCase("TechnicalHead")){
                salary = 40000+1600;
            }else if(jobTitle.equalsIgnoreCase("ProjectManager")){
                salary = 45000+1750;
            }else if(jobTitle.equalsIgnoreCase("ProductManager")){
                salary = 55000+1800;
            }else{
                return -1;
            }
        }else{
            return -1;
        }
        
        return salary;
    }

    
}