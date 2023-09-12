import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Hotel[] array = new Hotel[4];
        System.out.println("#HOTEL#");
        array[0] = new Hotel("chyngyz😎😎😎😎😎", 16);
        array[1] = new Hotel("nursultanಥ_ಥ", 16);
        array[2] = new Hotel("ahror", 16);
        array[3] = new Hotel("70l1ka0", 16);
        System.out.println(Arrays.toString(array));
        hotel.Family();
        System.out.println("==================================");
        Dormitory dormitory = new Dormitory();
        Dormitory[] array1 = new Dormitory[3];
        System.out.println("#DORMITORY#");
        array1[0] = new Dormitory("baijigit👽",15);
        array1 [1] = new Dormitory("Chyngyz",16);
        array1[2] = new Dormitory("amantur",14);
        System.out.println(Arrays.toString(array1));
        dormitory.Family();
        System.out.println("==================================");
        Apartment apartment = new Apartment();
        Apartment []array2 = new Apartment[5];
        System.out.println("#APARTMENT#");
        array2 [0] = new  Apartment("aydar",20);
        array2 [1] = new Apartment("bobur",16);
        array2 [2] = new Apartment("nurdolot",16);
        array2 [3] = new Apartment("bobur",12);
        array2 [4] = new Apartment("bibur",11);
        System.out.println(Arrays.toString(array2));
        apartment.Family();
    }
}