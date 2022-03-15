import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        
		   System.out.println("Enter Input with Format = {\"ItemName$$##ItemPrice$$##ItemQuantity\"}: ");
		   String sub = sc.nextLine();
		 
		   //"ItemName$$##ItemPrice$$##ItemQuantity"//
		   //Bread$$##12.5$$##10
		   //Mobile Phone$$##599$$##2
	        ItemSeparator itemData = new ItemSeparator(sub);
	        itemData.parseInput();
	        
	        System.out.println("Item Name: " + itemData.getName());
	        System.out.println("Item Price: " + itemData.getPrice());
	        System.out.println("Item Quantity: " + itemData.getQuantity());
		
	}

}