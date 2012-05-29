package DI;

/**
 * Created by IntelliJ IDEA.
 * User: ascatche
 * Date: 5/28/12
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class LeadDev extends Dev{
    private int yearsOfExperience;

    public LeadDev() {

    }

    public LeadDev(String name, String skillLevel, int yearsOfExperience) {
        this.name = name;
        this.skillLevel = skillLevel;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void printMe(){
        System.out.println("Lead: " + this.getName() + " | skill: " + this.getSkillLevel() + " | YOE: " + this.getYearsOfExperience());
    }
}
