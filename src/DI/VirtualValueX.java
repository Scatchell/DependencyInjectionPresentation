package DI;

public class VirtualValueX {
    private DevPrintedNicely dev;
    
    public VirtualValueX() {
        
    }

    public void setDev(DevPrintedNicely dev) {
        this.dev = dev;
    }

    public void printMe() {
        this.dev.printMe();
    }
}
