package DI;

/**
 * Created by IntelliJ IDEA.
 * User: ascatche
 * Date: 5/28/12
 * Time: 4:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class JuniorDev extends Dev {
    public JuniorDev() {

    }

    public JuniorDev(String name, String skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }


    @Override
    public void printMe() {
        System.out.println("JC: " + this.getName() + " | skill: " + this.getSkillLevel());
    }
}
