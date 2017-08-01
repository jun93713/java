public class Gorilla extends Mammal {
    public void throww(){
        System.out.println("the gorilla throws a rock towords visitors");
        energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("Gorilla eats a lot bananas and feels GOOD");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("the gorilla climbs up a tree");
        energyLevel -= 10;
    }
}
