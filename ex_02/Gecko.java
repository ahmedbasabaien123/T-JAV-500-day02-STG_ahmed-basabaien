public class Gecko {
    public String name;
    
    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String newName) {
        name = newName;
        System.out.println("Hello " + name + "!");
    }

}
