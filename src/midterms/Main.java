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
        	System.out.println(p[i].name + ", " + p[i].age + ", " + p[i].address);
    	}
    	
    //Dog
    	Dog d1 = new Dog("Koda", "Husky");
    	Dog d2 = new Dog("Pepper", "Poodle");
    	
    	d1.setBreed("Siberian Husky");
    	d2.setName("Velvet");
    	
    	System.out.println(d1.getName() + ", " + d1.getBreed());
    	System.out.println(d2.getName() + ", " + d2.getBreed());
    	
    //Rectangle
    	Rectangle r = new Rectangle(10, 20);
    	
    	System.out.println("\nArea of a Rectangle = " + r.getArea());
    	System.out.println("Perimeter of a Rectangle = " + r.getPerimeter());
    }
}
 