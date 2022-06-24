package chapters.chapter8;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment Shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment Shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        vol = Shipment1.volume();
        System.out.println("Shipment2 vol = " + vol);
        System.out.println("Shipment1 weight = " + Shipment1.weight);
        System.out.println("Cost = " + Shipment1.cost + "$");
        System.out.println();
        vol = Shipment2.volume();
        System.out.println("Shipment2 vol = " + vol);
        System.out.println("Shipment2 weight = " + Shipment2.weight);
        System.out.println("Cost = " + Shipment2.cost + "$");
    }
}
