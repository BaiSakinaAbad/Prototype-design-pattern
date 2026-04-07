public class AnimalRegistry{
    private Sheep sheepProto;
    private Cow cowProto;
    private Horse horseProto;

    public AnimalRegistry(){
        this.sheepProto = new Sheep();
        this.cowProto = new Cow();
        this.horseProto = new Horse();
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

    public void setSheepProto(Sheep sheepProto) {
        this.sheepProto = sheepProto;
    }
    public void setCowProto(Cow cowProto) {
        this.cowProto = cowProto;
    }
    public void setHorseProto(Horse horseProto) {
        this.horseProto = horseProto;
    }
}