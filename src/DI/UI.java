package DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import java.util.ArrayList;
import java.util.List;

public class UI {
    public static void main(String[] args) {
        UI ui = new UI();

        //ui.noInjection();
        //ui.noInjectionButFlexible();
        //ui.dependencyInjectionWithoutSpring();
        //ui.usingSpring();
        ui.dependencyInjectionUsingContainer();
    }

    public void noInjection() {
        VirtualValue vv = new VirtualValue();

        vv.printMe();
    }

    public void noInjectionButFlexible() {
        VirtualValueBetter vvb = new VirtualValueBetter('l');

        vvb.printMe();
    }

    public void dependencyInjectionWithoutSpring() {
        Dev ryan = new JuniorDev("Ryan", "10");
        Dev Kurman = new LeadDev("Kurman", "omg", 10);

        VirtualValueEvenBetter vveb = VirtualValueEvenBetter.instanceOf();

        vveb.setDev(ryan);
        vveb.printMe();


        vveb.setDev(Kurman);
        vveb.printMe();
    }

    public void usingSpring() {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        JuniorDev a = (JuniorDev) factory.getBean("juniorDev");
        LeadDev b = (LeadDev) factory.getBean("leadDev");

        a.printMe();
        a.setName("Vlad");
        a.setSkillLevel("-10000");

        a = (JuniorDev) factory.getBean("juniorDev");
        a.printMe();

        b.printMe();
    }

    public void dependencyInjectionUsingContainer() {
        Dev ryan = new JuniorDev("Ryan", "10");
        Dev Kurman = new LeadDev("Kurman", "omg", 10);

        List<Dev> devs = new ArrayList<Dev>();
        devs.add(ryan);
        devs.add(Kurman);
        VirtualValueUnstoppable vvu2 = new VirtualValueUnstoppable(devs);

        vvu2.printAll();
    }


}
