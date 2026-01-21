class Passport {
    String name;
    String passportNumber;

    Passport(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Passport Number: " + passportNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        Passport[] passports = {
                new Passport("Rithesh", "P12345"),
                new Passport("Rahul", "P56789"),
                new Passport("Sai", "P99999"),
                new Passport("Kiran", "P88888"),
                new Passport("Arjun", "P77777")
        };

        int n = passports.length;

        
        int pos = 1; 

        System.out.println("Total Passports = " + n);
        System.out.println("Requested Passport = " + pos);

        if (pos >= 1 && pos <= n) {
            System.out.println("\nPassport Details:");
            passports[pos - 1].display();
        } else {
            System.out.println("Invalid passport number! Choose between 1 and " + n);
        }
    }
}
