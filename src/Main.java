public class Main {
    public static void main(String[] args) {
        Flower roza = new Flower(null, "Holland", 35.59);
        Flower chr = new Flower(null, null, 15, 5);
        Flower pion = new Flower(null, "England", 69.9, 1);
        Flower hyps = new Flower(null, "Turkey", 19.5,10);
        printInfo(roza);
        printInfo(chr);
        printInfo(pion);
        printInfo(hyps);

        printCalculateCost(
                roza,roza,roza,
                chr,chr,chr,chr,chr,
                hyps
        );
    }

    private static void printInfo(Flower flower) {
        System.out.println(
                "Цвет: " + flower.getFlowerColor() +
                        ", Страна " + flower.getCountry() +
                        ", стоимость за штуку: " + flower.getCost() +
                        ", срок стояния цветка: " + flower.lifeSpan
        );
    }

    public static void printCalculateCost(Flower... flowers) {
        double totalCost=0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            printInfo(flower);
        }
        totalCost = totalCost*1.1;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }
}