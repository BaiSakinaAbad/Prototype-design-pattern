public class Sheep implements Animal{
private Integer legs;
private String sound;
private String food;
private String name;

  public Sheep() {
        this.legs = 4;
        this.sound = "baa... Baa... BAAAAAAA";
        this.food = "Grass";
        this.name = "";
    }

    public Sheep(Sheep sheep) {
        this.legs = sheep.legs;
        this.sound = sheep.sound;
        this.food = sheep.food;
        this.name = sheep.name;
    }
    @Override
    public Animal clone() {
        return new Sheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(this.sound);
    }

    @Override
    public String getType() {
        return "Sheep";

    }
// Getters and setters for the properties
public Integer getLegs() {
    return legs;
}
public void setLegs(Integer legs) {
    this.legs = legs;
}
public String getSound() {
    return sound;
}
public void setSound(String sound) {
    this.sound = sound;
}
public String getFood() {
    return food;
}
public void setFood(String food) {
    this.food = food;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
}