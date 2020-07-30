import java.util.Map;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class GroceryList {

private static Scanner scnr;
	
private static Map<String, Double> items = new TreeMap<>();
private static List<String> orderName= new ArrayList<>();
private static List<Double> orderPrices= new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scnr = new Scanner(System.in);
		fillItemsMap();
		printMenu();		
				
		System.out.print("What item would you like to order?");
		String itemName = scnr.nextLine();
		Double itemPrice = items.get(itemName);
		System.out.println("Adding" + itemName + "to cart at $" + itemPrice );
		
		
		
		scnr.close();
	}
		private static void fillItemsMap() {
			items.put("apple", 0.99);
			items.put("banana", 0.59);
			items.put("cauliflower", 1.59);
			items.put("dragonfruit" , 2.19);
			items.put("Elderberry", 1.79);
			items.put("figs", 2.09);
			items.put("grapefruit", 1.99);
			items.put("honeydew", 3.49);
					
		}
		
		private static void printMenu() {
			System.out.println("Item, Price");
			for (Map.Entry<String,Double> entry : items.entrySet())  {
	            System.out.println( ( entry.getKey() + ":\t " +
	                             entry.getValue())); 
		
			}
		
		
		
		
		
	}

}
