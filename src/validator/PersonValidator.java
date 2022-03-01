package validator;

public class PersonValidator {
    /**
     * checking is first name in range from 3 to 15
     *
     * @param firstName
     * @return
     */
    public static boolean isValidFirstName(String firstName) {
        return (firstName != null && firstName.length() >= 3 && firstName.length() <= 15);
    }

    /**
     * checking is last name in range from 6 to 20
     *
     * @param lastName
     * @return
     */
    public static boolean isValidLastName(String lastName) {
        return (lastName != null && lastName.length() >= 6 && lastName.length() <= 20);
    }

    /**
     * checking is age in range from 18 to 99 years
     *
     * @param age
     * @return
     */
    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }

    /**
     * checking is given gender valid
     *
     * @param gender
     * @return
     */
    public static boolean isValidGender(String gender) {
        return (gender != null && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")));
    }

    /**
     * checking is given passportID valid
     *
     * @param passportID
     * @return
     */
    public static boolean isValidPassportID(String passportID) {
        return (passportID != null && passportID.length() == 8 && passportID.startsWith("AN") && isNum(passportID.substring(2)));
    }

    /**
     * checking is given String num
     *
     * @param num
     * @return
     */
    private static boolean isNum(String num) {
        if (num == null) {
            return false;
        }
        int size = num.length();
        for (int i = 0; i < size; i++) {
            if (!(num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

}
