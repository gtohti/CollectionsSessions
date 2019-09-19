package day44;
import java.util.*;
public class HouseCompany {
public static void main(String[] args) {
	
	House h1 = new House("Single House", 3, 380000);
	House h2 = new House("TwonHouse", 4, 270000);
	House h3 = new House("Cando", 3, 240000);
//	h1.setBedroom(6);
//	h2.setPrice(250000);
  List<House> house = new ArrayList<>();
  house.add(h1);
  house.add(h2);
  house.add(h3);
  
  for (House each: house) {
	  System.out.println(each);
	  System.out.println("************************");
  }
	System.out.println(h1);
	System.out.println(h1.getBedroom());
	System.out.println(h2.getPrice());
	System.out.println(h3.getType());
}
}
