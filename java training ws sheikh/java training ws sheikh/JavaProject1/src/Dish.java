import java.util.Arrays;
import java.util.List;

public class Dish {

	public enum Type{
		MEAT,FISH,OTHER
	}
	
	private String name;
	private boolean vegetarian;
	private int calories;
	private Type type;
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return name;
	}
	
	public static final List<Dish> menu = Arrays.asList(
			new Dish("panner", true, 150, Type.OTHER),
			new Dish("chicken", false, 200, Type.MEAT),
			new Dish("mutton", false, 430, Type.MEAT),
			new Dish("bhindi", true, 110, Type.OTHER),
			new Dish("DOSA", true, 450, Type.OTHER),
			new Dish("fish", false, 220, Type.FISH)
			); 
	
	public static int compareByName (Dish obj1, Dish obj2) {
		String name1 = obj1.getName();
		String name2 = obj2.getName();
		return name1.compareTo(name2);
	}
	
	
	
}
