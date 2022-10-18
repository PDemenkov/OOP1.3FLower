public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "white";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Russia";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }
    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }
    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor != null || !flowerColor.isBlank() || !flowerColor.isEmpty()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "white";
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null || !country.isEmpty() || !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Russia";
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost =1;
        }
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan > 0 ) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }
}
