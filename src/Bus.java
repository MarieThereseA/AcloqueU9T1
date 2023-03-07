public class Bus extends Vehicle {
    private boolean hasUsbPorts;
    public Bus (String name, int wheels, boolean hasUsb){
        super(name, wheels);
        this.hasUsbPorts = hasUsb;
    }

    public boolean getHasUsbPorts(){
        return hasUsbPorts;
    }

    public void announceNextStop(){
        System.out.println("The next stop is: Church Ave/Flatbush Ave");
    }
}
