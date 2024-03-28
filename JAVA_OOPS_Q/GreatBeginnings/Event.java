package GreatBeginnings;
import java.util.Date;

public class Event {
    private String eventId;
    private String eventName;
    private Date dateOfRegistration;
    private Date dateOfEvent;
    private double payment;
    
    public Event() {
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Event(String eventId, String eventName, Date dateOfRegistration, Date dateOfEvent, double payment) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.dateOfRegistration = dateOfRegistration;
        this.dateOfEvent = dateOfEvent;
        this.payment = payment;
    }

    public double calculateAmountTobePaid(){
        double totalCost =0;
        if(payment <=0){
            return -1;
        }
        if(eventName.equalsIgnoreCase("Weddings")){
            totalCost = payment - payment*0.12;
        }else if(eventName.equalsIgnoreCase("Charity")){
            totalCost = payment - payment*0.09;
        }else if(eventName.equalsIgnoreCase("ProductLaunch")){
            totalCost = payment - payment*0.15;
        }else if(eventName.equalsIgnoreCase("Exhibitions")){
            totalCost = payment - payment*0.05;
        }else if(eventName.equalsIgnoreCase("Workshops")){
            totalCost = payment - payment*0.07;
        }else{
            return -1;
        }
        String.format("%.1f", totalCost);
        return totalCost;
    }
}
