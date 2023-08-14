package org.example;

public class FlightLeg {

    private final String form;
    private final String to;
    private boolean delayed;
    private int price;

    public FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.form = flightLegBuilder.form;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "form='" + form + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    public static class FlightLegBuilder {
        private String form;
        private String to;
        private boolean delayed = false;
        private int price;

        public FlightLegBuilder(String form, String to) {
            this.form = form;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder price(int price){
            this.price = price;
            return this;
        }

        public FlightLeg build(){
            if (this.price == 0){
                throw new IllegalStateException("Braaak wymaganego pola: cena");
            }
            return new FlightLeg(this);
        }

    }
}
