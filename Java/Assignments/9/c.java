class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

class Employee extends Person {
    public Employee(String name) {
        super(name);
    }
}