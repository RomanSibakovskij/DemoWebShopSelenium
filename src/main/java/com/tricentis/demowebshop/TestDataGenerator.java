package com.tricentis.demowebshop;

import org.openqa.selenium.*;

import java.security.SecureRandom;
import java.util.*;

public class TestDataGenerator extends BasePage{

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+-=[]{}|;:,.<>?";

    private static final Random RANDOM = new SecureRandom();

    private static String firstName;
    private static String lastName;
    private static String emailAddress;
    private static String password;

    public TestDataGenerator(WebDriver driver) {super(driver);}

    //first names array
    private static final String[] firstNames = {
            "Aiden", "Olivia", "Liam", "Emma", "Noah", "Ava", "Elijah", "Sophia", "Lucas", "Isabella",
            "Mason", "Mia", "Ethan", "Amelia", "James", "Harper", "Benjamin", "Evelyn", "Jack", "Abigail",
            "Henry", "Ella", "Alexander", "Avery", "Jackson", "Scarlett", "Sebastian", "Grace", "Owen", "Lily",
            "Matthew", "Chloe", "William", "Zoey", "Joseph", "Penelope", "Luke", "Hannah", "Daniel", "Aria",
            "Logan", "Ellie", "David", "Madison", "Samuel", "Nora", "John", "Riley", "Ryan", "Lillian",
            "Leo", "Paisley", "Nathan", "Aurora", "Isaac", "Addison", "Joshua", "Brooklyn", "Caleb", "Leah",
            "Hunter", "Savannah", "Andrew", "Sofia", "Connor", "Lucy", "Carter", "Victoria", "Eli", "Willow",
            "Wyatt", "Violet", "Dylan", "Zoe", "Grayson", "Stella", "Landon", "Hazel", "Gabriel", "Emilia",
            "Jayden", "Claire", "Anthony", "Bella", "Christian", "Maya", "Julian", "Elena", "Aaron", "Piper",
            "Dominic", "Ariana", "Adam", "Ruby", "Evan", "Madelyn", "Nicholas", "Alice", "Isaiah", "Skylar",
            "Thomas", "Eva", "Charles", "Everly", "Christopher", "Naomi", "Miles", "Quinn", "Zachary", "Aubrey",
            "Ezra", "Peyton", "Jeremiah", "Serenity", "Nathaniel", "Isla", "Robert", "Kennedy", "Jonathan", "Cora"
    };

    //last names array
    private static final String[] lastNames = {
            "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
            "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
            "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "King", "Wright",
            "Scott", "Torres", "Nguyen", "Hill", "Flores", "Green", "Adams", "Nelson", "Baker", "Gonzalez",
            "Carter", "Mitchell", "Perez", "Roberts", "Turner", "Phillips", "Campbell", "Parker", "Evans", "Edwards",
            "Collins", "Stewart", "Sanchez", "Morris", "Rogers", "Reed", "Cook", "Morgan", "Bell", "Murphy",
            "Bailey", "Rivera", "Cooper", "Richardson", "Cox", "Howard", "Ward", "Torres", "Peterson", "Gray",
            "Ramirez", "James", "Watson", "Brooks", "Kelly", "Sanders", "Price", "Bennett", "Wood", "Barnes",
            "Ross", "Henderson", "Coleman", "Jenkins", "Perry", "Powell", "Long", "Patterson", "Hughes", "Flores",
            "Washington", "Butler", "Simmons", "Foster", "Gonzales", "Bryant", "Alexander", "Russell", "Griffin", "Diaz",
            "Hayes", "Myers", "Ford", "Hamilton", "Graham", "Sullivan", "Wallace", "Woods", "Cole", "West",
            "Jordan", "Owens", "Reynolds", "Fisher", "Ellis", "Harrison", "Gibson", "McDonald", "Cruz", "Marshall"
    };

    //homepage product names array
    private static final String[] homePageProductNames = {"14.1-inch Laptop", "Build your own cheap computer",
                                                          "Build your own cheap computer", "Build your own expensive computer", "Simple Computer"}; //"$25 Virtual Card" is bugged, its result doesn't appear in search product page

    //product names array
    private static final String[] availableProductNames = {"Health Book", "1MP 60GB Hard Drive Handycam Camcorder", "Camcorder", "High Definition 3D Camcorder",
    "Smartphone", "Used phone", "Phone Cover", "50's Rockabilly Polka Dot Top JR Plus Size", "Blue Jeans", "Custom T-Shirt", "Genuine Leather Handbag with Cell Phone Holder & Many Pockets",
    "Blue and green Sneaker", "Casual Golf Belt", "Green and blue Sneaker", "Denim Short with Rhinestones", "Wool Hat", "Women's Running Shoe", "Sunglasses","Men's Wrinkle Free Long Sleeve",
    "3rd Album", "Music 2", "Create Your Own Jewelry", "Black & White Diamond Heart", "$5 Virtual Gift Card", "$25 Virtual Gift Card", "$50 Physical Gift Card", "$100 Physical Gift Card",
    "Desktop PC with CDRW", "Elite Desktop PC"};

    //random first name picker method
    public static String getRandomFirstName() {
        Random random = new Random();
        String firstName = firstNames[random.nextInt(firstNames.length)];
        return firstName;
    }
    //random last name picker method
    public static String getRandomLastName() {
        Random random = new Random();
        String lastName = lastNames[random.nextInt(lastNames.length)];
        return lastName;
    }

    //generate random string methods
    private static String generateRandomString(String characters, int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    private static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return String.join("", letters);
    }


    //string generator methods
    private static String generateRandomNumberString(int length) {return generateRandomString(DIGITS, length);}

    private static String generateRandomSpecialString(int length) {return generateRandomString(SPECIAL, length);}

    //randomizer (for username) methods
    public static String generateRandomUsername(int length) {return generateRandomString(UPPER + LOWER, length);}

    //random email generator
    public static String generateRandomEmailAddress(int length) {
        String emailAddress = generateRandomString(UPPER + LOWER, length);
        return emailAddress + "@example.com";
    }
    //random password generator
    public static String generateRandomPassword() {
        String numbers = "0123456789";
//        String special = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // fixed password part
        String stokerPart = "Stoker";

        // random numeric sequence
        StringBuilder numericPart = new StringBuilder();
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append(numbers.charAt(RANDOM.nextInt(numbers.length())));
        numericPart.append('_'); // Static underscore

        // shuffle the numeric part
        String shuffledNumericPart = shuffleString(numericPart.toString());

        //"Stoker" + shuffled numeric part
        StringBuilder password = new StringBuilder();
        password.append(stokerPart);
        password.append(shuffledNumericPart);

        return password.toString();
    }

    //random homepage product array item picker method
    public static String pickRandomHomePageFeaturedProduct(){
        Random random= new Random();
        String randomFeaturedProduct = homePageProductNames[random.nextInt(homePageProductNames.length)];
        return randomFeaturedProduct;
    }

    //random available product array item picker method
    public static String pickRandomAvailableProduct(){
        Random random= new Random();
        String randomAvailableProduct = availableProductNames[random.nextInt(availableProductNames.length)];
        return randomAvailableProduct;
    }
}