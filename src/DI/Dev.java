package DI;

/**
 * Created by IntelliJ IDEA.
 * User: ascatche
 * Date: 5/28/12
 * Time: 4:06 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Dev {
    public String name;
    public String skillLevel;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public abstract void printMe();
}
