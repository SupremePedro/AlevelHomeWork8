package ua.com.alevel;

public class Earth implements Planet{
    private static String name ="Earth";
    double gravityEarthCoeff = 9.8;

    public Earth() {
    }

    public String getName() {
        return name;
    }

    private double getGravityEarthCoeff() {
        return gravityEarthCoeff;
    }


    @Override
    public double getGravityCoefficient() {
        return getGravityEarthCoeff();
    }
}
