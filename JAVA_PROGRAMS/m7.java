public class m7 {
    
    static int max(int... a){

        if(a.length == 0) return Integer.MIN_VALUE;
        int max = a[0];

        for(int i =0;i<a.length;i++){
            if(a[i]>max) max = a[i];
        }
        return max;


    }
    static int sum(int... a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s +=a[i];
        }
        return s;
    }

    static double discount(double... price){
        
        double total_price =0;
        double discountPrice = 0;
        
        for(int i=0;i<price.length;i++){
            total_price += price[i];
        }
        if(total_price<500){discountPrice=total_price-total_price*0.1;}
        else if(total_price>500 && total_price<1000){discountPrice=total_price-total_price*0.15;}
        else {discountPrice=total_price-total_price*0.2;}

        return discountPrice;

    }
    public static void main(String[] args) {

        System.out.println(max());
        System.out.println(max(1,2));
        
        System.out.println(sum(1));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,4,5,6));
        
        System.out.println(discount(100,23,43,565));
        System.out.println(sum(1,2));

        
    }
    
}
