package Lab1;

public class Model {
    // attributes
    private String firstName;
    private String lastName;
    private int heightInches;
    private double weightPounds;
    private boolean canTravel;
    private boolean smokes;
    private static String  OCCUPATION = "modeling";

    // constructor
    public Model(String firstName, String lastName, int heightInches, double weightPounds, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
        setCanTravel(canTravel);
        this.smokes = smokes;
    }

    // methods
    public final void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    public final void setFirstName(String firstName) {
        if((firstName!= null) && (firstName.length() >= 3) && (firstName.length() <= 20)) {
            this.firstName = firstName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public double getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(double weightPounds) {
        this.weightPounds = weightPounds;
    }

    public boolean isCanTravel() {
        return canTravel;
    }

    public boolean isSmokes() {
        return smokes;
    }

    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInches() + " inches");
        System.out.println("Weight: " + Math.round(getWeightPounds()) + " pounds");
        if(canTravel == true){
            System.out.println("Does travel ");
        }else{
            System.out.println("Does not travel ");
        }
        if(smokes == true){
            System.out.println("Does smoke ");
        }else{
            System.out.println("Does not smoke ");
        }
    }
}
