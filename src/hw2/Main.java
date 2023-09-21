package hw2;


public class Main {
    public static void main(String[] args) {
        Geo geo = new Geo("23.322","44.3322");

        Address address = new Address("Bandery St", "iDonNow", "Lviv", "30023", geo);

        Company company = new Company("Okten", "web", "bs");

        User user = new User(1, "Kokos", "kokos", "koks@okten.web", address, "0673381212", "owu.com.ua", company);

        System.out.println(user);
    }

}