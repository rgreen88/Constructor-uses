class Machine{
	
	private String name;
	private int code;
	
	
	//constructor
	public Machine(){
		
		//calling third constructor within the first constructor (must be called first to work)
		this("Chalky", 12); //"this" by itself refers  to constructors based on parameter types
		
		//constructor for class Machine
		System.out.println("First Constructor Running!");
		
		//can use constructors to set default values
		name = "Arnie";
	}
	
	//adding constructor with String param
	public Machine (String name){
		this("Chalker", 1); //calling own constructor in itself causes a recursive loop
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	//another constructor with 2 params
	public Machine (String name, int code){
		
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
	
}
public class App {

	public static void main(String[] args) {

		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Bertie");	
		Machine machine3 = new Machine("Bertie", 1);
	}

}
