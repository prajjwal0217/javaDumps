package Cars24;
public class CarInfo {
    private String carId;
    private String carName;
    private String carType;
    private String city;
    
    public CarInfo() {
    }

    public CarInfo(String carId, String carName, String carType, String city) {
        this.carId = carId;
        this.carName = carName;
        this.carType = carType;
        this.city = city;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String checkAvailability(){

        
        if(city.equalsIgnoreCase("New York") || city.equalsIgnoreCase("Denver") || city.equalsIgnoreCase("Los Angels")){

        
            if(carName.equalsIgnoreCase("Nissan")){
                if(carType.equalsIgnoreCase("Sedan")){
                    return "Kicks and $8400.0";
                }else if(carType.equalsIgnoreCase("SUV")){
                    return "Magnite and $10800.0";
                }else if(carType.equalsIgnoreCase("MUV")){
                    return "Terrano and $14400.0";
                }else{
                    return "Not Available";
                }

            }else if(carName.equalsIgnoreCase("Ford")){
                
                if(carType.equalsIgnoreCase("Sedan")){
                    return "Figo and $4802.0";
                }else if(carType.equalsIgnoreCase("SUV")){
                    return "Eco Sport and $9605.0";
                }else if(carType.equalsIgnoreCase("MUV")){
                    return "Endeavour and $21600.0";
                }else{
                    return "Not Available";
                }

            }else{
                return "Not Available";
            }
        }else{
            return "Not Available";
        }
        
    }
    
    
}
