package DI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VirtualValueUnstoppable {
    private List<Dev> container = new ArrayList<Dev>();



    public VirtualValueUnstoppable(List<Dev> container) {
        this.container = container;
    }

    public void printAll() {
        for (Iterator<Dev> iterator = container.iterator(); iterator.hasNext(); ) {
            Dev next = iterator.next();
            next.printMe();
        }
    }
}
