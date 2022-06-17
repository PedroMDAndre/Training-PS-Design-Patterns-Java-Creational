package pt.paterns.structural.decorator.sandwich_example;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    protected SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    @Override
    public String make() {
        return customSandwich.make();
    }
}
