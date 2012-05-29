package DI;

public class VirtualValueEvenBetter {
    private Dev dev;

    private static VirtualValueEvenBetter VEB = new VirtualValueEvenBetter();

    private VirtualValueEvenBetter() {}

    public static synchronized VirtualValueEvenBetter instanceOf(){
        return VEB;
    }
    
    public VirtualValueEvenBetter(Dev dev) {
        this.dev = dev;
    }

    public void setDev(Dev dev) {
        this.dev = dev;
    }


    public void printMe() {
        this.dev.printMe();
    }

}
