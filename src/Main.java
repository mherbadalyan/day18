import models.Person;
import models.Store;
import models.Triangle;
import java.util.Scanner;
import static validator.PersonValidator.*;
import static validator.StoreValidator.*;
import static validator.TriangleValidator.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //task1,2
        String firstName;
        String lastName;
        String passportID;
        int age;
        String gender;
        String nationality;

        while (true) {
            System.out.println("Enter first name in range 3 to 15");
            firstName = scanner.nextLine();
            if (isValidFirstName(firstName)) {
                break;
            } else {
                System.out.println("Invalid first name");
            }
        }

        while (true) {
            System.out.println("Enter last name in range 3 to 15");
            lastName = scanner.nextLine();
            if (isValidLastName(lastName)) {
                break;
            } else {
                System.out.println("Invalid last name");
            }
        }

        while (true) {
            System.out.println("Enter passportId and it must be start with “AN” and contain 6 digits with length 8");
            passportID = scanner.nextLine();
            if (isValidPassportID(passportID)) {
                break;
            } else {
                System.out.println("Invalid passportID");
            }
        }

        while (true) {
            System.out.println("Enter age and it must be in range 18 - 99");
            age = scanner.nextInt();
            if (isValidAge(age)) {
                break;
            } else {
                System.out.println("Invalid age");
            }
        }

        scanner.nextLine();

        while (true) {
            System.out.println("Enter gender and it must be male or female");
            gender = scanner.nextLine();
            if (isValidGender(gender)) {
                break;
            } else {
                System.out.println("Invalid gender");
            }
        }

        System.out.println("Enter nationality");
        nationality = scanner.nextLine();

        Person person1 = new Person(firstName, lastName, passportID, age, gender, nationality);
        person1.display();


        //task3
        int sizeA;
        int sizeB;
        int sizeC;

        while (true) {
            System.out.println("Enter triangle sideA in range from 1 to 20");
            sizeA = scanner.nextInt();
            if (isValidSide(sizeA)) {
                break;
            } else {
                System.out.println("Invalid sideA , try again");
            }
        }

        while (true) {
            System.out.println("Enter triangle sideB in range from 1 to 20");
            sizeB = scanner.nextInt();
            if (isValidSide(sizeB)) {
                break;
            } else {
                System.out.println("Invalid sideB , try again");
            }
        }

        while (true) {
            System.out.println("Enter triangle sideC in range from 1 to 20");
            sizeC = scanner.nextInt();
            if (isValidSide(sizeC)) {
                break;
            } else {
                System.out.println("Invalid sideC , try again");
            }
        }

        Triangle triangle = new Triangle(sizeA, sizeB, sizeC);
        if (!checkTriangle(triangle)) {
            System.out.println("Triangle is not valid");
            return;
        }

        if (isRightTriangle(triangle)) {
            System.out.println("Your triangle is right triangle");
        }

        System.out.println("Area of your triangle = " + triangle.area());


        //task4
        int countOfWorkers;
        int countOfProducts;
        String phoneNumber;
        String storeName;
        String[] products;

        while (true) {
            System.out.println("Enter store name. It must have at least 3 characters");
            storeName = scanner.nextLine();
            if (isValidStoreName(storeName)) {
                break;
            } else {
                System.out.println("Invalid store name,try again");
            }
        }

        while (true) {
            System.out.println("Enter count of workers. It must be in range from 2 to 50");
            countOfWorkers = scanner.nextInt();
            if (isValidCountOfWorkers(countOfWorkers)) {
                break;
            } else {
                System.out.println("Invalid count of workers,try again");
            }
        }

        scanner.nextLine();
        while (true) {
            System.out.println("Enter phone number it must have 8 digits, also can not consist negative digits ");
            phoneNumber = scanner.nextLine();
            if (isValidPhoneNumber(phoneNumber)) {
                break;
            } else {
                System.out.println("Invalid phone number ,try again");
            }
        }

        System.out.println("Enter count of products");
        while (true) {
            countOfProducts = scanner.nextInt();
            if (countOfProducts > 1) {
                break;
            } else {
                System.out.println("Invalid product count, try again");
            }
        }
        products = new String[countOfProducts];
        scanner.nextLine();
        System.out.println("Enter product names");
        for (int i = 0; i < countOfProducts; i++) {
            System.out.println("Name of product " + (i + 1));
            products[i] = scanner.nextLine();
        }

        Store store1 = new Store(countOfWorkers, phoneNumber, storeName, products);
        System.out.println(store1);
    }
}

