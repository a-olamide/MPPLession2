package lesson4.template_design_pattern;

public abstract class BeverageMaker {
    public final void makeBeverage() {
        System.out.println("Making Beverage");
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    //Abstract methods to be implemented
    abstract void brew();
    abstract void addCondiments();

    //common methods
    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
