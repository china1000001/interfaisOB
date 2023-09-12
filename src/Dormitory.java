public class Dormitory implements Human {
    private String name;
    private int age;

    public Dormitory(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dormitory() {
    }

    @Override
    public void Family() {
        System.out.println("live in a dormitory 3 people");
    }
    @Override
    public String toString() {
        return
                "name= " + name + "\n" +
                "age= " + age +"\n";
    }
}
