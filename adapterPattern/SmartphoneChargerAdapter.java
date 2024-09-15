package adapterPattern;

public class SmartphoneChargerAdapter implements PowerOutlet 
{
    private SmartphoneCharger smartphoneCharger;

    public SmartphoneChargerAdapter(SmartphoneCharger smartphoneCharger) 
    {
        this.smartphoneCharger = smartphoneCharger;
    }

    @Override
    public String plugIn() 
    {
        return smartphoneCharger.chargePhone();
    }
}
