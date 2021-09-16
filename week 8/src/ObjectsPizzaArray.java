import java.text.DecimalFormat;

public class ObjectsPizzaArray {

	public static void main(String[] args) {
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		Pizza[] pizzaArray = 
			{new Pizza("Diavolo", 8.75), new Pizza("Frutti al Mare", 9.00), new Pizza("Alla Pollo", 7.50)};
		
		for(Pizza pizzaObject : pizzaArray) {
			System.out.println(pizzaObject.getName() + " (" + twoDecimals.format(pizzaObject.getPrice()).replace('.', '.') + " euros)");
		}
		

	}

}
