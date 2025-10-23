package Unidad02.Actividad01;

public class Package {
    String trackingCode;
    double weight;

    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    public void showPackage() {
        System.out.println("Tracking Code: " + trackingCode + ", Weight: " + weight + " kg");
    }
}
