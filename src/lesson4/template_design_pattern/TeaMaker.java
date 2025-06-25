package lesson4.template_design_pattern;

public class TeaMaker extends BeverageMaker{
    @Override
    void brew() {
        System.out.println("Tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea add condiments");
    }
}
