package midterms;
class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
    	this.name = name;
    	this.age = age;
    	this.address = address;
    }
    
    public void display() {
    	System.out.println(name + ", " + age);
    }
}

