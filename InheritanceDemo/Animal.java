package InheritanceDemo;

public class Animal {
    protected boolean isDangerous;
    protected int numberOfLegs;
    protected String diet;

    public Animal(boolean isDangerous, int numberOfLegs, String diet){
        this.isDangerous = isDangerous;
        this.numberOfLegs = numberOfLegs;
        this.diet = diet;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void makeNoise(){
        System.out.print("Animal Class: Make noise - ");
    }

    public void eat(){
        System.out.print("Eating - ");
    }


}
