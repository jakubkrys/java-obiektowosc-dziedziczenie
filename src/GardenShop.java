public class GardenShop {

    private Flower[] flowers = new Flower[10];
    private int flowerIndex = 0;
    private Fertilizer[] fertilizers = new Fertilizer[10];
    private int fertilizerIndex = 0;
    private Cloth[] clothes = new Cloth[10];
    private int clothIndex = 0;

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

    public void addCloth(Cloth cloth){
        if (clothIndex < clothes.length){
            clothes[clothIndex++] = cloth;
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
        for (int i = 0; i < clothIndex; i++) {
            Cloth cloth = clothes[i];
            System.out.println(cloth.getName());
            System.out.println(cloth.getPrice());
            System.out.println(cloth.getSize());
        }
    }
}
