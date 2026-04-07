public class Cow implements Animal {

private Integer legs;
private String sound;
private String food;

public Cow(){
    this.legs = 4;
    this.sound = "Moo MOO MOOOOOO!";
    this.food = "Grass";
}

@Override
public Animal clone() {
    return new Cow();
}
@Override
public void makeSound() {
   System.out.println("Moo MOO MOOOOOO!");
}
@Override
public String getType() {
    return "Cow";
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
}