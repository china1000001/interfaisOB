public class Hotel implements Human{
    private String name;
    private int age;

    public Hotel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void Family() {
        System.out.println("live in a hotel 4 people");
    }

    public Hotel() {
    }

    @Override
    public String toString() {
        return
                "name= " + name + "\n" +
                "age= " + age +"\n";
    }
}
