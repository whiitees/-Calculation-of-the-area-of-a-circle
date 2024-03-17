public class Main {
    public static void main(String[] args) {
        double promien = 5;
        double poleKola = obliczPoleKola(promien);
        System.out.println("Pole koła o promieniu " + promien + " to: " + poleKola);
    }

    public static double obliczPoleKola(double promien) {
        double pole = Math.PI * Math.pow(promien, 2);
        return pole;
    }
}
