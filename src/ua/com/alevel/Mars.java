package ua.com.alevel;

public class Mars implements Planet {
    private static String name = "Mars";
    static double gravityMarsCoeff = 3.7;
    public Mars(){

    }

    public static String getName() {
        return name;
    }

    private double getGravityMarsCoeff() {
        return gravityMarsCoeff;
    }

    @Override
    public double getGravityCoefficient() {
        return getGravityMarsCoeff();
    }
}
