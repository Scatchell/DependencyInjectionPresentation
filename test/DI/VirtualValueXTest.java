package DI;

import junit.framework.TestCase;

public class VirtualValueXTest extends TestCase {
    public void testPrintMe() throws Exception {
        VirtualValueX vvx = new VirtualValueX();
        NicePrinter np = new NicePrinter();

        DevPrintedNicely dev = new DevPrintedNicely();

        dev.setNp(np);
        dev.setName("Test dev");
        dev.setSkillLevel("20");

        vvx.setDev(dev);

        vvx.printMe();
    }


}
