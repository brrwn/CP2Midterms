package midterms;
public class Main {
    public static void main(String[] args) {
    	
    //Person	
    	Person[] p = new Person[5];
    			
    	p[0] = new Person("Mary Green", 33, "4059 Ingram Road");
    	p[1] = new Person("Doug Ford", 38, "1015 Elm Drive");
    	p[2] = new Person("Tiffany Covington", 23, "3864 Roosevelt Road");
    	p[3] = new Person("William Kahn", 48, "4025 Maple Street");
    	p[4] = new Person("Emma Rice", 38, "3512 Parkway Street");


    	for(int i = 0; i<p.length; i++) {
        	p[i].display();
    	}
    	
    //Dog
    	Dog[] d = new Dog[2];
    	d[0] = new Dog("\nKoda", "Husky");
    	d[1] = new Dog("Pepper", "Poodle");
    	
    	d[0].setBreed("Siberian Husky");
    	d[1].setName("Velvet");
    	
    	for(int i = 0; i<d.length; i++) {
    		d[i].display();
    	}
    	
    //Rectangle
    	Rectangle r = new Rectangle(10, 20);
    	
    	r.display();
    }
}
 