
public class ItemSeparator {
	private final String regex = "\\${2}\\#{2}";
	private String rawInput;
	private String [] parsedString;
	private String itemName;
	private double itemPrice;
	private int itemQuantity;
	
	public ItemSeparator(String rawInput) {
		this.rawInput = rawInput;
	}
	
	public void parseInput() {
	
		if(checkValidInput()){
			parseRawInput();
			if (isDouble(parsedString[1]))
			{
				if(isInt(parsedString[2]))
				{
					itemName = parsedString[0];
					itemPrice = Double.parseDouble(parsedString[1]);
					itemQuantity = Integer.parseInt(parsedString[2]);
				}
				else {
					System.out.println(parsedString[2] + " cannot be parsed into type Int.");
				}
			}
			else {
				System.out.println(parsedString[1] + " cannot be parsed into type Double.");
			}
		}
		else {
			System.out.println(rawInput + " is an invalid input. Required input format is: ItemName$$##ItemPrice$$##ItemQuantity");
		}
		
	}
	
	private boolean checkValidInput() {
		
		if (rawInput.split(regex).length !=3) {
			return false;
		}
		else {
			return true;
		}
	}
	
	private void parseRawInput() {
		
		parsedString = rawInput.split(regex);
	}
	
	private boolean isDouble(String price) 
	{
		try 
		{
			Double.parseDouble(price);
			return true;
		}
		catch(NumberFormatException e) 
		{
			return false;
		}
	}
	
	private boolean isInt(String quantity) 
	{
		try 
		{
			Integer.parseInt(quantity);
			return true;
		}
		catch(NumberFormatException e)
		{
			return false;
		}
	}
	
	public String getName() {
		return itemName;
	}
	
	public double getPrice() {
		return itemPrice;
	}
	
	public int getQuantity() {
		return itemQuantity;
	}
    
}
