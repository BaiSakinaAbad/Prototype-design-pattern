public class Horse implements Animal {
//     - legs: Integer
// - sound: String
// - food: String
// - color: String

private Integer legs;
private String sound;
private String food;
private String color;

  public Horse() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.color = "";
    }

    public Horse(Horse horse) {
        this.legs = horse.legs;
        this.sound = horse.sound;
        this.food = horse.food;
        this.color = horse.color;
    }

@Override
public Animal clone() {
    return new Horse(this);
}
@Override
public void makeSound() {
    System.out.println("Neighhhhh");
}
@Override
public String getType() {
    return "Horse";
}
//setters and getters 
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
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}

}

