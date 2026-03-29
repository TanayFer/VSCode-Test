// File: p1/Tool.java
package p1;

public class Tool {
    private String name;
    
    public Tool(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void use() {
        System.out.println("Using tool: " + name);
    }
}