public class GardenShop {

    private Flower[] flowers = new Flower[10];
    private int flowerIndex = 0;
    private Fertilizer[] fertilizers = new Fertilizer[10];
    private int fertilizerIndex = 0;

    public void addFlower(Flower flower){
        if (flowerIndex < flowers.length){
            flowers[flowerIndex++] = flower;
        }
    }

    public void addFertilizer(Fertilizer fertilizer){
        if (fertilizerIndex < fertilizers.length){
            fertilizers[fertilizerIndex++] = fertilizer;
        }
    }

    public void displayAll() {
        for (int i = 0; i < flowerIndex; i++) {
            Flower flower = flowers[i];
            System.out.println(flower.getName());
            System.out.println(flower.getPrice());
            System.out.println(flower.getType());
        }
        for (int i = 0; i < fertilizerIndex; i++) {
            Fertilizer fertilizer = fertilizers[i];
            System.out.println(fertilizer.getName());
            System.out.println(fertilizer.getPrice());
            System.out.println(fertilizer.getPurpose());
        }
    }
}
