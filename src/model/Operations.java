package model;

public class Operations{

  public static int totalHomeCenter(int[] amount, int[] ahomecenter, String location, String work, int OBRA_NEGRA, int OBRA_BLANCA, int DELIVERY_CENTER, int DELIVERY_NOS, int PINTURA){
    
	  int totalPayHomeCenter = 0;
    
    int totalMaterialsHomeCenter = 0;
    
    for (int i = 0;i < ahomecenter.length ;i++ ) {
      totalMaterialsHomeCenter += (amount[i] * ahomecenter[i]);
    }
    
    if (location.equals("Centro") && work.equals("Obra negra")) {
    	
      totalPayHomeCenter = totalMaterialsHomeCenter + OBRA_NEGRA + DELIVERY_CENTER + PINTURA;
      
    } else if (location.equals("Centro") && work.equals("Obra blanca")) {
    	
      totalPayHomeCenter = totalMaterialsHomeCenter + OBRA_BLANCA + DELIVERY_CENTER + PINTURA;
      
    } else if (location.equals("Sur") || location.equals("Norte") && work.equals("Obra negra")) {
    	
      totalPayHomeCenter = totalMaterialsHomeCenter + OBRA_NEGRA + DELIVERY_NOS + PINTURA;
      
    } else if (location.equals("Sur") || location.equals("Norte") && work.equals("Obra blanca")) {
    	
      totalPayHomeCenter = totalMaterialsHomeCenter + OBRA_BLANCA + DELIVERY_NOS + PINTURA;
      
    }
    
    return totalPayHomeCenter;
    
  }

  //En este metodo se calcula cuanto es el total a pagar si se compra todo en la Ferreteria del Centro
  public static int totalCenter(int[] amount, int[] acenter, String location, String work, int OBRA_NEGRA, int OBRA_BLANCA, int DELIVERY_CENTER, int DELIVERY_NOS, int PINTURA){
	  int totalPayCenter = 0;
    
	  int totalMaterialsCenter = 0;
    
	  for (int i = 0;i < acenter.length ;i++ ) {
      
		  totalMaterialsCenter += (amount[i] * acenter[i]);
    
	  }
    
	  if (location.equals("Centro") && work.equals("Obra negra")) {
      
		  totalPayCenter = totalMaterialsCenter + OBRA_NEGRA + DELIVERY_CENTER + PINTURA;
    
	  } else if (location.equals("Centro") && work.equals("Obra blanca")) {
		  
      totalPayCenter = totalMaterialsCenter + OBRA_BLANCA + DELIVERY_CENTER + PINTURA;
      
    } else if (location.equals("Sur") || location.equals("Norte") && work.equals("Obra negra")) {
    	
      totalPayCenter = totalMaterialsCenter + OBRA_NEGRA + DELIVERY_NOS + PINTURA;
      
    } else if (location.equals("Sur") || location.equals("Norte") && work.equals("Obra blanca")) {
    	
      totalPayCenter = totalMaterialsCenter + OBRA_BLANCA + DELIVERY_NOS + PINTURA;
      
    } return totalPayCenter;
    
  }

  //En este metodo se calcula cuanto es el total a pagar si se compra todo en la Ferreteria del Barrio
  public static int totalNeighborhood(int[] amount, int[] aneighborhood, String location, String work, int OBRA_NEGRA, int OBRA_BLANCA, int DELIVERY_CENTER, int DELIVERY_NOS, int PINTURA){
   
	  int totalPayNeighborhood = 0;
    
	  int totalMaterialsNeighborhood = 0;
    
	  for (int i = 0;i < aneighborhood.length ;i++ ) {
      
		  totalMaterialsNeighborhood += (amount[i] * aneighborhood[i]);
    
	  }
    
	  if (location.equals("Centro") && work.equals("Obra negra")) {
      
		  totalPayNeighborhood = totalMaterialsNeighborhood + OBRA_NEGRA + DELIVERY_CENTER + PINTURA;
    
	  } else if (location.equals("Centro") && work.equals("Obra blanca")) {
    	
      totalPayNeighborhood = totalMaterialsNeighborhood + OBRA_BLANCA + DELIVERY_CENTER + PINTURA;
    
	  } else if (location.equals("Sur") || location.equals("Norte") && work.equals("Obra negra")) {
		  
      totalPayNeighborhood = totalMaterialsNeighborhood + OBRA_NEGRA + DELIVERY_NOS + PINTURA;
      
    } else if (location.equals("Sur") || location.equals("Norte") && work.equals("Obra blanca")) {
    	
      totalPayNeighborhood = totalMaterialsNeighborhood + OBRA_BLANCA + DELIVERY_NOS + PINTURA;
      
    }
	  
    return totalPayNeighborhood;
    
  }
  
}
