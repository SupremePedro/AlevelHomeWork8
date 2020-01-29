package ua.com.alevel;

public class PlanetReporter {
    Planet planet;

    public PlanetReporter(Planet planet) {
        this.planet = planet;
    }
    public String getPlanetReport(){
         String rep = planet.getClass() +" has " + planet.getGravityCoefficient() + "m/c^2";
        return rep.replaceAll(".*alevel.","");
    }

    public static void main(String[] args) {
        PlanetReporter earthReport = new PlanetReporter(new Earth());
        PlanetReporter marsReport = new PlanetReporter(new Mars());
        System.out.println(earthReport.getPlanetReport());
        System.out.println(marsReport.getPlanetReport());
    }
}
