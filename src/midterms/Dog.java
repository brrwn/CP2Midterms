package midterms;

class Dog {
	String name;
	String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void display() {
		System.out.println(name + ", " + breed);
	}
}
