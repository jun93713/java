public class Dragon extends Mammal{
    public Dragon(){
        energyLevel = 300;
    }

    public void fly(){
        System.out.println("Meow~~~Meow~~~");
        energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("Yummmm~~~Yummmmm~~`");
        energyLevel += 25;
    }

    public void attackTown(){
        System.out.println("Ah~~~  GET THE FIRE DOWN~~ AHHHHHH!!!");
        energyLevel -= 100;
    }
}
