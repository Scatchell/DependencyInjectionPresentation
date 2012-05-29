package DI;

public class VirtualValue {
    private Dev dev;

    public VirtualValue() {
        dev = new JuniorDev("Ryan", "10");
    }

    public void printMe() {
        dev.printMe();
    }
}
