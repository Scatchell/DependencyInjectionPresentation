package DI;

public class VirtualValueBetter {
    private Dev dev;

    public VirtualValueBetter(char typeOfDev) {
        switch (typeOfDev) {
            case 'j':
                dev = new JuniorDev("Ryan", "10");
            break;
            case 'l':
                dev = new LeadDev("Kurman", "omg", 10);
            break;
        }
    }

    public void printMe() {
        dev.printMe();
    }
}
