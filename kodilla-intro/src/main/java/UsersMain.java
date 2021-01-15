public class UsersMain {
    public static void main(String[] args) {

        User userBasia = new User("Basia", 27);
        User userZosia = new User("Zosia", 33);
        User userKasia = new User("Kasia", 44);
        User userTeofil = new User("Teofil", 45);
        User userWojtek = new User("Wojtek", 51);

        User[] users = new User[5];
        users[0] = userBasia;
        users[1] = userZosia;
        users[2] = userKasia;
        users[3] = userTeofil;
        users[4] = userWojtek;

        double aveAgeUsers = 0.00;
        int sumUpAgeUsers = 0;

        for (int i = 0; i < users.length; i++) {
            sumUpAgeUsers = sumUp(sumUpAgeUsers, users[i].age);
        }
        aveAgeUsers = sumUpAgeUsers / users.length;

        System.out.println("Użytkownicy poniżej wieku średniego - "+aveAgeUsers+":");

        for (int i = 0; i < users.length; i++) {
            if (users[i].age<aveAgeUsers){
                System.out.println(users[i].name);
            }
        }
    }
    private static int sumUp(int a, int b) {
        int result = a + b;
        return result;
    }
}
