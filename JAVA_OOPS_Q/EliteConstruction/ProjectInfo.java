package EliteConstruction;

import java.time.*;

public class ProjectInfo {
    
    private String projectId;
    private String constructionType;
    private int totalSquareFeet;
    private LocalDate dateOfRegistration;
    private LocalDate dateOfCompletion;
    
    public ProjectInfo() {
    }

    public ProjectInfo(String projectId, String constructionType, int totalSquareFeet, LocalDate dateOfRegistration,
            LocalDate dateOfCompletion) {
        this.projectId = projectId;
        this.constructionType = constructionType;
        this.totalSquareFeet = totalSquareFeet;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfCompletion = dateOfCompletion;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
    }

    public int getTotalSquareFeet() {
        return totalSquareFeet;
    }

    public void setTotalSquareFeet(int totalSquareFeet) {
        this.totalSquareFeet = totalSquareFeet;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public LocalDate getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(LocalDate dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }
    
    public double calculateAmountTobePaid(){
        double cost =0;
        if(totalSquareFeet <=0){
            return -1;
        }
        if(constructionType.equalsIgnoreCase("WoodFrame")){
            cost = 1200*totalSquareFeet;
        }else if(constructionType.equalsIgnoreCase("LightGaugeSteel")){
            cost = 850*totalSquareFeet;
        }else if(constructionType.equalsIgnoreCase("SteelFrame")){
            cost = 900*totalSquareFeet;
        }else if(constructionType.equalsIgnoreCase("ConcreteFrame")){
            cost = 750*totalSquareFeet;
        }else if(constructionType.equalsIgnoreCase("PreEngineered")){
            cost = 1300*totalSquareFeet;
        }else{
            return -1;
        }
        return cost;
    } 
}
