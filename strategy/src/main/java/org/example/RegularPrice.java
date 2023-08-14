package org.example;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {

        if (isSignedUpForNewsletter == false) {
            System.out.println("Normalna cena: "+ price);
        } else {
            System.out.println("Użytkownik nie jest zapisany do " +
                    "newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
