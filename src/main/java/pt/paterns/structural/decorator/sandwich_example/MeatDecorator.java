package pt.paterns.structural.decorator.sandwich_example;

public class MeatDecorator extends SandwichDecorator{

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + turkey";
    }

}
