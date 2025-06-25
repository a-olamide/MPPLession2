package lesson4.template_design_pattern.ext;

import lesson4.template_design_pattern.BeverageMaker;
import lesson4.template_design_pattern.CofeeMaker;
import lesson4.template_design_pattern.TeaMaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making Cofee");
        BeverageMaker beverageMaker = new CofeeMaker();
        beverageMaker.makeBeverage();
        System.out.println("Making Tea");
        BeverageMaker beverageMaker2 = new TeaMaker();
        beverageMaker2.makeBeverage();
    }
}
