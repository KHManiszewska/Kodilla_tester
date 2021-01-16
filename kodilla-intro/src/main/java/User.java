public class User {
    String name;
    double age;
    double height;
    private int size;

    public User (String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkProfile() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}
