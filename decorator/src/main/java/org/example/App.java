package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Nowy posiłek");
        Meal riceMeal = new RiceMeal();
        riceMeal.prepareMeal();

        System.out.println("Nowy posiłek");
        Meal riceMealWithShrimp = new ShrimpMealDecorator(new RiceMeal());
        riceMealWithShrimp.prepareMeal();

        System.out.println("Nowy posiłek");
        Meal potatoMealWithChickenAndSauce = new SauceMealDecorator(new ChickenMealDecorator(new PotatoMeal()));
        potatoMealWithChickenAndSauce.prepareMeal();



    }
}
