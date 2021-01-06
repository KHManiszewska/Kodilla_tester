public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[5];
        String animal;
        int numberOfElements = animals.length;
        animals[0] = "piesek";
        animals[1] = "kotek";
        animals[2] = "myszka";
        animals[3] = "rybka";
        animals[4] = "ptaszek";
        animal = animals[3];
        System.out.println(animal);
        System.out.println("Moja tablica zawiera "+numberOfElements+" elementów");
    }
}
