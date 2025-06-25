package lesson4.template_design_pattern;

public class CofeeMaker extends BeverageMaker {

    @Override
    void brew() {
        System.out.println("Brewing Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Condiments for Coffee");
    }
}
