public class Test{
    public static void main (String[] args){
        AnimalRegistry reg = new AnimalRegistry();
        Animal sheep = reg.createSheep();
        Animal cow = reg.createCow();
        Animal horse = reg.createHorse();

        ((Sheep) sheep).setName("Saira");
        ((Cow) cow).setSound("Moooooo");
        ((Horse) horse).setColor("Blonde");

        // sheep
        System.out.print(((Sheep) sheep).getName() + " is a " + sheep.getType() + " that sounds like ");
        sheep.makeSound();
        System.out.println();

        // cow      
        System.out.println("This animal is a " + cow.getType() + " that eats " + ((Cow) cow).getFood() + " and sounds like ");
        cow.makeSound();
        System.out.println();

        // horse
        System.out.print("This animal is a " + horse.getType() + " with color of " + ((Horse) horse).getColor() + " and sounds like ");
        horse.makeSound();
        System.out.println();

        // another sheep
        Animal anotherSheep = reg.createSheep();
        ((Sheep) anotherSheep).setName("Julia");   
        System.out.println(((Sheep) anotherSheep).getName() + " is a " + anotherSheep.getType());
        System.out.print(((Sheep) anotherSheep).getName() + " makes sounds ");
        anotherSheep.makeSound();
        System.out.println();
        
    }
}