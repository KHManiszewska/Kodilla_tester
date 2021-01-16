public class UsersMain {
    public static void main(String[] args) {

        User userBasia = new User("Basia", 27, 153);
        User userZosia = new User("Zosia", 33, 184.5);
        User userKasia = new User("Kasia", 44, 162.5);
        User userTeofil = new User("Teofil", 45, 157);
        User userWojtek = new User("Wojtek", 51, 177.5);
        User userAdam = new User("Adam", 40.5, 178);

        User[] users = new User[6];
        users[0] = userBasia;
        users[1] = userZosia;
        users[2] = userKasia;
        users[3] = userTeofil;
        users[4] = userWojtek;
        users[5] = userAdam;

        double aveAgeUsers = 0.00;
        double sumUpAgeUsers = 0;

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
    private static double sumUp(double a, double b) {
        double result = a + b;
        return result;
    }
}
