package validator;

import models.*;

public class TriangleValidator {

    /**
     * checking is side in range from 1 to 20
     *
     * @param side
     * @return
     */
    public static boolean isValidSide(int side) {
        return (side >= 1 && side <= 20);
    }

    public static boolean checkTriangle(Triangle triangle) {
        return (triangle != null && isValidTriangle(triangle));
    }

    /**
     * checking is given triangle valid
     *
     * @param triangle
     * @return
     */
    private static boolean isValidTriangle(Triangle triangle) {
        if (triangle == null) return false;
        if (triangle.getSideA() + triangle.getSideB() <= triangle.getSideC()) return false;
        if (triangle.getSideA() + triangle.getSideC() <= triangle.getSideB()) return false;
        return triangle.getSideC() + triangle.getSideB() > triangle.getSideA();
    }

    /**
     * checking is given triangle right
     *
     * @param triangle
     * @return
     */
    public static boolean isRightTriangle(Triangle triangle) {
        int max = Math.max(Math.max(triangle.getSideA(), triangle.getSideB()), triangle.getSideC());
        int min = Math.min(Math.min(triangle.getSideA(), triangle.getSideB()), triangle.getSideC());
        int mid = triangle.getSideA() + triangle.getSideB() + triangle.getSideC() - max - min;
        return (Math.pow(max, 2) == Math.pow(min, 2) + Math.pow(mid, 2));
    }

}
