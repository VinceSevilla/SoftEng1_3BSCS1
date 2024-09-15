package adapterPattern;

public class ApplianceApp {
    public static void main(String[] args) 
    {
        Laptop laptop = new Laptop();
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger phoneCharger = new SmartphoneCharger();
        PowerOutlet phoneOutlet = new SmartphoneChargerAdapter(phoneCharger);

        System.out.println(laptopOutlet.plugIn());
        System.out.println(fridgeOutlet.plugIn());
        System.out.println(phoneOutlet.plugIn());
    }
}
