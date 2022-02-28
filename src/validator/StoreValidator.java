package validator;

import models.Store;

public class StoreValidator {

    /**
     * checking is store name is valid
     *
     * @param name
     * @return
     */
    public static boolean isValidStoreName(String name) {
        return (name != null && name.length() > 2);
    }


    /**
     * checking is count of workers is valid
     *
     * @param countOfWorkers
     * @return
     */
    public static boolean isValidCountOfWorkers(int countOfWorkers) {
        return (countOfWorkers >= 2 && countOfWorkers <= 50);
    }

    /**
     * checking is store name is valid
     *
     * @param phoneNumber
     * @return
     */
    public static boolean isValidPhoneNumber(String phoneNumber) {
        return (phoneNumber != null && phoneNumber.length() == 8 && isNum(phoneNumber));
    }

    /**
     * checking is given String num
     *
     * @param num
     * @return
     */
    private static boolean isNum(String num) {
        for (int i = 0; i < 8; i++) {
            if (!(num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }


}
