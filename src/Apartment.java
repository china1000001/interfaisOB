public class Apartment implements Human{
    private String name;
    private int age;

    public Apartment(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void Family() {
        System.out.println("live in a apartment 5 people");
    }

    public Apartment() {
    }

    @Override
    public String toString() {
        return
                "name= " + name + "\n" +
                "age= " + age +"\n";
    }
}
