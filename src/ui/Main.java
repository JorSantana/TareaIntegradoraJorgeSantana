package ui;
import model.*;
import java.util.Scanner;
public class Main{

  private final static int OBRA_NEGRA = 1300000;
  private final static int OBRA_BLANCA = 2600000;
  private final static int PINTURA = 980000;
  private final static int DELIVERY_CENTER = 50000;
  private final static int DELIVERY_NOS = 120000;


  public static int getProducts(Scanner sc){
    int product = 0;
    System.out.println("Digite la cantidad de productos que va a ingresar");
    product = sc.nextInt();
    return product;
  }

  public static String[] getProduct(Scanner sc, int product){
    String material;
    String[] products = new String[product];
    for (int i = 0;i < product ;i++ ) {
      System.out.println("Ingrese el material");
      material = sc.next();
      products[i] = material;
      sc.nextLine();
    }
    return products;
  }


  public static int[] getQuantity(Scanner sc, int product){
    int quantity = 0;
    int[] amount = new int[product];
    for (int i = 0;i < product ;i++ ) {
      System.out.println("Digite la cantidad");
      quantity = sc.nextInt();
      amount[i] = quantity;
    }
    return amount;
  }


  public static int[] priceHomeCenter(Scanner sc, int product){
    int homecenter = 0;
    int[] ahomecenter = new int[product];
    for (int i = 0;i < product ;i++ ) {
      System.out.println("Ingrese el precio del material en HomeCenter");
      homecenter = sc.nextInt();
      ahomecenter[i] = homecenter;
    }
    return ahomecenter;
  }


  public static int[] priceCenter(Scanner sc, int product){
    int center = 0;
    int[] acenter = new int[product];
    for (int i = 0;i < product ;i++ ) {
      System.out.println("Ingrese el precio del material en la Ferreteria del Centro");
      center = sc.nextInt();
      acenter[i] = center;
    }
    return acenter;
  }


  public static int[] priceNeighborhood(Scanner sc, int product){
    int neighborhood = 0;
    int[] aneighborhood = new int[product];
    for (int i = 0;i < product ;i++ ) {
      System.out.println("Ingrese el precio del material en la Ferreteria del Barrio");
      neighborhood = sc.nextInt();
      aneighborhood[i] = neighborhood;
    }
    return aneighborhood;
  }


  public static String choiceLocation(Scanner sc){
    String location;
    System.out.println("Digite si el inmueble está ubicado en el Centro, Sur o Norte");
    location = sc.next();
    return location;
  }


  public static String choiceWork(Scanner sc){
    String work;
    System.out.println("Digite si es en obra negra u obra blanca");
    work = sc.next();
    return work;
  }


  public static void showData(Scanner sc){
    int product = getProducts(sc);
    String[] products = getProduct(sc, product);
    int[] amount = getQuantity(sc, product);
    int[] ahomecenter = priceHomeCenter(sc, product);
    int[] acenter = priceCenter(sc, product);
    int[] aneighborhood = priceNeighborhood(sc, product);
    String location = choiceLocation(sc);
    String work = choiceWork(sc);
    System.out.println("El total a pagar en HomeCenter es de: " + Operations.totalHomeCenter(amount, ahomecenter, location, work, OBRA_NEGRA, OBRA_BLANCA, DELIVERY_CENTER, DELIVERY_NOS, PINTURA));
    System.out.println("El total a pagar en la Ferreteria del Centro es de: " + Operations.totalCenter(amount, acenter, location, work, OBRA_NEGRA, OBRA_BLANCA, DELIVERY_CENTER, DELIVERY_NOS, PINTURA));
    System.out.println("El total a pagar en la Ferreteria del Barrio es de: " + Operations.totalNeighborhood(amount, aneighborhood, location, work, OBRA_NEGRA, OBRA_BLANCA, DELIVERY_CENTER, DELIVERY_NOS, PINTURA));
    int position = 0;
    for (int i = 0;i < products.length ;i++ ) {
      if (ahomecenter[i] < acenter[i] && ahomecenter[i] < aneighborhood[i]) {
        position = i;
        System.out.println("Es mejor comprar el producto " + products[position] + " en HomeCenter ya que cuesta: " + ahomecenter[position]);
      }
      else if (acenter[i] < ahomecenter[i] && acenter[i] < aneighborhood[i]) {
        position = i;
        System.out.println("Es mejor comprar el producto " + products[position] + " en la Ferreteria del Centro ya que cuesta: " + acenter[position]);
      }
      else if (aneighborhood[i] < acenter[i] && aneighborhood[i] < ahomecenter[i]) {
        position = i;
        System.out.println("Es mejor comprar el producto " + products[position] + " en la Ferreteria del Barrio ya que cuesta: " + aneighborhood[position]);
      }
    }
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    showData(sc);
  }
}
