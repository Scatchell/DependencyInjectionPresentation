package DI;

public class DevPrintedNicely extends Dev{
    NicePrinter np;
    private String name;
    private String skillLevel;

    public DevPrintedNicely() {
    }

    public void setNp(NicePrinter np) {
        this.np = np;
    }

    public String getName() {
        return name;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void printMe() {
        np.printMe(this.getName(), this.getSkillLevel());
    }
    
}
