package org.example;

public class SauceMealDecorator extends MealDecorator{
    public SauceMealDecorator(Meal meal) {
        super(meal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addSaucńe();
    }

    private void addSaucńe() {
        System.out.println("Do dania dodaję sos.");
    }
}
