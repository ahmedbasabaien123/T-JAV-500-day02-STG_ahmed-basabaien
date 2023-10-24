public class Gecko {
    private String name;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String newName) {
        name = newName;
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return name;
    }
}
