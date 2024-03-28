package TheSpiceSensation;
public class Spice {
    private String spiceName;
    private String origin;
    private int spiceRating;
    private String color;
    private int shelfLifeInMonths;
    
    public Spice() {
    }

    public Spice(String spiceName, String origin, int spiceRating, String color, int shelfLifeInMonths) {
        this.spiceName = spiceName;
        this.origin = origin;
        this.spiceRating = spiceRating;
        this.color = color;
        this.shelfLifeInMonths = shelfLifeInMonths;
    }

    public String getSpiceName() {
        return spiceName;
    }

    public void setSpiceName(String spiceName) {
        this.spiceName = spiceName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getSpiceRating() {
        return spiceRating;
    }

    public void setSpiceRating(int spiceRating) {
        this.spiceRating = spiceRating;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getShelfLifeInMonths() {
        return shelfLifeInMonths;
    }

    public void setShelfLifeInMonths(int shelfLifeInMonths) {
        this.shelfLifeInMonths = shelfLifeInMonths;
    }

    public String findSpiceLevel(){

        if(shelfLifeInMonths <=0){
            return "Error";
        }
        if(spiceRating >=1 && spiceRating<4){
            return "Mild";
        }else if(spiceRating>=4 && spiceRating<7){
            return "Medium";
        }else if(spiceRating >=7 && spiceRating<=9){
            return "Hot";
        }else{
            return "Error";
        }
        
    }
    
}
