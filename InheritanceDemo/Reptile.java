package InheritanceDemo;

public class Reptile extends Animal{
    private boolean hasScales;
    private boolean livesInWater;
    private boolean canSlither;
    private boolean isVenemous;

    public Reptile(){
        super(true, 4, "Carnivore" );

    }

    public Reptile(boolean hasScales, boolean livesInWater){
        super(true, 4, "Carnivore");
    }

    public Reptile(boolean canSlither){
        super(true,0,"Omnivore");
        this.isVenemous = true;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public boolean isLivesInWater() {
        return livesInWater;
    }

    public void setLivesInWater(boolean livesInWater) {
        this.livesInWater = livesInWater;
    }

    public boolean isCanSlither() {
        return canSlither;
    }

    public void setCanSlither(boolean canSlither) {
        this.canSlither = canSlither;
    }

    public boolean isVenemous() {
        return isVenemous;
    }

    public void setVenemous(boolean venemous) {
        isVenemous = venemous;
    }
}
