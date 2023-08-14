package org.example;

public class SalePrice implements PricingStrategy{
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if (isSignedUpForNewsletter) {
            System.out.println("Przecena:: "+ price/2);
        } else {
            System.out.println("Użytkownik zapisany do " +
                    "newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
