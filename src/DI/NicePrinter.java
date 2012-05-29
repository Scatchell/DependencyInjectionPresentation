package DI;

public class NicePrinter {
    public NicePrinter() {
    }

    public void printMe(String name, String skillLevel) {
        System.out.println("**********************************************");
        System.out.println("*                                            *");
        System.out.println("*                                            *");
        System.out.println("*             " + name + "         " + skillLevel + "              *");
        System.out.println("*                                            *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");
    }
}
