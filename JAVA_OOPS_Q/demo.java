public class demo {
   if(quantity <=0 || price <=0){
    return -1;
   }
   double totalCost =0;
   if(carvingType.equals("Wood Carving")){
        totalCost = quantity*(price +(price*0.02));
   }else if(carvingType.equals("Ceramic Figurine")){
    totalCost = quantity*(price +(price*0.05));
   }else if(carvingType.equals("Bronze Sculpture")){
    totalCost = quantity*(price +(price*0.06));
   }else if(carvingType.equals("Stone Carving")){
    totalCost = quantity*(price +(price*0.04));
   }else if(carvingType.equals("Wire Art Sculpture")){
    totalCost = quantity*(price +(price*0.03));
   }else{
    return -1;
   }
}
