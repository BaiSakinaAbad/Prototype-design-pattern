public class AnimalRegistry{
    private Sheep sheepProto;
    private Cow cowProto;
    private Horse horseProto;

    public AnimalRegistry(){
        sheepProto = new Sheep(null, null, null, null);
        cowProto = new Cow(null, null, null);
        horseProto = new Horse(null, null, null, null);
    }

    public Animal createSheep() {
        return sheepProto.clone();
    }

    public Animal createCow() {
        return cowProto.clone();
    }

    public Animal createHorse() {
        return horseProto.clone();
    }
}